import com.google.common.annotations.VisibleForTesting;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.bytes.ByteList;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.util.List;
import java.util.function.Function;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.annotation.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public class ezk implements eng {
   static final Logger a = LogUtils.getLogger();
   private static final int b = 16;
   private static final int c = 2;
   private static final int d = 32;
   private static final int e = 64;
   private static final int f = 96;
   private static final int g = 128;
   private final eyu<ezk.d> h;

   ezk(eyu<ezk.d> $$0) {
      this.h = $$0;
   }

   @Nullable
   @Override
   public enf a(int $$0) {
      return this.h.a($$0);
   }

   @Override
   public IntSet a() {
      return this.h.b();
   }

   @VisibleForTesting
   static void a(IntBuffer $$0, int $$1, int $$2, int $$3) {
      int $$4 = 32 - $$2 - 1;
      int $$5 = 32 - $$3 - 1;

      for (int $$6 = $$4; $$6 >= $$5; $$6--) {
         if ($$6 < 32 && $$6 >= 0) {
            boolean $$7 = ($$1 >> $$6 & 1) != 0;
            $$0.put($$7 ? -1 : 0);
         } else {
            $$0.put(0);
         }
      }
   }

   static void a(IntBuffer $$0, ezk.f $$1, int $$2, int $$3) {
      for (int $$4 = 0; $$4 < 16; $$4++) {
         int $$5 = $$1.a($$4);
         a($$0, $$5, $$2, $$3);
      }
   }

   @VisibleForTesting
   static void a(InputStream $$0, ezk.h $$1) throws IOException {
      int $$2 = 0;
      ByteList $$3 = new ByteArrayList(128);

      while (true) {
         boolean $$4 = a($$0, $$3, 58);
         int $$5 = $$3.size();
         if ($$5 == 0 && !$$4) {
            return;
         }

         if (!$$4 || $$5 != 4 && $$5 != 5 && $$5 != 6) {
            throw new IllegalArgumentException("Invalid entry at line " + $$2 + ": expected 4, 5 or 6 hex digits followed by a colon");
         }

         int $$6 = 0;

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            $$6 = $$6 << 4 | a($$2, $$3.getByte($$7));
         }

         $$3.clear();
         a($$0, $$3, 10);
         int $$8 = $$3.size();

         ezk.f $$9 = switch ($$8) {
            case 32 -> ezk.a.a($$2, $$3);
            case 64 -> ezk.i.a($$2, $$3);
            case 96 -> ezk.e.b($$2, $$3);
            case 128 -> ezk.e.a($$2, $$3);
            default -> throw new IllegalArgumentException(
            "Invalid entry at line " + $$2 + ": expected hex number describing (8,16,24,32) x 16 bitmap, followed by a new line"
         );
         };
         $$1.accept($$6, $$9);
         $$2++;
         $$3.clear();
      }
   }

   static int a(int $$0, ByteList $$1, int $$2) {
      return a($$0, $$1.getByte($$2));
   }

   private static int a(int $$0, byte $$1) {
      return switch ($$1) {
         case 48 -> 0;
         case 49 -> 1;
         case 50 -> 2;
         case 51 -> 3;
         case 52 -> 4;
         case 53 -> 5;
         case 54 -> 6;
         case 55 -> 7;
         case 56 -> 8;
         case 57 -> 9;
         default -> throw new IllegalArgumentException("Invalid entry at line " + $$0 + ": expected hex digit, got " + (char)$$1);
         case 65 -> 10;
         case 66 -> 11;
         case 67 -> 12;
         case 68 -> 13;
         case 69 -> 14;
         case 70 -> 15;
      };
   }

   private static boolean a(InputStream $$0, ByteList $$1, int $$2) throws IOException {
      while (true) {
         int $$3 = $$0.read();
         if ($$3 == -1) {
            return false;
         }

         if ($$3 == $$2) {
            return true;
         }

         $$1.add((byte)$$3);
      }
   }

   static record a(byte[] a) implements ezk.f {
      @Override
      public int a(int $$0) {
         return this.a[$$0] << 24;
      }

      static ezk.f a(int $$0, ByteList $$1) {
         byte[] $$2 = new byte[16];
         int $$3 = 0;

         for (int $$4 = 0; $$4 < 16; $$4++) {
            int $$5 = ezk.a($$0, $$1, $$3++);
            int $$6 = ezk.a($$0, $$1, $$3++);
            byte $$7 = (byte)($$5 << 4 | $$6);
            $$2[$$4] = $$7;
         }

         return new ezk.a($$2);
      }

      @Override
      public int a() {
         return 8;
      }

      public byte[] b() {
         return this.a;
      }
   }

   public static class b implements ezg {
      public static final MapCodec<ezk.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(agt.a.fieldOf("hex_file").forGetter($$0x -> $$0x.c), ezk.g.a.listOf().fieldOf("size_overrides").forGetter($$0x -> $$0x.d))
               .apply($$0, ezk.b::new)
      );
      private final agt c;
      private final List<ezk.g> d;

      private b(agt $$0, List<ezk.g> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public ezh a() {
         return ezh.d;
      }

      @Override
      public Either<ezg.a, ezg.b> b() {
         return Either.left(this::a);
      }

      private eng a(aps $$0) throws IOException {
         ezk var3;
         try (InputStream $$1 = $$0.open(this.c)) {
            var3 = this.a($$1);
         }

         return var3;
      }

      private ezk a(InputStream $$0) throws IOException {
         eyu<ezk.f> $$1 = new eyu<>(ezk.f[]::new, ezk.f[][]::new);
         ezk.h $$2 = $$1::a;

         ezk var17;
         try (ZipInputStream $$3 = new ZipInputStream($$0)) {
            ZipEntry $$4;
            while (($$4 = $$3.getNextEntry()) != null) {
               String $$5 = $$4.getName();
               if ($$5.endsWith(".hex")) {
                  ezk.a.info("Found {}, loading", $$5);
                  ezk.a(new ath($$3), $$2);
               }
            }

            eyu<ezk.d> $$6 = new eyu<>(ezk.d[]::new, ezk.d[][]::new);

            for (ezk.g $$7 : this.d) {
               int $$8 = $$7.b;
               int $$9 = $$7.c;
               ezk.c $$10 = $$7.d;

               for (int $$11 = $$8; $$11 <= $$9; $$11++) {
                  ezk.f $$12 = $$1.b($$11);
                  if ($$12 != null) {
                     $$6.a($$11, new ezk.d($$12, $$10.c, $$10.d));
                  }
               }
            }

            $$1.a(($$1x, $$2x) -> {
               int $$3x = $$2x.d();
               int $$4x = ezk.c.a($$3x);
               int $$5 = ezk.c.b($$3x);
               $$6.a($$1x, new ezk.d($$2x, $$4x, $$5));
            });
            var17 = new ezk($$6);
         }

         return var17;
      }
   }

   public static record c(int c, int d) {
      public static final MapCodec<ezk.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.INT.fieldOf("left").forGetter(ezk.c::b), Codec.INT.fieldOf("right").forGetter(ezk.c::c)).apply($$0, ezk.c::new)
      );
      public static final Codec<ezk.c> b = a.codec();

      public int a() {
         return a(this.c, this.d);
      }

      public static int a(int $$0, int $$1) {
         return ($$0 & 0xFF) << 8 | $$1 & 0xFF;
      }

      public static int a(int $$0) {
         return (byte)($$0 >> 8);
      }

      public static int b(int $$0) {
         return (byte)$$0;
      }

      public int b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }

   static record d(ezk.f a, int b, int c) implements enf {

      public int c() {
         return this.c - this.b + 1;
      }

      @Override
      public float getAdvance() {
         return (float)(this.c() / 2 + 1);
      }

      @Override
      public float b() {
         return 0.5F;
      }

      @Override
      public float a() {
         return 0.5F;
      }

      @Override
      public eza bake(Function<enh, eza> $$0) {
         return $$0.apply(new enh() {
            @Override
            public float d() {
               return 2.0F;
            }

            @Override
            public int a() {
               return d.this.c();
            }

            @Override
            public int b() {
               return 16;
            }

            @Override
            public void a(int $$0, int $$1) {
               IntBuffer $$2 = MemoryUtil.memAllocInt(d.this.c() * 16);
               ezk.a($$2, d.this.a, d.this.b, d.this.c);
               $$2.rewind();
               GlStateManager.upload(0, $$0, $$1, d.this.c(), 16, eoe.a.a, $$2, MemoryUtil::memFree);
            }

            @Override
            public boolean c() {
               return true;
            }
         });
      }

      public ezk.f d() {
         return this.a;
      }

      public int e() {
         return this.b;
      }

      public int f() {
         return this.c;
      }
   }

   static record e(int[] a, int b) implements ezk.f {
      private static final int c = 24;

      @Override
      public int a(int $$0) {
         return this.a[$$0];
      }

      static ezk.f b(int $$0, ByteList $$1) {
         int[] $$2 = new int[16];
         int $$3 = 0;
         int $$4 = 0;

         for (int $$5 = 0; $$5 < 16; $$5++) {
            int $$6 = ezk.a($$0, $$1, $$4++);
            int $$7 = ezk.a($$0, $$1, $$4++);
            int $$8 = ezk.a($$0, $$1, $$4++);
            int $$9 = ezk.a($$0, $$1, $$4++);
            int $$10 = ezk.a($$0, $$1, $$4++);
            int $$11 = ezk.a($$0, $$1, $$4++);
            int $$12 = $$6 << 20 | $$7 << 16 | $$8 << 12 | $$9 << 8 | $$10 << 4 | $$11;
            $$2[$$5] = $$12 << 8;
            $$3 |= $$12;
         }

         return new ezk.e($$2, 24);
      }

      public static ezk.f a(int $$0, ByteList $$1) {
         int[] $$2 = new int[16];
         int $$3 = 0;
         int $$4 = 0;

         for (int $$5 = 0; $$5 < 16; $$5++) {
            int $$6 = ezk.a($$0, $$1, $$4++);
            int $$7 = ezk.a($$0, $$1, $$4++);
            int $$8 = ezk.a($$0, $$1, $$4++);
            int $$9 = ezk.a($$0, $$1, $$4++);
            int $$10 = ezk.a($$0, $$1, $$4++);
            int $$11 = ezk.a($$0, $$1, $$4++);
            int $$12 = ezk.a($$0, $$1, $$4++);
            int $$13 = ezk.a($$0, $$1, $$4++);
            int $$14 = $$6 << 28 | $$7 << 24 | $$8 << 20 | $$9 << 16 | $$10 << 12 | $$11 << 8 | $$12 << 4 | $$13;
            $$2[$$5] = $$14;
            $$3 |= $$14;
         }

         return new ezk.e($$2, 32);
      }

      public int[] b() {
         return this.a;
      }

      @Override
      public int a() {
         return this.b;
      }
   }

   public interface f {
      int a(int var1);

      int a();

      default int c() {
         int $$0 = 0;

         for (int $$1 = 0; $$1 < 16; $$1++) {
            $$0 |= this.a($$1);
         }

         return $$0;
      }

      default int d() {
         int $$0 = this.c();
         int $$1 = this.a();
         int $$2;
         int $$3;
         if ($$0 == 0) {
            $$2 = 0;
            $$3 = $$1;
         } else {
            $$2 = Integer.numberOfLeadingZeros($$0);
            $$3 = 32 - Integer.numberOfTrailingZeros($$0) - 1;
         }

         return ezk.c.a($$2, $$3);
      }
   }

   static record g(int b, int c, ezk.c d) {
      private static final Codec<ezk.g> e = RecordCodecBuilder.create(
         $$0 -> $$0.group(atg.w.fieldOf("from").forGetter(ezk.g::a), atg.w.fieldOf("to").forGetter(ezk.g::b), ezk.c.a.forGetter(ezk.g::c))
               .apply($$0, ezk.g::new)
      );
      public static final Codec<ezk.g> a = atg.a(
         e,
         (Function<ezk.g, DataResult<ezk.g>>)($$0 -> $$0.b >= $$0.c
               ? DataResult.error(() -> "Invalid range: [" + $$0.b + ";" + $$0.c + "]")
               : DataResult.success($$0))
      );

      public int a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public ezk.c c() {
         return this.d;
      }
   }

   @FunctionalInterface
   public interface h {
      void accept(int var1, ezk.f var2);
   }

   static record i(short[] a) implements ezk.f {
      @Override
      public int a(int $$0) {
         return this.a[$$0] << 16;
      }

      static ezk.f a(int $$0, ByteList $$1) {
         short[] $$2 = new short[16];
         int $$3 = 0;

         for (int $$4 = 0; $$4 < 16; $$4++) {
            int $$5 = ezk.a($$0, $$1, $$3++);
            int $$6 = ezk.a($$0, $$1, $$3++);
            int $$7 = ezk.a($$0, $$1, $$3++);
            int $$8 = ezk.a($$0, $$1, $$3++);
            short $$9 = (short)($$5 << 12 | $$6 << 8 | $$7 << 4 | $$8);
            $$2[$$4] = $$9;
         }

         return new ezk.i($$2);
      }

      @Override
      public int a() {
         return 16;
      }

      public short[] b() {
         return this.a;
      }
   }
}
