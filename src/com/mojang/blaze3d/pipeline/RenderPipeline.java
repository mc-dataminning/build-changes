package com.mojang.blaze3d.pipeline;

import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.platform.LogicOp;
import com.mojang.blaze3d.platform.PolygonMode;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;

@fic
public class RenderPipeline {
   private final alr location;
   private final alr vertexShader;
   private final alr fragmentShader;
   private final gse shaderDefines;
   private final List<String> samplers;
   private final List<RenderPipeline.UniformDescription> uniforms;
   private final DepthTestFunction depthTestFunction;
   private final PolygonMode polygonMode;
   private final boolean cull;
   private final LogicOp colorLogic;
   private final Optional<BlendFunction> blendFunction;
   private final boolean writeColor;
   private final boolean writeAlpha;
   private final boolean writeDepth;
   private final VertexFormat vertexFormat;
   private final VertexFormat.b vertexFormatMode;
   private final float depthBiasScaleFactor;
   private final float depthBiasConstant;

   protected RenderPipeline(
      alr $$0,
      alr $$1,
      alr $$2,
      gse $$3,
      List<String> $$4,
      List<RenderPipeline.UniformDescription> $$5,
      Optional<BlendFunction> $$6,
      DepthTestFunction $$7,
      PolygonMode $$8,
      boolean $$9,
      boolean $$10,
      boolean $$11,
      boolean $$12,
      LogicOp $$13,
      VertexFormat $$14,
      VertexFormat.b $$15,
      float $$16,
      float $$17
   ) {
      this.location = $$0;
      this.vertexShader = $$1;
      this.fragmentShader = $$2;
      this.shaderDefines = $$3;
      this.samplers = $$4;
      this.uniforms = $$5;
      this.depthTestFunction = $$7;
      this.polygonMode = $$8;
      this.cull = $$9;
      this.blendFunction = $$6;
      this.writeColor = $$10;
      this.writeAlpha = $$11;
      this.writeDepth = $$12;
      this.colorLogic = $$13;
      this.vertexFormat = $$14;
      this.vertexFormatMode = $$15;
      this.depthBiasScaleFactor = $$16;
      this.depthBiasConstant = $$17;
   }

   @Override
   public String toString() {
      return this.location.toString();
   }

   public DepthTestFunction getDepthTestFunction() {
      return this.depthTestFunction;
   }

   public PolygonMode getPolygonMode() {
      return this.polygonMode;
   }

   public boolean isCull() {
      return this.cull;
   }

   public LogicOp getColorLogic() {
      return this.colorLogic;
   }

   public Optional<BlendFunction> getBlendFunction() {
      return this.blendFunction;
   }

   public boolean isWriteColor() {
      return this.writeColor;
   }

   public boolean isWriteAlpha() {
      return this.writeAlpha;
   }

   public boolean isWriteDepth() {
      return this.writeDepth;
   }

   public float getDepthBiasScaleFactor() {
      return this.depthBiasScaleFactor;
   }

   public float getDepthBiasConstant() {
      return this.depthBiasConstant;
   }

   public alr getLocation() {
      return this.location;
   }

   public VertexFormat getVertexFormat() {
      return this.vertexFormat;
   }

   public VertexFormat.b getVertexFormatMode() {
      return this.vertexFormatMode;
   }

   public alr getVertexShader() {
      return this.vertexShader;
   }

   public alr getFragmentShader() {
      return this.fragmentShader;
   }

   public gse getShaderDefines() {
      return this.shaderDefines;
   }

   public List<String> getSamplers() {
      return this.samplers;
   }

   public List<RenderPipeline.UniformDescription> getUniforms() {
      return this.uniforms;
   }

   public boolean wantsDepthTexture() {
      return this.depthTestFunction != DepthTestFunction.NO_DEPTH_TEST
         || this.depthBiasConstant != 0.0F
         || this.depthBiasScaleFactor != 0.0F
         || this.writeDepth;
   }

   public static RenderPipeline.Builder builder(RenderPipeline.Snippet... $$0) {
      RenderPipeline.Builder $$1 = new RenderPipeline.Builder();

      for (RenderPipeline.Snippet $$2 : $$0) {
         $$1.withSnippet($$2);
      }

      return $$1;
   }

   @fic
   public static class Builder {
      private Optional<alr> location = Optional.empty();
      private Optional<alr> fragmentShader = Optional.empty();
      private Optional<alr> vertexShader = Optional.empty();
      private Optional<gse.a> definesBuilder = Optional.empty();
      private Optional<List<String>> samplers = Optional.empty();
      private Optional<List<RenderPipeline.UniformDescription>> uniforms = Optional.empty();
      private Optional<DepthTestFunction> depthTestFunction = Optional.empty();
      private Optional<PolygonMode> polygonMode = Optional.empty();
      private Optional<Boolean> cull = Optional.empty();
      private Optional<Boolean> writeColor = Optional.empty();
      private Optional<Boolean> writeAlpha = Optional.empty();
      private Optional<Boolean> writeDepth = Optional.empty();
      private Optional<LogicOp> colorLogic = Optional.empty();
      private Optional<BlendFunction> blendFunction = Optional.empty();
      private Optional<VertexFormat> vertexFormat = Optional.empty();
      private Optional<VertexFormat.b> vertexFormatMode = Optional.empty();
      private float depthBiasScaleFactor;
      private float depthBiasConstant;

