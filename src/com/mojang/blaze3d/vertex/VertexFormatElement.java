package com.mojang.blaze3d.vertex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

@fic
public record VertexFormatElement(int id, int index, VertexFormatElement.Type type, VertexFormatElement.Usage usage, int count) {
   public static final int MAX_COUNT = 32;
   private static final VertexFormatElement[] BY_ID = new VertexFormatElement[32];
   private static final List<VertexFormatElement> ELEMENTS = new ArrayList<>(32);
   public static final VertexFormatElement POSITION = register(0, 0, VertexFormatElement.Type.FLOAT, VertexFormatElement.Usage.POSITION, 3);
   public static final VertexFormatElement COLOR = register(1, 0, VertexFormatElement.Type.UBYTE, VertexFormatElement.Usage.COLOR, 4);
   public static final VertexFormatElement UV0 = register(2, 0, VertexFormatElement.Type.FLOAT, VertexFormatElement.Usage.UV, 2);
   public static final VertexFormatElement UV = UV0;
   public static final VertexFormatElement UV1 = register(3, 1, VertexFormatElement.Type.SHORT, VertexFormatElement.Usage.UV, 2);
   public static final VertexFormatElement UV2 = register(4, 2, VertexFormatElement.Type.SHORT, VertexFormatElement.Usage.UV, 2);
   public static final VertexFormatElement NORMAL = register(5, 0, VertexFormatElement.Type.BYTE, VertexFormatElement.Usage.NORMAL, 3);

   public VertexFormatElement(int id, int index, VertexFormatElement.Type type, VertexFormatElement.Usage usage, int count) {
      if (id < 0 || id >= BY_ID.length) {
         throw new IllegalArgumentException("Element ID must be in range [0; " + BY_ID.length + ")");
      } else if (!this.supportsUsage(index, usage)) {
         throw new IllegalStateException("Multiple vertex elements of the same type other than UVs are not supported");
      } else {
         this.id = id;
         this.index = index;
         this.type = type;
         this.usage = usage;
         this.count = count;
      }
   }

   public static VertexFormatElement register(int $$0, int $$1, VertexFormatElement.Type $$2, VertexFormatElement.Usage $$3, int $$4) {
      VertexFormatElement $$5 = new VertexFormatElement($$0, $$1, $$2, $$3, $$4);
      if (BY_ID[$$0] != null) {
         throw new IllegalArgumentException("Duplicate element registration for: " + $$0);
      } else {
         BY_ID[$$0] = $$5;
         ELEMENTS.add($$5);
         return $$5;
      }
   }

   private boolean supportsUsage(int $$0, VertexFormatElement.Usage $$1) {
      return $$0 == 0 || $$1 == VertexFormatElement.Usage.UV;
   }

   @Override
   public String toString() {
      return this.count + "," + this.usage + "," + this.type + " (" + this.id + ")";
   }

   public int mask() {
      return 1 << this.id;
   }

   public int byteSize() {
      return this.type.size() * this.count;
   }

   @Nullable
   public static VertexFormatElement byId(int $$0) {
      return BY_ID[$$0];
   }

   public static Stream<VertexFormatElement> elementsFromMask(int $$0) {
      return ELEMENTS.stream().filter($$1 -> $$1 != null && ($$0 & $$1.mask()) != 0);
   }

   @fic
   public static enum Type {
      FLOAT(4, "Float"),
      UBYTE(1, "Unsigned Byte"),
      BYTE(1, "Byte"),
      USHORT(2, "Unsigned Short"),
      SHORT(2, "Short"),
      UINT(4, "Unsigned Int"),
      INT(4, "Int");

      private final int size;
      private final String name;

      private Type(final int $$0, final String $$1) {
         this.size = $$0;
         this.name = $$1;
      }

      public int size() {
         return this.size;
      }

      @Override
      public String toString() {
         return this.name;
      }
   }

   @fic
   public static enum Usage {
      POSITION("Position"),
      NORMAL("Normal"),
      COLOR("Vertex Color"),
      UV("UV"),
      GENERIC("Generic");

      private final String name;

      private Usage(final String $$0) {
         this.name = $$0;
      }

      @Override
      public String toString() {
         return this.name;
      }
   }
}
