package com.mojang.renderpearl.backend.opengl;

import com.mojang.renderpearl.api.GpuFormat;
import com.mojang.renderpearl.util.UncheckedAutoCloseable;

public sealed interface Uniform extends UncheckedAutoCloseable permits Uniform.InputAttachment, Uniform.Sampler, Uniform.Ubo, Uniform.Utb {
   @Override
   default void close() {
   }

   record InputAttachment(int samplerIndex) implements Uniform {
   }

   record Sampler(int samplerIndex) implements Uniform {
   }

   record Ubo(int blockBinding) implements Uniform {
   }

   record Utb(GlStateManager stateManager, int samplerIndex, GpuFormat format, int texture) implements Uniform {
      public Utb(final GlStateManager stateManager, final int samplerIndex, final GpuFormat format) {
         this(stateManager, samplerIndex, format, stateManager._genTexture());
      }

      @Override
      public void close() {
         this.stateManager._deleteTexture(this.texture);
      }
   }
}
