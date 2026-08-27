import com.google.common.collect.Lists;
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public class fhy {
   private static final float d = 0.01F;
   private static final Vector3f e = new Vector3f(0.0F, 0.0F, 0.03F);
   public static final int a = 8;
   public final int b = 9;
   public final ayt c = ayt.a();
   private final Function<akt, fle> f;
   final boolean g;
   private final fgv h;

   public fhy(Function<akt, fle> $$0, boolean $$1) {
      this.f = $$0;
      this.g = $$1;
      this.h = new fgv(($$0x, $$1x) -> this.a($$1x.k()).a($$0x, this.g).a($$1x.b()));
   }

   fle a(akt $$0) {
      return this.f.apply($$0);
   }

   public String a(String $$0) {
      try {
         Bidi $$1 = new Bidi(new ArabicShaping(8).shape($$0), 127);
         $$1.setReorderingMode(0);
         return $$1.writeReordered(2);
      } catch (ArabicShapingException var3) {
         return $$0;
      }
   }

   public int a(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, gfg $$6, fhy.a $$7, int $$8, int $$9) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, this.a());
   }

   public int a(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, gfg $$6, fhy.a $$7, int $$8, int $$9, boolean $$10) {
      return this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10);
   }

   public int a(xe $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, gfg $$6, fhy.a $$7, int $$8, int $$9) {
      return this.a($$0.g(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public int a(axy $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, gfg $$6, fhy.a $$7, int $$8, int $$9) {
      return this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public void a(axy $$0, float $$1, float $$2, int $$3, int $$4, Matrix4f $$5, gfg $$6, int $$7) {
      int $$8 = a($$4);
      fhy.b $$9 = new fhy.b($$6, 0.0F, 0.0F, $$8, false, $$5, fhy.a.a, $$7);

      for (int $$10 = -1; $$10 <= 1; $$10++) {
         for (int $$11 = -1; $$11 <= 1; $$11++) {
            if ($$10 != 0 || $$11 != 0) {
               float[] $$12 = new float[]{$$1};
               int $$13 = $$10;
               int $$14 = $$11;
               $$0.accept(($$6x, $$7x, $$8x) -> {
                  boolean $$9x = $$7x.b();
                  fle $$10x = this.a($$7x.k());
                  eze $$11x = $$10x.a($$8x, this.g);
                  $$9.l = $$12[0] + (float)$$13 * $$11x.b();
                  $$9.m = $$2 + (float)$$14 * $$11x.b();
                  $$12[0] += $$11x.a($$9x);
                  return $$9.accept($$6x, $$7x.a($$8), $$8x);
               });
            }
         }
      }

      fhy.b $$15 = new fhy.b($$6, $$1, $$2, a($$3), false, $$5, fhy.a.c, $$7);
      $$0.accept($$15);
      $$15.a(0, $$1);
   }

   private static int a(int $$0) {
      return ($$0 & -67108864) == 0 ? $$0 | 0xFF000000 : $$0;
   }

   private int b(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, gfg $$6, fhy.a $$7, int $$8, int $$9, boolean $$10) {
      if ($$10) {
         $$0 = this.a($$0);
      }

      $$3 = a($$3);
      Matrix4f $$11 = new Matrix4f($$5);
      if ($$4) {
         this.b($$0, $$1, $$2, $$3, true, $$5, $$6, $$7, $$8, $$9);
         $$11.translate(e);
      }

      $$1 = this.b($$0, $$1, $$2, $$3, false, $$11, $$6, $$7, $$8, $$9);
      return (int)$$1 + ($$4 ? 1 : 0);
   }

   private int b(axy $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, gfg $$6, fhy.a $$7, int $$8, int $$9) {
      $$3 = a($$3);
      Matrix4f $$10 = new Matrix4f($$5);
      if ($$4) {
         this.c($$0, $$1, $$2, $$3, true, $$5, $$6, $$7, $$8, $$9);
         $$10.translate(e);
      }

      $$1 = this.c($$0, $$1, $$2, $$3, false, $$10, $$6, $$7, $$8, $$9);
      return (int)$$1 + ($$4 ? 1 : 0);
   }

   private float b(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, gfg $$6, fhy.a $$7, int $$8, int $$9) {
      fhy.b $$10 = new fhy.b($$6, $$1, $$2, $$3, $$4, $$5, $$7, $$9);
      azf.c($$0, yb.a, $$10);
      return $$10.a($$8, $$1);
   }

   private float c(axy $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, gfg $$6, fhy.a $$7, int $$8, int $$9) {
      fhy.b $$10 = new fhy.b($$6, $$1, $$2, $$3, $$4, $$5, $$7, $$9);
      $$0.accept($$10);
      return $$10.a($$8, $$1);
   }

   void a(fli $$0, boolean $$1, boolean $$2, float $$3, float $$4, float $$5, Matrix4f $$6, fbg $$7, float $$8, float $$9, float $$10, float $$11, int $$12) {
      $$0.a($$2, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12);
      if ($$1) {
         $$0.a($$2, $$4 + $$3, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   public int b(String $$0) {
      return aym.f(this.h.a($$0));
   }

   public int a(xj $$0) {
      return aym.f(this.h.a($$0));
   }

   public int a(axy $$0) {
      return aym.f(this.h.a($$0));
   }

   public String a(String $$0, int $$1, boolean $$2) {
      return $$2 ? this.h.c($$0, $$1, yb.a) : this.h.b($$0, $$1, yb.a);
   }

   public String a(String $$0, int $$1) {
      return this.h.b($$0, $$1, yb.a);
   }

   public xj a(xj $$0, int $$1) {
      return this.h.a($$0, $$1, yb.a);
   }

   public int b(String $$0, int $$1) {
      return 9 * this.h.g($$0, $$1, yb.a).size();
   }

   public int b(xj $$0, int $$1) {
      return 9 * this.h.b($$0, $$1, yb.a).size();
   }

   public List<axy> c(xj $$0, int $$1) {
      return uf.a().a(this.h.b($$0, $$1, yb.a));
   }

   public boolean a() {
      return uf.a().b();
   }

   public fgv b() {
      return this.h;
   }

   public static enum a {
      a,
      b,
      c;
   }

   class b implements axz {
      final gfg a;
      private final boolean c;
      private final float d;
      private final float e;
      private final float f;
      private final float g;
      private final float h;
      private final Matrix4f i;
      private final fhy.a j;
      private final int k;
      float l;
      float m;
      @Nullable
      private List<fli.a> n;

      private void a(fli.a $$0) {
         if (this.n == null) {
            this.n = Lists.newArrayList();
         }

         this.n.add($$0);
      }

      public b(gfg $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, fhy.a $$6, int $$7) {
         this.a = $$0;
         this.l = $$1;
         this.m = $$2;
         this.c = $$4;
         this.d = $$4 ? 0.25F : 1.0F;
         this.e = (float)($$3 >> 16 & 0xFF) / 255.0F * this.d;
         this.f = (float)($$3 >> 8 & 0xFF) / 255.0F * this.d;
         this.g = (float)($$3 & 0xFF) / 255.0F * this.d;
         this.h = (float)($$3 >> 24 & 0xFF) / 255.0F;
         this.i = $$5;
         this.j = $$6;
         this.k = $$7;
      }

      @Override
      public boolean accept(int $$0, yb $$1, int $$2) {
         fle $$3 = fhy.this.a($$1.k());
         eze $$4 = $$3.a($$2, fhy.this.g);
         fli $$5 = $$1.f() && $$2 != 32 ? $$3.a($$4) : $$3.a($$2);
         boolean $$6 = $$1.b();
         float $$7 = this.h;
         yd $$8 = $$1.a();
         float $$10;
         float $$11;
         float $$12;
         if ($$8 != null) {
            int $$9 = $$8.a();
            $$10 = (float)($$9 >> 16 & 0xFF) / 255.0F * this.d;
            $$11 = (float)($$9 >> 8 & 0xFF) / 255.0F * this.d;
            $$12 = (float)($$9 & 0xFF) / 255.0F * this.d;
         } else {
            $$10 = this.e;
            $$11 = this.f;
            $$12 = this.g;
         }

         float $$16;
         if ($$2 == 129364) {
            $$16 = 1.5F * aym.a(this.l + (float)ad.c() / 1.0E8F);
         } else {
            $$16 = 0.0F;
         }

         if (!($$5 instanceof flj)) {
            float $$18 = $$6 ? $$4.a() : 0.0F;
            float $$19 = this.c ? $$4.b() : 0.0F;
            fbg $$20 = this.a.getBuffer($$5.a(this.j));
            fhy.this.a($$5, $$6, $$1.c(), $$18, this.l + $$19, this.m + $$19 + $$16, this.i, $$20, $$10, $$11, $$12, $$7, this.k);
         }

         float $$21 = $$4.a($$6);
         float $$22 = this.c ? 1.0F : 0.0F;
         if ($$1.d()) {
            this.a(new fli.a(this.l + $$22 - 1.0F, this.m + $$22 + 4.5F, this.l + $$22 + $$21, this.m + $$22 + 4.5F - 1.0F, 0.01F, $$10, $$11, $$12, $$7));
         }

         if ($$1.e()) {
            this.a(new fli.a(this.l + $$22 - 1.0F, this.m + $$22 + 9.0F, this.l + $$22 + $$21, this.m + $$22 + 9.0F - 1.0F, 0.01F, $$10, $$11, $$12, $$7));
         }

         this.l += $$21;
         return true;
      }

      public float a(int $$0, float $$1) {
         if ($$0 != 0) {
            float $$2 = (float)($$0 >> 24 & 0xFF) / 255.0F;
            float $$3 = (float)($$0 >> 16 & 0xFF) / 255.0F;
            float $$4 = (float)($$0 >> 8 & 0xFF) / 255.0F;
            float $$5 = (float)($$0 & 0xFF) / 255.0F;
            this.a(new fli.a($$1 - 1.0F, this.m + 9.0F, this.l + 1.0F, this.m - 1.0F, 0.01F, $$3, $$4, $$5, $$2));
         }

         if (this.n != null) {
            fli $$6 = fhy.this.a(yb.b).b();
            fbg $$7 = this.a.getBuffer($$6.a(this.j));

            for (fli.a $$8 : this.n) {
               $$6.a($$8, this.i, $$7, this.k);
            }
         }

         return this.l;
      }
   }
}