      Builder() {
      }

      public RenderPipeline.Builder withLocation(String $$0) {
         this.location = Optional.of(alr.b($$0));
         return this;
      }

      public RenderPipeline.Builder withLocation(alr $$0) {
         this.location = Optional.of($$0);
         return this;
      }

      public RenderPipeline.Builder withFragmentShader(String $$0) {
         this.fragmentShader = Optional.of(alr.b($$0));
         return this;
      }

      public RenderPipeline.Builder withFragmentShader(alr $$0) {
         this.fragmentShader = Optional.of($$0);
         return this;
      }

      public RenderPipeline.Builder withVertexShader(String $$0) {
         this.vertexShader = Optional.of(alr.b($$0));
         return this;
      }

      public RenderPipeline.Builder withVertexShader(alr $$0) {
         this.vertexShader = Optional.of($$0);
         return this;
      }

      public RenderPipeline.Builder withShaderDefine(String $$0) {
         if (this.definesBuilder.isEmpty()) {
            this.definesBuilder = Optional.of(gse.a());
         }

         this.definesBuilder.get().a($$0);
         return this;
      }

      public RenderPipeline.Builder withShaderDefine(String $$0, int $$1) {
         if (this.definesBuilder.isEmpty()) {
            this.definesBuilder = Optional.of(gse.a());
         }

         this.definesBuilder.get().a($$0, $$1);
         return this;
      }

      public RenderPipeline.Builder withShaderDefine(String $$0, float $$1) {
         if (this.definesBuilder.isEmpty()) {
            this.definesBuilder = Optional.of(gse.a());
         }

         this.definesBuilder.get().a($$0, $$1);
         return this;
      }

      public RenderPipeline.Builder withSampler(String $$0) {
         if (this.samplers.isEmpty()) {
            this.samplers = Optional.of(new ArrayList<>());
         }

         this.samplers.get().add($$0);
         return this;
      }

      public RenderPipeline.Builder withUniform(String $$0, fku $$1) {
         if (this.uniforms.isEmpty()) {
            this.uniforms = Optional.of(new ArrayList<>());
         }

         this.uniforms.get().add(new RenderPipeline.UniformDescription($$0, $$1));
         return this;
      }

      public RenderPipeline.Builder withDepthTestFunction(DepthTestFunction $$0) {
         this.depthTestFunction = Optional.of($$0);
         return this;
      }

      public RenderPipeline.Builder withPolygonMode(PolygonMode $$0) {
         this.polygonMode = Optional.of($$0);
         return this;
      }

      public RenderPipeline.Builder withCull(boolean $$0) {
         this.cull = Optional.of($$0);
         return this;
      }

      public RenderPipeline.Builder withBlend(BlendFunction $$0) {
         this.blendFunction = Optional.of($$0);
         return this;
      }

      public RenderPipeline.Builder withoutBlend() {
         this.blendFunction = Optional.empty();
         return this;
      }

      public RenderPipeline.Builder withColorWrite(boolean $$0) {
         this.writeColor = Optional.of($$0);
         this.writeAlpha = Optional.of($$0);
         return this;
      }

      public RenderPipeline.Builder withColorWrite(boolean $$0, boolean $$1) {
         this.writeColor = Optional.of($$0);
         this.writeAlpha = Optional.of($$1);
         return this;
      }

      public RenderPipeline.Builder withDepthWrite(boolean $$0) {
         this.writeDepth = Optional.of($$0);
         return this;
      }

      public RenderPipeline.Builder withColorLogic(LogicOp $$0) {
         this.colorLogic = Optional.of($$0);
         return this;
      }

      public RenderPipeline.Builder withVertexFormat(VertexFormat $$0, VertexFormat.b $$1) {
         this.vertexFormat = Optional.of($$0);
         this.vertexFormatMode = Optional.of($$1);
         return this;
      }

      public RenderPipeline.Builder withDepthBias(float $$0, float $$1) {
         this.depthBiasScaleFactor = $$0;
         this.depthBiasConstant = $$1;
         return this;
      }

