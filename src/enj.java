import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.function.Function;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTruetype;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class enj implements eng {
   @Nullable
   private ByteBuffer a;
   @Nullable
   private STBTTFontinfo b;
   final float c;
   private final IntSet d = new IntArraySet();
   final float e;
   final float f;
   final float g;
   final float h;

   public enj(ByteBuffer $$0, STBTTFontinfo $$1, float $$2, float $$3, float $$4, float $$5, String $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$3;
      $$6.codePoints().forEach(this.d::add);
      this.e = $$4 * $$3;
      this.f = $$5 * $$3;
      this.g = STBTruetype.stbtt_ScaleForPixelHeight($$1, $$2 * $$3);
      MemoryStack $$7 = MemoryStack.stackPush();

      try {
         IntBuffer $$8 = $$7.mallocInt(1);
         IntBuffer $$9 = $$7.mallocInt(1);
         IntBuffer $$10 = $$7.mallocInt(1);
         STBTruetype.stbtt_GetFontVMetrics($$1, $$8, $$9, $$10);
         this.h = (float)$$8.get(0) * this.g;
      } catch (Throwable var13) {
         if ($$7 != null) {
            try {
               $$7.close();
            } catch (Throwable var12) {
               var13.addSuppressed(var12);
            }
         }

         throw var13;
      }

      if ($$7 != null) {
         $$7.close();
      }
   }

   @Nullable
   @Override
   public enf a(int $$0) {
      STBTTFontinfo $$1 = this.b();
      if (this.d.contains($$0)) {
         return null;
      } else {
         MemoryStack $$2 = MemoryStack.stackPush();

         Object var17;
         label61: {
            enf var18;
            label62: {
               try {
                  int $$3 = STBTruetype.stbtt_FindGlyphIndex($$1, $$0);
                  if ($$3 == 0) {
                     var17 = null;
                     break label61;
                  }

                  IntBuffer $$4 = $$2.mallocInt(1);
                  IntBuffer $$5 = $$2.mallocInt(1);
                  IntBuffer $$6 = $$2.mallocInt(1);
                  IntBuffer $$7 = $$2.mallocInt(1);
                  IntBuffer $$8 = $$2.mallocInt(1);
                  IntBuffer $$9 = $$2.mallocInt(1);
                  STBTruetype.stbtt_GetGlyphHMetrics($$1, $$3, $$8, $$9);
                  STBTruetype.stbtt_GetGlyphBitmapBoxSubpixel($$1, $$3, this.g, this.g, this.e, this.f, $$4, $$5, $$6, $$7);
                  float $$10 = (float)$$8.get(0) * this.g;
                  int $$11 = $$6.get(0) - $$4.get(0);
                  int $$12 = $$7.get(0) - $$5.get(0);
                  if ($$11 > 0 && $$12 > 0) {
                     var18 = new enj.a($$4.get(0), $$6.get(0), -$$5.get(0), -$$7.get(0), $$10, (float)$$9.get(0) * this.g, $$3);
                     break label62;
                  }

                  var18 = () -> $$10 / this.c;
               } catch (Throwable var16) {
                  if ($$2 != null) {
                     try {
                        $$2.close();
                     } catch (Throwable var15) {
                        var16.addSuppressed(var15);
                     }
                  }

                  throw var16;
               }

               if ($$2 != null) {
                  $$2.close();
               }

               return var18;
            }

            if ($$2 != null) {
               $$2.close();
            }

            return var18;
         }

         if ($$2 != null) {
            $$2.close();
         }

         return (enf)var17;
      }
   }

   STBTTFontinfo b() {
      if (this.a != null && this.b != null) {
         return this.b;
      } else {
         throw new IllegalArgumentException("Provider already closed");
      }
   }

   @Override
   public void close() {
      if (this.b != null) {
         this.b.free();
         this.b = null;
      }

      MemoryUtil.memFree(this.a);
      this.a = null;
   }

   @Override
   public IntSet a() {
      return IntStream.range(0, 65535).filter($$0 -> !this.d.contains($$0)).collect(IntOpenHashSet::new, IntCollection::add, IntCollection::addAll);
   }

   class a implements enf {
      final int b;
      final int c;
      final float d;
      final float e;
      private final float f;
      final int g;

      a(int $$0, int $$1, int $$2, int $$3, float $$4, float $$5, int $$6) {
         this.b = $$1 - $$0;
         this.c = $$2 - $$3;
         this.f = $$4 / enj.this.c;
         this.d = ($$5 + (float)$$0 + enj.this.e) / enj.this.c;
         this.e = (enj.this.h - (float)$$2 + enj.this.f) / enj.this.c;
         this.g = $$6;
      }

      @Override
      public float getAdvance() {
         return this.f;
      }

      @Override
      public eza bake(Function<enh, eza> $$0) {
         return $$0.apply(new enh() {
            @Override
            public int a() {
               return a.this.b;
            }

            @Override
            public int b() {
               return a.this.c;
            }

            @Override
            public float d() {
               return enj.this.c;
            }

            @Override
            public float i() {
               return a.this.d;
            }

            @Override
            public float j() {
               return a.this.e;
            }

            @Override
            public void a(int $$0, int $$1) {
               STBTTFontinfo $$2 = enj.this.b();
               eoe $$3 = new eoe(eoe.a.d, a.this.b, a.this.c, false);
               $$3.a($$2, a.this.g, a.this.b, a.this.c, enj.this.g, enj.this.g, enj.this.e, enj.this.f, 0, 0);
               $$3.a(0, $$0, $$1, 0, 0, a.this.b, a.this.c, false, true);
            }

            @Override
            public boolean c() {
               return false;
            }
         });
      }
   }
}
