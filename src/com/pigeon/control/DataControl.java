package com.pigeon.control;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DataControl {
	//data_collector
	@RequestMapping(value = "/data", method = RequestMethod.POST)
	public void dataCollect(HttpServletRequest request, HttpServletResponse response)throws IOException{
		String aaa = request.getParameter("aaa");
		response.getWriter().append("i receive post: "+aaa);
	}
	
	//data_checker
	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public void dataCheck(HttpServletRequest request, HttpServletResponse response)throws IOException{
		String aaa = request.getParameter("aaa");
		response.getWriter().append("i receive get: "+aaa);
	}
	
}