      void withSnippet(RenderPipeline.Snippet $$0) {
         if ($$0.vertexShader.isPresent()) {
            this.vertexShader = $$0.vertexShader;
         }

         if ($$0.fragmentShader.isPresent()) {
            this.fragmentShader = $$0.fragmentShader;
         }

         if ($$0.shaderDefines.isPresent()) {
            if (this.definesBuilder.isEmpty()) {
               this.definesBuilder = Optional.of(gse.a());
            }

            gse $$1 = $$0.shaderDefines.get();

            for (Entry<String, String> $$2 : $$1.d().entrySet()) {
               this.definesBuilder.get().a($$2.getKey(), $$2.getValue());
            }

            for (String $$3 : $$1.e()) {
               this.definesBuilder.get().a($$3);
            }
         }

         $$0.samplers.ifPresent($$0x -> {
            if (this.samplers.isPresent()) {
               this.samplers.get().addAll($$0x);
            } else {
               this.samplers = Optional.of(new ArrayList<>($$0x));
            }
         });
         $$0.uniforms.ifPresent($$0x -> {
            if (this.uniforms.isPresent()) {
               this.uniforms.get().addAll($$0x);
            } else {
               this.uniforms = Optional.of(new ArrayList<>($$0x));
            }
         });
         if ($$0.depthTestFunction.isPresent()) {
            this.depthTestFunction = $$0.depthTestFunction;
         }

         if ($$0.cull.isPresent()) {
            this.cull = $$0.cull;
         }

         if ($$0.writeColor.isPresent()) {
            this.writeColor = $$0.writeColor;
         }

         if ($$0.writeAlpha.isPresent()) {
            this.writeAlpha = $$0.writeAlpha;
         }

         if ($$0.writeDepth.isPresent()) {
            this.writeDepth = $$0.writeDepth;
         }

         if ($$0.colorLogic.isPresent()) {
            this.colorLogic = $$0.colorLogic;
         }

         if ($$0.blendFunction.isPresent()) {
            this.blendFunction = $$0.blendFunction;
         }

         if ($$0.vertexFormat.isPresent()) {
            this.vertexFormat = $$0.vertexFormat;
         }

         if ($$0.vertexFormatMode.isPresent()) {
            this.vertexFormatMode = $$0.vertexFormatMode;
         }
      }

      public RenderPipeline.Snippet buildSnippet() {
         return new RenderPipeline.Snippet(
            this.vertexShader,
            this.fragmentShader,
            this.definesBuilder.map(gse.a::a),
            this.samplers.map(Collections::unmodifiableList),
            this.uniforms.map(Collections::unmodifiableList),
            this.blendFunction,
            this.depthTestFunction,
            this.polygonMode,
            this.cull,
            this.writeColor,
            this.writeAlpha,
            this.writeDepth,
            this.colorLogic,
            this.vertexFormat,
            this.vertexFormatMode
         );
      }

      public RenderPipeline build() {
         if (this.location.isEmpty()) {
            throw new IllegalStateException("Missing location");
         } else if (this.vertexShader.isEmpty()) {
            throw new IllegalStateException("Missing vertex shader");
         } else if (this.fragmentShader.isEmpty()) {
            throw new IllegalStateException("Missing fragment shader");
         } else if (this.vertexFormat.isEmpty()) {
            throw new IllegalStateException("Missing vertex buffer format");
         } else if (this.vertexFormatMode.isEmpty()) {
            throw new IllegalStateException("Missing vertex mode");
         } else {
            return new RenderPipeline(
               this.location.get(),
               this.vertexShader.get(),
               this.fragmentShader.get(),
               this.definesBuilder.orElse(gse.a()).a(),
               List.copyOf(this.samplers.orElse(new ArrayList<>())),
               this.uniforms.orElse(Collections.emptyList()),
               this.blendFunction,
               this.depthTestFunction.orElse(DepthTestFunction.LEQUAL_DEPTH_TEST),
               this.polygonMode.orElse(PolygonMode.FILL),
               this.cull.orElse(true),
               this.writeColor.orElse(true),
               this.writeAlpha.orElse(true),
               this.writeDepth.orElse(true),
               this.colorLogic.orElse(LogicOp.NONE),
               this.vertexFormat.get(),
               this.vertexFormatMode.get(),
               this.depthBiasScaleFactor,
               this.depthBiasConstant
            );
         }
      }
   }

   @fic
   public static record Snippet(
      Optional<alr> vertexShader,
      Optional<alr> fragmentShader,
      Optional<gse> shaderDefines,
      Optional<List<String>> samplers,
      Optional<List<RenderPipeline.UniformDescription>> uniforms,
      Optional<BlendFunction> blendFunction,
      Optional<DepthTestFunction> depthTestFunction,
      Optional<PolygonMode> polygonMode,
      Optional<Boolean> cull,
      Optional<Boolean> writeColor,
      Optional<Boolean> writeAlpha,
      Optional<Boolean> writeDepth,
      Optional<LogicOp> colorLogic,
      Optional<VertexFormat> vertexFormat,
      Optional<VertexFormat.b> vertexFormatMode
   ) {
   }

   @fic
   public static record UniformDescription(String name, fku type) {
   }
}
