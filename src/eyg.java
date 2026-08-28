import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Bitmap;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FT_GlyphSlot;
import org.lwjgl.util.freetype.FT_Vector;
import org.lwjgl.util.freetype.FreeType;

public class eyg implements eyd {
   @Nullable
   private ByteBuffer b;
   @Nullable
   private FT_Face c;
   final float d;
   private final IntSet e = new IntArraySet();

   public eyg(ByteBuffer $$0, FT_Face $$1, float $$2, float $$3, float $$4, float $$5, String $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$3;
      $$6.codePoints().forEach(this.e::add);
      int $$7 = Math.round($$2 * $$3);
      FreeType.FT_Set_Pixel_Sizes($$1, $$7, $$7);
      float $$8 = $$4 * $$3;
      float $$9 = -$$5 * $$3;
      MemoryStack $$10 = MemoryStack.stackPush();

      try {
         FT_Vector $$11 = fkh.a(FT_Vector.malloc($$10), $$8, $$9);
         FreeType.FT_Set_Transform($$1, null, $$11);
      } catch (Throwable var15) {
         if ($$10 != null) {
            try {
               $$10.close();
            } catch (Throwable var14) {
               var15.addSuppressed(var14);
            }
         }

         throw var15;
      }

      if ($$10 != null) {
         $$10.close();
      }
   }

   @Nullable
   @Override
   public eyc a(int $$0) {
      FT_Face $$1 = this.b();
      if (this.e.contains($$0)) {
         return null;
      } else {
         int $$2 = FreeType.FT_Get_Char_Index($$1, (long)$$0);
         if ($$2 == 0) {
            return null;
         } else {
            fkh.a(FreeType.FT_Load_Glyph($$1, $$2, 4194312), "Loading glyph");
            FT_GlyphSlot $$3 = Objects.requireNonNull($$1.glyph(), "Glyph not initialized");
            float $$4 = fkh.a($$3.advance());
            FT_Bitmap $$5 = $$3.bitmap();
            int $$6 = $$3.bitmap_left();
            int $$7 = $$3.bitmap_top();
            int $$8 = $$5.width();
            int $$9 = $$5.rows();
            return (eyc)($$8 > 0 && $$9 > 0 ? new eyg.a((float)$$6, (float)$$7, $$8, $$9, $$4, $$2) : () -> $$4 / this.d);
         }
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
         synchronized (fkh.a) {
            fkh.b(FreeType.FT_Done_Face(this.c), "Deleting face");
         }

         this.c = null;
      }

      MemoryUtil.memFree(this.b);
      this.b = null;
   }

   @Override
   public IntSet a() {
      FT_Face $$0 = this.b();
      IntSet $$1 = new IntOpenHashSet();
      MemoryStack $$2 = MemoryStack.stackPush();

      try {
         IntBuffer $$3 = $$2.mallocInt(1);

         for (long $$4 = FreeType.FT_Get_First_Char($$0, $$3); $$3.get(0) != 0; $$4 = FreeType.FT_Get_Next_Char($$0, $$4, $$3)) {
            $$1.add((int)$$4);
         }
      } catch (Throwable var8) {
         if ($$2 != null) {
            try {
               $$2.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if ($$2 != null) {
         $$2.close();
      }

      $$1.removeAll(this.e);
      return $$1;
   }

   class a implements eyc {
      final int b;
      final int c;
      final float d;
      final float e;
      private final float f;
      final int g;

      a(final float $$0, final float $$1, final int $$2, final int $$3, final float $$4, final int $$5) {
         this.b = $$2;
         this.c = $$3;
         this.f = $$4 / eyg.this.d;
         this.d = $$0 / eyg.this.d;
         this.e = $$1 / eyg.this.d;
         this.g = $$5;
      }

      @Override
      public float getAdvance() {
         return this.f;
      }

      @Override
      public fkb bake(Function<eye, fkb> $$0) {
         return $$0.apply(new eye() {
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
               return eyg.this.d;
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
               FT_Face $$2 = eyg.this.b();
               ezb $$3 = new ezb(ezb.a.d, a.this.b, a.this.c, false);
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
}
