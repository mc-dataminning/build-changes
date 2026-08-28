import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Locale;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Bitmap;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FT_GlyphSlot;
import org.lwjgl.util.freetype.FT_Vector;
import org.lwjgl.util.freetype.FreeType;

public class fbv implements fbs {
   @Nullable
   private ByteBuffer b;
   @Nullable
   private FT_Face c;
   final float d;
   private final fno<fbv.b> e = new fno<>(fbv.b[]::new, fbv.b[][]::new);

   public fbv(ByteBuffer $$0, FT_Face $$1, float $$2, float $$3, float $$4, float $$5, String $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$3;
      IntSet $$7 = new IntArraySet();
      $$6.codePoints().forEach($$7::add);
      int $$8 = Math.round($$2 * $$3);
      FreeType.FT_Set_Pixel_Sizes($$1, $$8, $$8);
      float $$9 = $$4 * $$3;
      float $$10 = -$$5 * $$3;
      MemoryStack $$11 = MemoryStack.stackPush();

      try {
         FT_Vector $$12 = fob.a(FT_Vector.malloc($$11), $$9, $$10);
         FreeType.FT_Set_Transform($$1, null, $$12);
         IntBuffer $$13 = $$11.mallocInt(1);
         int $$14 = (int)FreeType.FT_Get_First_Char($$1, $$13);

         while (true) {
            int $$15 = $$13.get(0);
            if ($$15 == 0) {
               break;
            }

            if (!$$7.contains($$14)) {
               this.e.a($$14, new fbv.b($$15));
            }

            $$14 = (int)FreeType.FT_Get_Next_Char($$1, (long)$$14, $$13);
         }
      } catch (Throwable var18) {
         if ($$11 != null) {
            try {
               $$11.close();
            } catch (Throwable var17) {
               var18.addSuppressed(var17);
            }
         }

         throw var18;
      }

      if ($$11 != null) {
         $$11.close();
      }
   }

   @Nullable
   @Override
   public fbr a(int $$0) {
      fbv.b $$1 = this.e.a($$0);
      return $$1 != null ? this.a($$0, $$1) : null;
   }

   private fbr a(int $$0, fbv.b $$1) {
      fbr $$2 = $$1.b;
      if ($$2 == null) {
         FT_Face $$3 = this.b();
         synchronized ($$3) {
            $$2 = $$1.b;
            if ($$2 == null) {
               $$2 = this.a($$0, $$3, $$1.a);
               $$1.b = $$2;
            }
         }
      }

      return $$2;
   }

   private fbr a(int $$0, FT_Face $$1, int $$2) {
      int $$3 = FreeType.FT_Load_Glyph($$1, $$2, 4194312);
      if ($$3 != 0) {
         fob.a($$3, String.format(Locale.ROOT, "Loading glyph U+%06X", $$0));
      }

      FT_GlyphSlot $$4 = $$1.glyph();
      if ($$4 == null) {
         throw new NullPointerException(String.format(Locale.ROOT, "Glyph U+%06X not initialized", $$0));
      } else {
         float $$5 = fob.a($$4.advance());
         FT_Bitmap $$6 = $$4.bitmap();
         int $$7 = $$4.bitmap_left();
         int $$8 = $$4.bitmap_top();
         int $$9 = $$6.width();
         int $$10 = $$6.rows();
         return (fbr)($$9 > 0 && $$10 > 0 ? new fbv.a((float)$$7, (float)$$8, $$9, $$10, $$5, $$2) : () -> $$5 / this.d);
      }
   }

   FT_Face b() {
      if (this.b != null && this.c != null) {
         return this.c;
      } else {
         throw new IllegalStateException("Provider already closed");
      }
   }

   @Override
   public void close() {
      if (this.c != null) {
         synchronized (fob.a) {
            fob.b(FreeType.FT_Done_Face(this.c), "Deleting face");
         }

         this.c = null;
      }

      MemoryUtil.memFree(this.b);
      this.b = null;
   }

   @Override
   public IntSet a() {
      return this.e.b();
   }

   class a implements fbr {
      final int b;
      final int c;
      final float d;
      final float e;
      private final float f;
      final int g;

      a(final float $$0, final float $$1, final int $$2, final int $$3, final float $$4, final int $$5) {
         this.b = $$2;
         this.c = $$3;
         this.f = $$4 / fbv.this.d;
         this.d = $$0 / fbv.this.d;
         this.e = $$1 / fbv.this.d;
         this.g = $$5;
      }

      @Override
      public float getAdvance() {
         return this.f;
      }

      @Override
      public fnv bake(Function<fbt, fnv> $$0) {
         return $$0.apply(new fbt() {
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
               return fbv.this.d;
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
               FT_Face $$2 = fbv.this.b();
               fct $$3 = new fct(fct.a.d, a.this.b, a.this.c, false);
               if ($$3.a($$2, a.this.g)) {
                  $$3.a(0, $$0, $$1, 0, 0, a.this.b, a.this.c, false, true);
               } else {
                  $$3.close();
               }
            }

            @Override
            public boolean c() {
               return false;
            }
         });
      }
   }

   static class b {
      final int a;
      @Nullable
      volatile fbr b;

      b(int $$0) {
         this.a = $$0;
      }
   }
}
