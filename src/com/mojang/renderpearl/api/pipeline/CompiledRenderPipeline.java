package com.mojang.renderpearl.api.pipeline;

import com.mojang.renderpearl.api.GpuFormat;
import com.mojang.renderpearl.util.UncheckedAutoCloseable;
import java.util.List;
import org.jspecify.annotations.Nullable;

public interface CompiledRenderPipeline extends UncheckedAutoCloseable {
   boolean isClosed();

   record CreateInfo(
      String name,
      List<SpvModule> shaders,
      List<CompiledRenderPipeline.CreateInfo.VertexBuffer> vertexBuffers,
      List<CompiledRenderPipeline.CreateInfo.AttribBinding> attribBindings,
      List<CompiledRenderPipeline.CreateInfo.Uniform> uniforms,
      int pushConstantsSize,
      @Nullable DepthStencilState depthStencilState,
      GpuFormat depthStencilFormat,
      PolygonMode polygonMode,
      boolean cull,
      List<@Nullable ColorTargetState> colorTargetStates,
      PrimitiveTopology primitiveTopology
   ) {
      public static int MIN_VERTEX_STRIDE_ALIGNMENT = 4;
      public static int MAX_VERTEX_BUFFERS = 8;
      public static int MAX_VERTEX_ATTRIBS = 16;

      public record AttribBinding(int bufferSlot, int location, int offset, GpuFormat format) {
      }

      public record Uniform(String name, int binding, UniformType type, @Nullable GpuFormat gpuFormat) {
      }

      public record VertexBuffer(int bufferSlot, int stride, int stepRate) {
      }
   }

   @FunctionalInterface
   interface Pending {
      CompiledRenderPipeline.Pending NULL = () -> null;

      @Nullable CompiledRenderPipeline finishCompile();
   }
}
