package com.tianjin.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: cls
 * @date: 2020/5/1 21:43
 */
@Controller
public class HelloController {

    @GetMapping("/abc")
    public String hello(Model model){
        model.addAttribute("msg", "你好");
        return "success";
    }
}
