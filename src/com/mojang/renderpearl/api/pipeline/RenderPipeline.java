package com.mojang.renderpearl.api.pipeline;

import com.mojang.renderpearl.api.vertex.VertexFormat;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceLists;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Supplier;
import net.minecraft.SharedConstants;
import net.minecraft.client.renderer.ShaderDefines;
import net.minecraft.resources.Identifier;
import org.jspecify.annotations.Nullable;

public class RenderPipeline {
   private final Identifier location;
   private final Map<ShaderType, Identifier> shaders;
   private final ShaderDefines shaderDefines;
   private final List<BindGroupLayout> bindGroupLayouts;
   @Nullable
   private final DepthStencilState depthStencilState;
   private final PolygonMode polygonMode;
   private final boolean cull;
   private final List<ColorTargetState> colorTargetStates;
   private final List<VertexFormat> vertexFormatPerBuffer;
   private final PrimitiveTopology primitiveTopology;
   private final int pushConstantSize;
   private final int sortKey;
   private static int sortKeySeed;

   protected RenderPipeline(
      final Identifier location,
      final Map<ShaderType, Identifier> shaders,
      final ShaderDefines shaderDefines,
      final Collection<BindGroupLayout> bindGroupLayouts,
      final ColorTargetState[] colorTargetStates,
      @Nullable final DepthStencilState depthStencilState,
      final PolygonMode polygonMode,
      final boolean cull,
      final VertexFormat[] vertexFormatPerBuffer,
      final PrimitiveTopology primitiveTopology,
      final int pushConstantSize,
      final int sortKey
   ) {
      this.location = location;
      this.shaders = Collections.unmodifiableMap(new EnumMap<>(shaders));
      this.shaderDefines = shaderDefines;
      this.bindGroupLayouts = List.copyOf(bindGroupLayouts);
      this.depthStencilState = depthStencilState;
      this.polygonMode = polygonMode;
      this.cull = cull;
      this.colorTargetStates = ReferenceLists.unmodifiable(new ReferenceArrayList(colorTargetStates));
      this.vertexFormatPerBuffer = ReferenceLists.unmodifiable(new ReferenceArrayList(vertexFormatPerBuffer));
      this.primitiveTopology = primitiveTopology;
      this.pushConstantSize = pushConstantSize;
      this.sortKey = sortKey;
   }

   public int getSortKey() {
      return SharedConstants.DEBUG_SHUFFLE_UI_RENDERING_ORDER ? super.hashCode() * (sortKeySeed + 1) : this.sortKey;
   }

   public static void updateSortKeySeed() {
      sortKeySeed = Math.round(100000.0F * (float)Math.random());
   }

   @Override
   public String toString() {
      return this.location.toString();
   }

   public PolygonMode getPolygonMode() {
      return this.polygonMode;
   }

   public boolean isCull() {
      return this.cull;
   }

   public List<ColorTargetState> getColorTargetStates() {
      return this.colorTargetStates;
   }

   @Nullable
   public DepthStencilState getDepthStencilState() {
      return this.depthStencilState;
   }

   public Identifier getLocation() {
      return this.location;
   }

   public List<VertexFormat> getVertexFormatBindings() {
      return this.vertexFormatPerBuffer;
   }

   @Nullable
   public VertexFormat getVertexFormatBinding(final int bindingIndex) {
      return this.vertexFormatPerBuffer.get(bindingIndex);
   }

   public PrimitiveTopology getPrimitiveTopology() {
      return this.primitiveTopology;
   }

   public Map<ShaderType, Identifier> getShaders() {
      return this.shaders;
   }

   public ShaderDefines getShaderDefines() {
      return this.shaderDefines;
   }

   public List<BindGroupLayout> getBindGroupLayouts() {
      return this.bindGroupLayouts;
   }

   public boolean wantsDepthTexture() {
      return this.depthStencilState != null;
   }

