package com.mojang.blaze3d.pipeline;

import com.mojang.renderpearl.api.pipeline.CompiledRenderPipeline;
import com.mojang.renderpearl.api.pipeline.RenderPassLayout;
import com.mojang.renderpearl.util.UncheckedAutoCloseable;
import it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class PipelineCache implements AutoCloseable {
   private final PipelineBuilder pipelineBuilder;
   private final ShaderSource shaderSource;
   private final Map<PipelineCache.Key, CompiledRenderPipeline> cache = new Object2ReferenceOpenHashMap();

   public PipelineCache(final PipelineBuilder pipelineBuilder, final ShaderSource shaderSource) {
      this.pipelineBuilder = pipelineBuilder;
      this.shaderSource = shaderSource;
   }

   public void insert(final PipelineCache.Key pipeline, final CompiledRenderPipeline compiled) {
      this.cache.put(pipeline, compiled);
   }

   public @Nullable CompiledRenderPipeline get(final RenderPipeline pipeline, final RenderPassLayout.Subpass subpass) {
      return this.get(new PipelineCache.Key(pipeline, subpass));
   }

   public @Nullable CompiledRenderPipeline get(final PipelineCache.Key key) {
      CompiledRenderPipeline cachedPipeline = this.cache.get(key);
      if (cachedPipeline != null) {
         return cachedPipeline;
      }

      CompiledRenderPipeline newPipeline = this.pipelineBuilder.compilePipeline(key.pipeline(), key.subpass(), this.shaderSource).finishCompile();
      if (newPipeline == null) {
         return null;
      }

      this.cache.put(key, newPipeline);
      return newPipeline;
   }

   public void clear() {
      this.cache.values().forEach(UncheckedAutoCloseable::close);
      this.cache.clear();
   }

   @Override
   public void close() {
      this.clear();
      this.shaderSource.close();
   }

   public record Key(RenderPipeline pipeline, RenderPassLayout.Subpass subpass) {
   }
}
