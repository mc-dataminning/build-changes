import com.google.common.collect.Lists;
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public class fnp {
   private static final float d = 0.01F;
   private static final Vector3f e = new Vector3f(0.0F, 0.0F, 0.03F);
   public static final int a = 8;
   public final int b = 9;
   public final bam c = bam.a();
   private final Function<alz, fqx> f;
   final boolean g;
   private final fmp h;

   public fnp(Function<alz, fqx> $$0, boolean $$1) {
      this.f = $$0;
      this.g = $$1;
      this.h = new fmp(($$0x, $$1x) -> this.a($$1x.k()).a($$0x, this.g).a($$1x.b()));
   }

   fqx a(alz $$0) {
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

   public int a(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, glk $$6, fnp.a $$7, int $$8, int $$9) {
      if (this.a()) {
         $$0 = this.a($$0);
      }

      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, true);
   }

   public int a(xv $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, glk $$6, fnp.a $$7, int $$8, int $$9) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, true);
   }

   public int a(xv $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, glk $$6, fnp.a $$7, int $$8, int $$9, boolean $$10) {
      return this.a($$0.g(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10);
   }

   public int a(azq $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, glk $$6, fnp.a $$7, int $$8, int $$9) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, true);
   }

   public void a(azq $$0, float $$1, float $$2, int $$3, int $$4, Matrix4f $$5, glk $$6, int $$7) {
      int $$8 = a($$4);
      fnp.b $$9 = new fnp.b(this, $$6, 0.0F, 0.0F, $$8, false, $$5, fnp.a.a, $$7);

      for (int $$10 = -1; $$10 <= 1; $$10++) {
         for (int $$11 = -1; $$11 <= 1; $$11++) {
            if ($$10 != 0 || $$11 != 0) {
               float[] $$12 = new float[]{$$1};
               int $$13 = $$10;
               int $$14 = $$11;
               $$0.accept(($$6x, $$7x, $$8x) -> {
                  boolean $$9x = $$7x.b();
                  fqx $$10x = this.a($$7x.k());
                  fep $$11x = $$10x.a($$8x, this.g);
                  $$9.k = $$12[0] + (float)$$13 * $$11x.b();
                  $$9.l = $$2 + (float)$$14 * $$11x.b();
                  $$12[0] += $$11x.a($$9x);
                  return $$9.accept($$6x, $$7x.a($$8), $$8x);
               });
            }
         }
      }

      $$9.a();
      fnp.b $$15 = new fnp.b(this, $$6, $$1, $$2, a($$3), false, $$5, fnp.a.c, $$7);
      $$0.accept($$15);
      $$15.a($$1);
   }

   private static int a(int $$0) {
      return ($$0 & -67108864) == 0 ? ayp.f($$0) : $$0;
   }

   private int a(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, glk $$6, fnp.a $$7, int $$8, int $$9, boolean $$10) {
      $$3 = a($$3);
      Matrix4f $$11 = new Matrix4f($$5);
      if ($$4) {
         this.b($$0, $$1, $$2, $$3, true, $$5, $$6, $$7, $$8, $$9, $$10);
         $$11.translate(e);
      }

      $$1 = this.b($$0, $$1, $$2, $$3, false, $$11, $$6, $$7, $$8, $$9, $$10);
      return (int)$$1 + ($$4 ? 1 : 0);
   }

   private int a(azq $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, glk $$6, fnp.a $$7, int $$8, int $$9, boolean $$10) {
      $$3 = a($$3);
      Matrix4f $$11 = new Matrix4f($$5);
      if ($$4) {
         this.b($$0, $$1, $$2, $$3, true, $$5, $$6, $$7, $$8, $$9, $$10);
         $$11.translate(e);
      }

      $$1 = this.b($$0, $$1, $$2, $$3, false, $$11, $$6, $$7, $$8, $$9, $$10);
      return (int)$$1 + ($$4 ? 1 : 0);
   }

   private float b(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, glk $$6, fnp.a $$7, int $$8, int $$9, boolean $$10) {
      fnp.b $$11 = new fnp.b(this, $$6, $$1, $$2, $$3, $$8, $$4, $$5, $$7, $$9, $$10);
      baz.c($$0, ys.a, $$11);
      return $$11.a($$1);
   }

   private float b(azq $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, glk $$6, fnp.a $$7, int $$8, int $$9, boolean $$10) {
      fnp.b $$11 = new fnp.b(this, $$6, $$1, $$2, $$3, $$8, $$4, $$5, $$7, $$9, $$10);
      $$0.accept($$11);
      return $$11.a($$1);
   }

   public int b(String $$0) {
      return bae.f(this.h.a($$0));
   }

   public int a(ya $$0) {
      return bae.f(this.h.a($$0));
   }

   public int a(azq $$0) {
      return bae.f(this.h.a($$0));
   }

   public String a(String $$0, int $$1, boolean $$2) {
      return $$2 ? this.h.c($$0, $$1, ys.a) : this.h.b($$0, $$1, ys.a);
   }

   public String a(String $$0, int $$1) {
      return this.h.b($$0, $$1, ys.a);
   }

   public ya a(ya $$0, int $$1) {
      return this.h.a($$0, $$1, ys.a);
   }

   public int b(String $$0, int $$1) {
      return 9 * this.h.g($$0, $$1, ys.a).size();
   }

   public int b(ya $$0, int $$1) {
      return 9 * this.h.b($$0, $$1, ys.a).size();
   }

   public List<azq> c(ya $$0, int $$1) {
      return us.a().a(this.h.b($$0, $$1, ys.a));
   }

   public boolean a() {
      return us.a().b();
   }

   public fmp b() {
      return this.h;
   }

   public static enum a {
      a,
      b,
      c;
   }

   class b implements azr {
      final glk a;
      private final boolean c;
      private final float d;
      private final int e;
      private final int f;
      private final Matrix4f g;
      private final fnp.a h;
      private final int i;
      private final boolean j;
      float k;
      float l;
      private final List<frb.b> m;
      @Nullable
      private List<frb.a> n;

      private void a(frb.a $$0) {
         if (this.n == null) {
            this.n = Lists.newArrayList();
         }

         this.n.add($$0);
      }

      public b(
         final fnp param1,
         final glk $$0,
         final float $$1,
         final float $$2,
         final int $$3,
         final boolean $$4,
         final Matrix4f $$5,
         final fnp.a $$6,
         final int $$7
      ) {
         this(var1, $$0, $$1, $$2, $$3, 0, $$4, $$5, $$6, $$7, true);
      }

      public b(
         final fnp param1,
         final glk $$0,
         final float $$1,
         final float $$2,
         final int $$3,
         final int $$4,
         final boolean $$5,
         final Matrix4f $$6,
         final fnp.a $$7,
         final int $$8,
         final boolean $$9
      ) {
         this.b = var1;
         this.m = new ArrayList<>();
         this.a = $$0;
         this.k = $$1;
         this.l = $$2;
         this.c = $$5;
         this.d = $$5 ? 0.25F : 1.0F;
         this.e = ayp.a($$3, this.d);
         this.f = $$4;
         this.g = $$6;
         this.h = $$7;
         this.i = $$8;
         this.j = $$9;
      }

      @Override
      public boolean accept(int $$0, ys $$1, int $$2) {
         fqx $$3 = this.b.a($$1.k());
         fep $$4 = $$3.a($$2, this.b.g);
         frb $$5 = $$1.f() && $$2 != 32 ? $$3.a($$4) : $$3.a($$2);
         boolean $$6 = $$1.b();
         yu $$7 = $$1.a();
         int $$8 = $$7 != null ? ayp.c(ayp.a(this.e), ayp.a($$7.a(), this.d)) : this.e;
         float $$9 = $$4.a($$6);
         float $$10 = $$0 == 0 ? this.k - 1.0F : this.k;
         if (!($$5 instanceof frc)) {
            float $$11 = $$6 ? $$4.a() : 0.0F;
            float $$12 = this.c ? $$4.b() : 0.0F;
            this.m.add(new frb.b(this.k + $$12, this.l + $$12, $$8, $$5, $$1, $$11));
         }

         float $$13 = this.c ? 1.0F : 0.0F;
         if ($$1.d()) {
            this.a(new frb.a($$10 + $$13, this.l + $$13 + 4.5F, this.k + $$13 + $$9, this.l + $$13 + 4.5F - 1.0F, this.b(), $$8));
         }

         if ($$1.e()) {
            this.a(new frb.a($$10 + $$13, this.l + $$13 + 9.0F, this.k + $$13 + $$9, this.l + $$13 + 9.0F - 1.0F, this.b(), $$8));
         }

         this.k += $$9;
         return true;
      }

      float a(float $$0) {
         frb $$1 = null;
         if (this.f != 0) {
            frb.a $$2 = new frb.a($$0 - 1.0F, this.l + 9.0F, this.k, this.l - 1.0F, this.c(), this.f);
            $$1 = this.b.a(ys.b).b();
            fgv $$3 = this.a.getBuffer($$1.a(this.h));
            $$1.a($$2, this.g, $$3, this.i);
         }

         this.a();
         if (this.n != null) {
            if ($$1 == null) {
               $$1 = this.b.a(ys.b).b();
            }

            fgv $$4 = this.a.getBuffer($$1.a(this.h));

            for (frb.a $$5 : this.n) {
               $$1.a($$5, this.g, $$4, this.i);
            }
         }

         return this.k;
      }

      void a() {
         for (frb.b $$0 : this.m) {
            frb $$1 = $$0.d();
            fgv $$2 = this.a.getBuffer($$1.a(this.h));
            $$1.a($$0, this.g, $$2, this.i);
         }
      }

      private float b() {
         return this.j ? 0.01F : -0.01F;
      }

      private float c() {
         return this.j ? -0.01F : 0.01F;
      }
   }
}