   public int pushConstantSize() {
      return this.pushConstantSize;
   }

   public static RenderPipeline.Builder builder(final RenderPipeline.Snippet... snippets) {
      RenderPipeline.Builder builder = new RenderPipeline.Builder();

      for (RenderPipeline.Snippet snippet : snippets) {
         builder.withSnippet(snippet);
      }

      return builder;
   }

   public static class Builder {
      private static int nextPipelineSortKey;
      private Optional<Identifier> location = Optional.empty();
      private final Map<ShaderType, Identifier> shaders = new EnumMap<>(ShaderType.class);
      private Optional<ShaderDefines.Builder> definesBuilder = Optional.empty();
      private Optional<Set<BindGroupLayout>> bindGroupLayouts = Optional.empty();
      private Optional<DepthStencilState> depthStencilState = Optional.empty();
      private Optional<PolygonMode> polygonMode = Optional.empty();
      private Optional<Boolean> cull = Optional.empty();
      private final ColorTargetState[] colorTargetStates = new ColorTargetState[8];
      private int activeColorTargetStateCount;
      private final VertexFormat[] vertexFormatPerBuffer = new VertexFormat[16];
      private Optional<PrimitiveTopology> primitiveTopology = Optional.empty();
      private int pushConstantSize = 0;

      private Builder() {
      }

      public RenderPipeline.Builder withLocation(final String location) {
         this.location = Optional.of(Identifier.withDefaultNamespace(location));
         return this;
      }

      public RenderPipeline.Builder withLocation(final Identifier location) {
         this.location = Optional.of(location);
         return this;
      }

      public RenderPipeline.Builder withFragmentShader(final String fragmentShader) {
         return this.withFragmentShader(Identifier.withDefaultNamespace(fragmentShader));
      }

      public RenderPipeline.Builder withFragmentShader(final Identifier fragmentShader) {
         this.shaders.put(ShaderType.FRAGMENT, fragmentShader);
         return this;
      }

      public RenderPipeline.Builder withVertexShader(final String vertexShader) {
         return this.withVertexShader(Identifier.withDefaultNamespace(vertexShader));
      }

      public RenderPipeline.Builder withVertexShader(final Identifier vertexShader) {
         this.shaders.put(ShaderType.VERTEX, vertexShader);
         return this;
      }

      public RenderPipeline.Builder withShaderDefine(final String key) {
         if (this.definesBuilder.isEmpty()) {
            this.definesBuilder = Optional.of(ShaderDefines.builder());
         }

         this.definesBuilder.get().define(key);
         return this;
      }

      public RenderPipeline.Builder withShaderDefine(final String key, final int value) {
         if (this.definesBuilder.isEmpty()) {
            this.definesBuilder = Optional.of(ShaderDefines.builder());
         }

         this.definesBuilder.get().define(key, value);
         return this;
      }

      public RenderPipeline.Builder withShaderDefine(final String key, final float value) {
         if (this.definesBuilder.isEmpty()) {
            this.definesBuilder = Optional.of(ShaderDefines.builder());
         }

         this.definesBuilder.get().define(key, value);
         return this;
      }

      public RenderPipeline.Builder withBindGroupLayout(final BindGroupLayout bindGroupLayout) {
         if (this.bindGroupLayouts.isEmpty()) {
            this.bindGroupLayouts = Optional.of(new ObjectOpenHashSet());
         }

         this.bindGroupLayouts.get().add(bindGroupLayout);
         return this;
      }

      public RenderPipeline.Builder withPolygonMode(final PolygonMode polygonMode) {
         this.polygonMode = Optional.of(polygonMode);
         return this;
      }

      public RenderPipeline.Builder withCull(final boolean cull) {
         this.cull = Optional.of(cull);
         return this;
      }

      public RenderPipeline.Builder withColorTargetState(final int index, final ColorTargetState colorTargetState) {
         this.colorTargetStates[index] = colorTargetState;
         this.activeColorTargetStateCount = Math.max(this.activeColorTargetStateCount, index + 1);
         return this;
      }

