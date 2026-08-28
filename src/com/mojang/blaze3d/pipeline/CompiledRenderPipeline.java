package com.mojang.blaze3d.pipeline;

@fic
public interface CompiledRenderPipeline {
   boolean containsUniform(String var1);

   boolean isValid();
}
