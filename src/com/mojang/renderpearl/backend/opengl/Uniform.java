package com.mojang.renderpearl.backend.opengl;

import com.mojang.renderpearl.api.GpuFormat;
import com.mojang.renderpearl.util.UncheckedAutoCloseable;

public sealed interface Uniform extends UncheckedAutoCloseable permits Uniform.Sampler, Uniform.Ubo, Uniform.Utb {
   @Override
   default void close() {
   }

   record Sampler(int samplerIndex) implements Uniform {
   }

   record Ubo(int blockBinding) implements Uniform {
   }

   record Utb(int samplerIndex, GpuFormat format, int texture) implements Uniform {
      public Utb(final int samplerIndex, final GpuFormat format) {
         this(samplerIndex, format, GlStateManager._genTexture());
      }

      @Override
      public void close() {
         GlStateManager._deleteTexture(this.texture);
      }
   }
}
