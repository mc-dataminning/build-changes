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

public class esb implements egm {
   static final Logger a = LogUtils.getLogger();
   private static final int b = 16;
   private static final int c = 2;
   private static final int d = 32;
   private static final int e = 64;
   private static final int f = 96;
   private static final int g = 128;
   private final erl<esb.d> h;

   esb(erl<esb.d> $$0) {
      this.h = $$0;
   }

   @Nullable
   @Override
   public egl a(int $$0) {
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

   static void a(IntBuffer $$0, esb.f $$1, int $$2, int $$3) {
      for (int $$4 = 0; $$4 < 16; $$4++) {
         int $$5 = $$1.a($$4);
         a($$0, $$5, $$2, $$3);
      }
   }

   @VisibleForTesting
   static void a(InputStream $$0, esb.h $$1) throws IOException {
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

         esb.f $$9 = switch ($$8) {
            case 32 -> esb.a.a($$2, $$3);
            case 64 -> esb.i.a($$2, $$3);
            case 96 -> esb.e.b($$2, $$3);
            case 128 -> esb.e.a($$2, $$3);
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

   static record a(byte[] a) implements esb.f {
      @Override
      public int a(int $$0) {
         return this.a[$$0] << 24;
      }

      static esb.f a(int $$0, ByteList $$1) {
         byte[] $$2 = new byte[16];
         int $$3 = 0;

         for (int $$4 = 0; $$4 < 16; $$4++) {
            int $$5 = esb.a($$0, $$1, $$3++);
            int $$6 = esb.a($$0, $$1, $$3++);
            byte $$7 = (byte)($$5 << 4 | $$6);
            $$2[$$4] = $$7;
         }

         return new esb.a($$2);
      }

      @Override
      public int a() {
         return 8;
      }

      public byte[] b() {
         return this.a;
      }
   }

   public static class b implements erx {
      public static final MapCodec<esb.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(acq.a.fieldOf("hex_file").forGetter($$0x -> $$0x.c), esb.g.a.listOf().fieldOf("size_overrides").forGetter($$0x -> $$0x.d))
               .apply($$0, esb.b::new)
      );
      private final acq c;
      private final List<esb.g> d;

      private b(acq $$0, List<esb.g> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public ery a() {
         return ery.d;
      }

      @Override
      public Either<erx.a, erx.b> b() {
         return Either.left(this::a);
      }

      private egm a(akx $$0) throws IOException {
         esb var3;
         try (InputStream $$1 = $$0.open(this.c)) {
            var3 = this.a($$1);
         }

         return var3;
      }

      private esb a(InputStream $$0) throws IOException {
         erl<esb.f> $$1 = new erl<>(esb.f[]::new, esb.f[][]::new);
         esb.h $$2 = $$1::a;

         esb var17;
         try (ZipInputStream $$3 = new ZipInputStream($$0)) {
            ZipEntry $$4;
            while (($$4 = $$3.getNextEntry()) != null) {
               String $$5 = $$4.getName();
               if ($$5.endsWith(".hex")) {
                  esb.a.info("Found {}, loading", $$5);
                  esb.a(new aoj($$3), $$2);
               }
            }

            erl<esb.d> $$6 = new erl<>(esb.d[]::new, esb.d[][]::new);

            for (esb.g $$7 : this.d) {
               int $$8 = $$7.b;
               int $$9 = $$7.c;
               esb.c $$10 = $$7.d;

               for (int $$11 = $$8; $$11 <= $$9; $$11++) {
                  esb.f $$12 = $$1.b($$11);
                  if ($$12 != null) {
                     $$6.a($$11, new esb.d($$12, $$10.c, $$10.d));
                  }
               }
            }

            $$1.a(($$1x, $$2x) -> {
               int $$3x = $$2x.d();
               int $$4x = esb.c.a($$3x);
               int $$5 = esb.c.b($$3x);
               $$6.a($$1x, new esb.d($$2x, $$4x, $$5));
            });
            var17 = new esb($$6);
         }

         return var17;
      }
   }

   public static record c(int c, int d) {
      public static final MapCodec<esb.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.INT.fieldOf("left").forGetter(esb.c::b), Codec.INT.fieldOf("right").forGetter(esb.c::c)).apply($$0, esb.c::new)
      );
      public static final Codec<esb.c> b = a.codec();

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

   static record d(esb.f a, int b, int c) implements egl {

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
      public err bake(Function<egn, err> $$0) {
         return $$0.apply(new egn() {
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
               esb.a($$2, d.this.a, d.this.b, d.this.c);
               $$2.rewind();
               GlStateManager.upload(0, $$0, $$1, d.this.c(), 16, ehk.a.a, $$2, MemoryUtil::memFree);
            }

            @Override
            public boolean c() {
               return true;
            }
         });
      }

      public esb.f d() {
         return this.a;
      }

      public int e() {
         return this.b;
      }

      public int f() {
         return this.c;
      }
   }

   static record e(int[] a, int b) implements esb.f {
      private static final int c = 24;

      @Override
      public int a(int $$0) {
         return this.a[$$0];
      }

      static esb.f b(int $$0, ByteList $$1) {
         int[] $$2 = new int[16];
         int $$3 = 0;
         int $$4 = 0;

         for (int $$5 = 0; $$5 < 16; $$5++) {
            int $$6 = esb.a($$0, $$1, $$4++);
            int $$7 = esb.a($$0, $$1, $$4++);
            int $$8 = esb.a($$0, $$1, $$4++);
            int $$9 = esb.a($$0, $$1, $$4++);
            int $$10 = esb.a($$0, $$1, $$4++);
            int $$11 = esb.a($$0, $$1, $$4++);
            int $$12 = $$6 << 20 | $$7 << 16 | $$8 << 12 | $$9 << 8 | $$10 << 4 | $$11;
            $$2[$$5] = $$12 << 8;
            $$3 |= $$12;
         }

         return new esb.e($$2, 24);
      }

      public static esb.f a(int $$0, ByteList $$1) {
         int[] $$2 = new int[16];
         int $$3 = 0;
         int $$4 = 0;

         for (int $$5 = 0; $$5 < 16; $$5++) {
            int $$6 = esb.a($$0, $$1, $$4++);
            int $$7 = esb.a($$0, $$1, $$4++);
            int $$8 = esb.a($$0, $$1, $$4++);
            int $$9 = esb.a($$0, $$1, $$4++);
            int $$10 = esb.a($$0, $$1, $$4++);
            int $$11 = esb.a($$0, $$1, $$4++);
            int $$12 = esb.a($$0, $$1, $$4++);
            int $$13 = esb.a($$0, $$1, $$4++);
            int $$14 = $$6 << 28 | $$7 << 24 | $$8 << 20 | $$9 << 16 | $$10 << 12 | $$11 << 8 | $$12 << 4 | $$13;
            $$2[$$5] = $$14;
            $$3 |= $$14;
         }

         return new esb.e($$2, 32);
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

         return esb.c.a($$2, $$3);
      }
   }

   static record g(int b, int c, esb.c d) {
      private static final Codec<esb.g> e = RecordCodecBuilder.create(
         $$0 -> $$0.group(aoi.v.fieldOf("from").forGetter(esb.g::a), aoi.v.fieldOf("to").forGetter(esb.g::b), esb.c.a.forGetter(esb.g::c))
               .apply($$0, esb.g::new)
      );
      public static final Codec<esb.g> a = aoi.a(
         e,
         (Function<esb.g, DataResult<esb.g>>)($$0 -> $$0.b >= $$0.c
               ? DataResult.error(() -> "Invalid range: [" + $$0.b + ";" + $$0.c + "]")
               : DataResult.success($$0))
      );

      public int a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public esb.c c() {
         return this.d;
      }
   }

   @FunctionalInterface
   public interface h {
      void accept(int var1, esb.f var2);
   }

   static record i(short[] a) implements esb.f {
      @Override
      public int a(int $$0) {
         return this.a[$$0] << 16;
      }

      static esb.f a(int $$0, ByteList $$1) {
         short[] $$2 = new short[16];
         int $$3 = 0;

         for (int $$4 = 0; $$4 < 16; $$4++) {
            int $$5 = esb.a($$0, $$1, $$3++);
            int $$6 = esb.a($$0, $$1, $$3++);
            int $$7 = esb.a($$0, $$1, $$3++);
            int $$8 = esb.a($$0, $$1, $$3++);
            short $$9 = (short)($$5 << 12 | $$6 << 8 | $$7 << 4 | $$8);
            $$2[$$4] = $$9;
         }

         return new esb.i($$2);
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
