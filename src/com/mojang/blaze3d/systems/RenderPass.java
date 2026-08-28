package com.mojang.blaze3d.systems;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.Collection;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

@fic
public interface RenderPass extends AutoCloseable {
   void setPipeline(RenderPipeline var1);

   void bindSampler(String var1, GpuTexture var2);

   void setUniform(String var1, int... var2);

   void setUniform(String var1, float... var2);

   void setUniform(String var1, Matrix4f var2);

   void enableScissor(ScissorState var1);

   void enableScissor(int var1, int var2, int var3, int var4);

   void disableScissor();

   void setVertexBuffer(int var1, GpuBuffer var2);

   void setIndexBuffer(GpuBuffer var1, VertexFormat.a var2);

   void drawIndexed(int var1, int var2);

   void drawMultipleIndexed(Collection<RenderPass.a> var1, @Nullable GpuBuffer var2, @Nullable VertexFormat.a var3);

   void draw(int var1, int var2);

   @Override
   void close();

   public static record a(int a, GpuBuffer b, @Nullable GpuBuffer c, @Nullable VertexFormat.a d, int e, int f, @Nullable Consumer<RenderPass.b> g) {
      public a(int $$0, GpuBuffer $$1, GpuBuffer $$2, VertexFormat.a $$3, int $$4, int $$5) {
         this($$0, $$1, $$2, $$3, $$4, $$5, null);
      }
   }

   public interface b {
      void upload(String var1, float... var2);
   }
}
