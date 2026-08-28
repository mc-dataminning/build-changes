package com.mojang.blaze3d.vertex;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.blaze3d.buffers.BufferType;
import com.mojang.blaze3d.buffers.BufferUsage;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

@fic
public class VertexFormat {
   public static final int UNKNOWN_ELEMENT = -1;
   private final List<VertexFormatElement> elements;
   private final List<String> names;
   private final int vertexSize;
   private final int elementsMask;
   private final int[] offsetsByElement = new int[32];
   @Nullable
   private GpuBuffer immediateDrawVertexBuffer;
   @Nullable
   private GpuBuffer immediateDrawIndexBuffer;

   VertexFormat(List<VertexFormatElement> $$0, List<String> $$1, IntList $$2, int $$3) {
      this.elements = $$0;
      this.names = $$1;
      this.vertexSize = $$3;
      this.elementsMask = $$0.stream().mapToInt(VertexFormatElement::mask).reduce(0, ($$0x, $$1x) -> $$0x | $$1x);

      for (int $$4 = 0; $$4 < this.offsetsByElement.length; $$4++) {
         VertexFormatElement $$5 = VertexFormatElement.byId($$4);
         int $$6 = $$5 != null ? $$0.indexOf($$5) : -1;
         this.offsetsByElement[$$4] = $$6 != -1 ? $$2.getInt($$6) : -1;
      }
   }

   public static VertexFormat.Builder builder() {
      return new VertexFormat.Builder();
   }

   @Override
   public String toString() {
      return "VertexFormat" + this.names;
   }

   public int getVertexSize() {
      return this.vertexSize;
   }

   public List<VertexFormatElement> getElements() {
      return this.elements;
   }

   public List<String> getElementAttributeNames() {
      return this.names;
   }

   public int[] getOffsetsByElement() {
      return this.offsetsByElement;
   }

   public int getOffset(VertexFormatElement $$0) {
      return this.offsetsByElement[$$0.id()];
   }

   public boolean contains(VertexFormatElement $$0) {
      return (this.elementsMask & $$0.mask()) != 0;
   }

   public int getElementsMask() {
      return this.elementsMask;
   }

   public String getElementName(VertexFormatElement $$0) {
      int $$1 = this.elements.indexOf($$0);
      if ($$1 == -1) {
         throw new IllegalArgumentException($$0 + " is not contained in format");
      } else {
         return this.names.get($$1);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof VertexFormat $$1
            && this.elementsMask == $$1.elementsMask
            && this.vertexSize == $$1.vertexSize
            && this.names.equals($$1.names)
            && Arrays.equals(this.offsetsByElement, $$1.offsetsByElement)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.elementsMask * 31 + Arrays.hashCode(this.offsetsByElement);
   }

   public GpuBuffer uploadImmediateVertexBuffer(ByteBuffer $$0) {
      GpuDevice $$1 = RenderSystem.getDevice();
      if (this.immediateDrawVertexBuffer == null) {
         this.immediateDrawVertexBuffer = $$1.createBuffer(() -> "Immediate vertex buffer for " + this, BufferType.VERTICES, BufferUsage.DYNAMIC_WRITE, $$0);
      } else {
         CommandEncoder $$2 = $$1.createCommandEncoder();
         if (this.immediateDrawVertexBuffer.size() < $$0.remaining()) {
            this.immediateDrawVertexBuffer.close();
            this.immediateDrawVertexBuffer = $$1.createBuffer(() -> "Immediate vertex buffer for " + this, BufferType.VERTICES, BufferUsage.DYNAMIC_WRITE, $$0);
         } else {
            $$2.writeToBuffer(this.immediateDrawVertexBuffer, $$0, 0);
         }
      }

      return this.immediateDrawVertexBuffer;
   }

   public GpuBuffer uploadImmediateIndexBuffer(ByteBuffer $$0) {
      GpuDevice $$1 = RenderSystem.getDevice();
      if (this.immediateDrawIndexBuffer == null) {
         this.immediateDrawIndexBuffer = RenderSystem.getDevice()
            .createBuffer(() -> "Immediate index buffer for " + this, BufferType.INDICES, BufferUsage.DYNAMIC_WRITE, $$0);
      } else {
         CommandEncoder $$2 = $$1.createCommandEncoder();
         if (this.immediateDrawIndexBuffer.size() < $$0.remaining()) {
            this.immediateDrawIndexBuffer.close();
            this.immediateDrawIndexBuffer = RenderSystem.getDevice()
               .createBuffer(() -> "Immediate index buffer for " + this, BufferType.INDICES, BufferUsage.DYNAMIC_WRITE, $$0);
         } else {
            $$2.writeToBuffer(this.immediateDrawIndexBuffer, $$0, 0);
         }
      }

      return this.immediateDrawIndexBuffer;
   }

   @fic
   public static class Builder {
      private final com.google.common.collect.ImmutableMap.Builder<String, VertexFormatElement> elements = ImmutableMap.builder();
      private final IntList offsets = new IntArrayList();
      private int offset;

      Builder() {
      }

      public VertexFormat.Builder add(String $$0, VertexFormatElement $$1) {
         this.elements.put($$0, $$1);
         this.offsets.add(this.offset);
         this.offset = this.offset + $$1.byteSize();
         return this;
      }

      public VertexFormat.Builder padding(int $$0) {
         this.offset += $$0;
         return this;
      }

      public VertexFormat build() {
         ImmutableMap<String, VertexFormatElement> $$0 = this.elements.buildOrThrow();
         ImmutableList<VertexFormatElement> $$1 = $$0.values().asList();
         ImmutableList<String> $$2 = $$0.keySet().asList();
         return new VertexFormat($$1, $$2, this.offsets, this.offset);
      }
   }

   public static enum a {
      a(2),
      b(4);

      public final int c;

      private a(final int $$0) {
         this.c = $$0;
      }

      public static VertexFormat.a a(int $$0) {
         return ($$0 & -65536) != 0 ? b : a;
      }
   }

   public static enum b {
      a(2, 2, false),
      b(2, 1, true),
      c(2, 2, false),
      d(2, 1, true),
      e(3, 3, false),
      f(3, 1, true),
      g(3, 1, true),
      h(4, 4, false);

      public final int i;
      public final int j;
      public final boolean k;

      private b(final int $$0, final int $$1, final boolean $$2) {
         this.i = $$0;
         this.j = $$1;
         this.k = $$2;
      }

      public int a(int $$0) {
         return switch (this) {
            case a, h -> $$0 / 4 * 6;
            case b, c, d, e, f, g -> $$0;
            default -> 0;
         };
      }
   }
}