      public RenderPipeline.Builder withColorTargetStates(final int startIindex, final int endIndex, final Supplier<ColorTargetState> colorTargetState) {
         for (int i = startIindex; i <= endIndex; i++) {
            this.colorTargetStates[i] = colorTargetState.get();
            this.activeColorTargetStateCount = Math.max(this.activeColorTargetStateCount, i + 1);
         }

         return this;
      }

      public RenderPipeline.Builder withUnusedColorTargetState(final int index) {
         this.colorTargetStates[index] = null;
         this.activeColorTargetStateCount = Math.max(this.activeColorTargetStateCount, index + 1);
         return this;
      }

      public RenderPipeline.Builder withColorTargetState(final ColorTargetState colorTargetState) {
         return this.withColorTargetState(0, colorTargetState);
      }

      public RenderPipeline.Builder withDepthStencilState(final DepthStencilState depthStencilState) {
         this.depthStencilState = Optional.of(depthStencilState);
         return this;
      }

      public RenderPipeline.Builder withDepthStencilState(final Optional<DepthStencilState> depthStencilState) {
         this.depthStencilState = depthStencilState;
         return this;
      }

      public RenderPipeline.Builder withVertexBinding(final int bindingIndex, final VertexFormat vertexFormat) {
         this.vertexFormatPerBuffer[bindingIndex] = vertexFormat;
         return this;
      }

      public RenderPipeline.Builder withPrimitiveTopology(final PrimitiveTopology primitiveTopology) {
         this.primitiveTopology = Optional.of(primitiveTopology);
         return this;
      }

      public RenderPipeline.Builder withPushConstantSize(final int pushConstantSize) {
         this.pushConstantSize = pushConstantSize;
         return this;
      }

      public RenderPipeline.Builder withSnippet(final RenderPipeline.Snippet snippet) {
         this.shaders.putAll(snippet.shaders);
         if (snippet.shaderDefines.isPresent()) {
            if (this.definesBuilder.isEmpty()) {
               this.definesBuilder = Optional.of(ShaderDefines.builder());
            }

            ShaderDefines snippetDefines = snippet.shaderDefines.get();

            for (Entry<String, String> snippetValue : snippetDefines.values().entrySet()) {
               this.definesBuilder.get().define(snippetValue.getKey(), snippetValue.getValue());
            }

            for (String flag : snippetDefines.flags()) {
               this.definesBuilder.get().define(flag);
            }
         }

         snippet.bindGroupLayouts.ifPresent(snippetLayouts -> {
            if (this.bindGroupLayouts.isPresent()) {
               this.bindGroupLayouts.get().addAll(snippetLayouts);
            } else {
               this.bindGroupLayouts = Optional.of(new ObjectOpenHashSet(snippetLayouts));
            }
         });
         if (snippet.depthStencilState.isPresent()) {
            this.depthStencilState = snippet.depthStencilState;
         }

         if (snippet.cull.isPresent()) {
            this.cull = snippet.cull;
         }

         for (int i = 0; i < snippet.activeColorTargetStateCount; i++) {
            if (this.colorTargetStates[i] == null && snippet.colorTargetStates[i] != null) {
               this.colorTargetStates[i] = snippet.colorTargetStates[i];
            }
         }

         this.activeColorTargetStateCount = Math.max(this.activeColorTargetStateCount, snippet.activeColorTargetStateCount);

         for (int ix = 0; ix < snippet.vertexFormatPerBuffer.length; ix++) {
            VertexFormat vertexFormat = snippet.vertexFormatPerBuffer[ix];
            if (vertexFormat != null) {
               this.vertexFormatPerBuffer[ix] = vertexFormat;
            }
         }

         if (snippet.vertexFormatMode.isPresent()) {
            this.primitiveTopology = snippet.vertexFormatMode;
         }

         if (snippet.polygonMode.isPresent()) {
            this.polygonMode = snippet.polygonMode;
         }

         this.pushConstantSize = Math.max(this.pushConstantSize, snippet.pushConstantSize);
         return this;
      }

