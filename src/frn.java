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

public class frn implements fer {
   static final Logger b = LogUtils.getLogger();
   private static final int c = 16;
   private static final int d = 2;
   private static final int e = 32;
   private static final int f = 64;
   private static final int g = 96;
   private static final int h = 128;
   private final fqv<frn.d> i;

   frn(fqv<frn.d> $$0) {
      this.i = $$0;
   }

   @Nullable
   @Override
   public feq a(int $$0) {
      return this.i.a($$0);
   }

   @Override
   public IntSet a() {
      return this.i.b();
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

   static void a(IntBuffer $$0, frn.f $$1, int $$2, int $$3) {
      for (int $$4 = 0; $$4 < 16; $$4++) {
         int $$5 = $$1.a($$4);
         a($$0, $$5, $$2, $$3);
      }
   }

   @VisibleForTesting
   static void a(InputStream $$0, frn.h $$1) throws IOException {
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

         frn.f $$9 = switch ($$8) {
            case 32 -> frn.a.a($$2, $$3);
            case 64 -> frn.i.a($$2, $$3);
            case 96 -> frn.e.b($$2, $$3);
            case 128 -> frn.e.a($$2, $$3);
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

   static record a(byte[] a) implements frn.f {
      @Override
      public int a(int $$0) {
         return this.a[$$0] << 24;
      }

      static frn.f a(int $$0, ByteList $$1) {
         byte[] $$2 = new byte[16];
         int $$3 = 0;

         for (int $$4 = 0; $$4 < 16; $$4++) {
            int $$5 = frn.a($$0, $$1, $$3++);
            int $$6 = frn.a($$0, $$1, $$3++);
            byte $$7 = (byte)($$5 << 4 | $$6);
            $$2[$$4] = $$7;
         }

         return new frn.a($$2);
      }

      @Override
      public int a() {
         return 8;
      }

      public byte[] b() {
         return this.a;
      }
   }

   public static class b implements frj {
      public static final MapCodec<frn.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alz.a.fieldOf("hex_file").forGetter($$0x -> $$0x.c), frn.g.a.listOf().fieldOf("size_overrides").forGetter($$0x -> $$0x.d))
               .apply($$0, frn.b::new)
      );
      private final alz c;
      private final List<frn.g> d;

      private b(alz $$0, List<frn.g> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public frk a() {
         return frk.d;
      }

      @Override
      public Either<frj.b, frj.c> b() {
         return Either.left(this::a);
      }

      private fer a(avv $$0) throws IOException {
         frn var3;
         try (InputStream $$1 = $$0.open(this.c)) {
            var3 = this.a($$1);
         }

         return var3;
      }

      private frn a(InputStream $$0) throws IOException {
         fqv<frn.f> $$1 = new fqv<>(frn.f[]::new, frn.f[][]::new);
         frn.h $$2 = $$1::a;

         frn var17;
         try (ZipInputStream $$3 = new ZipInputStream($$0)) {
            ZipEntry $$4;
            while (($$4 = $$3.getNextEntry()) != null) {
               String $$5 = $$4.getName();
               if ($$5.endsWith(".hex")) {
                  frn.b.info("Found {}, loading", $$5);
                  frn.a(new azo($$3), $$2);
               }
            }

            fqv<frn.d> $$6 = new fqv<>(frn.d[]::new, frn.d[][]::new);

            for (frn.g $$7 : this.d) {
               int $$8 = $$7.b;
               int $$9 = $$7.c;
               frn.c $$10 = $$7.d;

               for (int $$11 = $$8; $$11 <= $$9; $$11++) {
                  frn.f $$12 = $$1.b($$11);
                  if ($$12 != null) {
                     $$6.a($$11, new frn.d($$12, $$10.c, $$10.d));
                  }
               }
            }

            $$1.a(($$1x, $$2x) -> {
               int $$3x = $$2x.d();
               int $$4x = frn.c.a($$3x);
               int $$5 = frn.c.b($$3x);
               $$6.a($$1x, new frn.d($$2x, $$4x, $$5));
            });
            var17 = new frn($$6);
         }

         return var17;
      }
   }

   public static record c(int c, int d) {
      public static final MapCodec<frn.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.INT.fieldOf("left").forGetter(frn.c::b), Codec.INT.fieldOf("right").forGetter(frn.c::c)).apply($$0, frn.c::new)
      );
      public static final Codec<frn.c> b = a.codec();

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

   static record d(frn.f a, int b, int c) implements feq {

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
      public frc bake(Function<fes, frc> $$0) {
         return $$0.apply(new fes() {
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
               frn.a($$2, d.this.a, d.this.b, d.this.c);
               $$2.rewind();
               GlStateManager.upload(0, $$0, $$1, d.this.c(), 16, ffs.a.a, $$2, MemoryUtil::memFree);
            }

            @Override
            public boolean c() {
               return true;
            }
         });
      }

      public frn.f d() {
         return this.a;
      }

      public int e() {
         return this.b;
      }

      public int f() {
         return this.c;
      }
   }

