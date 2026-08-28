package com.mojang.renderpearl.backend.api;

import com.mojang.renderpearl.api.GpuFormat;
import com.mojang.renderpearl.api.pipeline.BindGroupLayout;
import com.mojang.renderpearl.api.pipeline.ColorTargetState;
import com.mojang.renderpearl.api.pipeline.DepthStencilState;
import com.mojang.renderpearl.api.pipeline.PolygonMode;
import com.mojang.renderpearl.api.pipeline.PrimitiveTopology;
import com.mojang.renderpearl.util.UncheckedAutoCloseable;
import java.util.List;
import org.jspecify.annotations.Nullable;

public interface BackendRenderPipeline extends UncheckedAutoCloseable {
   boolean isClosed();

   public static record CreateInfo(
      String name,
      List<BackendRenderPipeline.CreateInfo.Shader> shaders,
      List<BackendRenderPipeline.CreateInfo.VertexBuffer> vertexBuffers,
      List<BackendRenderPipeline.CreateInfo.AttribBinding> attribBindings,
      List<BindGroupLayout.UniformDescription> uniforms,
      int pushConstantsSize,
      @Nullable DepthStencilState depthStencilState,
      PolygonMode polygonMode,
      boolean cull,
      List<ColorTargetState> colorTargetStates,
      PrimitiveTopology primitiveTopology
   ) {
      public static record AttribBinding(int bufferSlot, int location, int offset, GpuFormat format) {
      }

      public static record Shader(String name, String entryPoint, SpvModule module) {
      }

      public static record VertexBuffer(int bufferSlot, int stride, int stepRate) {
      }
   }

   @FunctionalInterface
   public interface Pending {
      BackendRenderPipeline.Pending NULL = () -> null;

      @Nullable
      BackendRenderPipeline finishCompile();
   }
}