      public RenderPipeline.Snippet buildSnippet() {
         return new RenderPipeline.Snippet(
            Collections.unmodifiableMap(new EnumMap<>(this.shaders)),
            this.definesBuilder.map(ShaderDefines.Builder::build),
            this.bindGroupLayouts.map(List::copyOf),
            this.colorTargetStates,
            this.activeColorTargetStateCount,
            this.depthStencilState,
            this.polygonMode,
            this.cull,
            this.vertexFormatPerBuffer,
            this.primitiveTopology,
            this.pushConstantSize
         );
      }

      public RenderPipeline build() {
         if (this.location.isEmpty()) {
            throw new IllegalStateException("Missing location");
         } else if (!this.shaders.containsKey(ShaderType.VERTEX)) {
            throw new IllegalStateException("Missing vertex shader");
         } else if (!this.shaders.containsKey(ShaderType.FRAGMENT)) {
            throw new IllegalStateException("Missing fragment shader");
         } else if (this.primitiveTopology.isEmpty()) {
            throw new IllegalStateException("Missing primitive topology");
         } else {
            ColorTargetState[] activeColorTargetStates;
            if (this.activeColorTargetStateCount == 0) {
               activeColorTargetStates = new ColorTargetState[0];
            } else {
               activeColorTargetStates = Arrays.copyOf(this.colorTargetStates, this.activeColorTargetStateCount);
               Optional<BlendFunction> lastBlend = Optional.empty();

               for (ColorTargetState activeColorTargetState : activeColorTargetStates) {
                  if (activeColorTargetState != null) {
                     Optional<BlendFunction> currentBlend = activeColorTargetState.blendFunction();
                     if (currentBlend.isPresent()) {
                        if (lastBlend.isEmpty()) {
                           lastBlend = currentBlend;
                        } else if (!currentBlend.equals(lastBlend)) {
                           throw new IllegalStateException("Blend functions must currently be the same for all color targets");
                        }
                     }
                  }
               }
            }

            int boundVertexAttribCount = 0;

            for (VertexFormat bindings : this.vertexFormatPerBuffer) {
               if (bindings != null) {
                  boundVertexAttribCount += bindings.getElements().size();
               }
            }

            if (boundVertexAttribCount > 16) {
               throw new IllegalStateException("Binding more than 16 vertex attributes is not supported");
            } else if (this.pushConstantSize > 128) {
               throw new IllegalStateException("Maximum push constant size is 128 bytes");
            } else {
               return new RenderPipeline(
                  this.location.get(),
                  this.shaders,
                  this.definesBuilder.orElse(ShaderDefines.builder()).build(),
                  this.bindGroupLayouts.orElse(Collections.emptySet()),
                  activeColorTargetStates,
                  this.depthStencilState.orElse(null),
                  this.polygonMode.orElse(PolygonMode.FILL),
                  this.cull.orElse(true),
                  this.vertexFormatPerBuffer,
                  this.primitiveTopology.get(),
                  this.pushConstantSize,
                  nextPipelineSortKey++
               );
            }
         }
      }
   }

   public static record Snippet(
      Map<ShaderType, Identifier> shaders,
      Optional<ShaderDefines> shaderDefines,
      Optional<List<BindGroupLayout>> bindGroupLayouts,
      ColorTargetState[] colorTargetStates,
      int activeColorTargetStateCount,
      Optional<DepthStencilState> depthStencilState,
      Optional<PolygonMode> polygonMode,
      Optional<Boolean> cull,
      VertexFormat[] vertexFormatPerBuffer,
      Optional<PrimitiveTopology> vertexFormatMode,
      int pushConstantSize
   ) {
   }
}