   static record e(int[] a, int b) implements frn.f {
      private static final int c = 24;

      @Override
      public int a(int $$0) {
         return this.a[$$0];
      }

      static frn.f b(int $$0, ByteList $$1) {
         int[] $$2 = new int[16];
         int $$3 = 0;
         int $$4 = 0;

         for (int $$5 = 0; $$5 < 16; $$5++) {
            int $$6 = frn.a($$0, $$1, $$4++);
            int $$7 = frn.a($$0, $$1, $$4++);
            int $$8 = frn.a($$0, $$1, $$4++);
            int $$9 = frn.a($$0, $$1, $$4++);
            int $$10 = frn.a($$0, $$1, $$4++);
            int $$11 = frn.a($$0, $$1, $$4++);
            int $$12 = $$6 << 20 | $$7 << 16 | $$8 << 12 | $$9 << 8 | $$10 << 4 | $$11;
            $$2[$$5] = $$12 << 8;
            $$3 |= $$12;
         }

         return new frn.e($$2, 24);
      }

      public static frn.f a(int $$0, ByteList $$1) {
         int[] $$2 = new int[16];
         int $$3 = 0;
         int $$4 = 0;

         for (int $$5 = 0; $$5 < 16; $$5++) {
            int $$6 = frn.a($$0, $$1, $$4++);
            int $$7 = frn.a($$0, $$1, $$4++);
            int $$8 = frn.a($$0, $$1, $$4++);
            int $$9 = frn.a($$0, $$1, $$4++);
            int $$10 = frn.a($$0, $$1, $$4++);
            int $$11 = frn.a($$0, $$1, $$4++);
            int $$12 = frn.a($$0, $$1, $$4++);
            int $$13 = frn.a($$0, $$1, $$4++);
            int $$14 = $$6 << 28 | $$7 << 24 | $$8 << 20 | $$9 << 16 | $$10 << 12 | $$11 << 8 | $$12 << 4 | $$13;
            $$2[$$5] = $$14;
            $$3 |= $$14;
         }

         return new frn.e($$2, 32);
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

         return frn.c.a($$2, $$3);
      }
   }

   static record g(int b, int c, frn.c d) {
      private static final Codec<frn.g> e = RecordCodecBuilder.create(
         $$0 -> $$0.group(azn.B.fieldOf("from").forGetter(frn.g::a), azn.B.fieldOf("to").forGetter(frn.g::b), frn.c.a.forGetter(frn.g::c))
               .apply($$0, frn.g::new)
      );
      public static final Codec<frn.g> a = e.validate(
         $$0 -> $$0.b >= $$0.c ? DataResult.error(() -> "Invalid range: [" + $$0.b + ";" + $$0.c + "]") : DataResult.success($$0)
      );

      public int a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public frn.c c() {
         return this.d;
      }
   }

   @FunctionalInterface
   public interface h {
      void accept(int var1, frn.f var2);
   }

   static record i(short[] a) implements frn.f {
      @Override
      public int a(int $$0) {
         return this.a[$$0] << 16;
      }

      static frn.f a(int $$0, ByteList $$1) {
         short[] $$2 = new short[16];
         int $$3 = 0;

         for (int $$4 = 0; $$4 < 16; $$4++) {
            int $$5 = frn.a($$0, $$1, $$3++);
            int $$6 = frn.a($$0, $$1, $$3++);
            int $$7 = frn.a($$0, $$1, $$3++);
            int $$8 = frn.a($$0, $$1, $$3++);
            short $$9 = (short)($$5 << 12 | $$6 << 8 | $$7 << 4 | $$8);
            $$2[$$4] = $$9;
         }

         return new frn.i($$2);
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
