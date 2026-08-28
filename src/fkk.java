import com.google.common.collect.Lists;
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public class fkk {
   private static final float d = 0.01F;
   private static final Vector3f e = new Vector3f(0.0F, 0.0F, 0.03F);
   public static final int a = 8;
   public final int b = 9;
   public final azr c = azr.a();
   private final Function<alh, fnr> f;
   final boolean g;
   private final fjl h;

   public fkk(Function<alh, fnr> $$0, boolean $$1) {
      this.f = $$0;
      this.g = $$1;
      this.h = new fjl(($$0x, $$1x) -> this.a($$1x.k()).a($$0x, this.g).a($$1x.b()));
   }

   fnr a(alh $$0) {
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

   public int a(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, ghw $$6, fkk.a $$7, int $$8, int $$9) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, this.a());
   }

   public int a(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, ghw $$6, fkk.a $$7, int $$8, int $$9, boolean $$10) {
      return this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10);
   }

   public int a(xh $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, ghw $$6, fkk.a $$7, int $$8, int $$9) {
      return this.a($$0.g(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public int a(ayv $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, ghw $$6, fkk.a $$7, int $$8, int $$9) {
      return this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public void a(ayv $$0, float $$1, float $$2, int $$3, int $$4, Matrix4f $$5, ghw $$6, int $$7) {
      int $$8 = a($$4);
      fkk.b $$9 = new fkk.b($$6, 0.0F, 0.0F, $$8, false, $$5, fkk.a.a, $$7);

      for (int $$10 = -1; $$10 <= 1; $$10++) {
         for (int $$11 = -1; $$11 <= 1; $$11++) {
            if ($$10 != 0 || $$11 != 0) {
               float[] $$12 = new float[]{$$1};
               int $$13 = $$10;
               int $$14 = $$11;
               $$0.accept(($$6x, $$7x, $$8x) -> {
                  boolean $$9x = $$7x.b();
                  fnr $$10x = this.a($$7x.k());
                  fbr $$11x = $$10x.a($$8x, this.g);
                  $$9.l = $$12[0] + (float)$$13 * $$11x.b();
                  $$9.m = $$2 + (float)$$14 * $$11x.b();
                  $$12[0] += $$11x.a($$9x);
                  return $$9.accept($$6x, $$7x.a($$8), $$8x);
               });
            }
         }
      }

      fkk.b $$15 = new fkk.b($$6, $$1, $$2, a($$3), false, $$5, fkk.a.c, $$7);
      $$0.accept($$15);
      $$15.a(0, $$1);
   }

   private static int a(int $$0) {
      return ($$0 & -67108864) == 0 ? axu.f($$0) : $$0;
   }

   private int b(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, ghw $$6, fkk.a $$7, int $$8, int $$9, boolean $$10) {
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

   private int b(ayv $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, ghw $$6, fkk.a $$7, int $$8, int $$9) {
      $$3 = a($$3);
      Matrix4f $$10 = new Matrix4f($$5);
      if ($$4) {
         this.c($$0, $$1, $$2, $$3, true, $$5, $$6, $$7, $$8, $$9);
         $$10.translate(e);
      }

      $$1 = this.c($$0, $$1, $$2, $$3, false, $$10, $$6, $$7, $$8, $$9);
      return (int)$$1 + ($$4 ? 1 : 0);
   }

   private float b(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, ghw $$6, fkk.a $$7, int $$8, int $$9) {
      fkk.b $$10 = new fkk.b($$6, $$1, $$2, $$3, $$4, $$5, $$7, $$9);
      bae.c($$0, ye.a, $$10);
      return $$10.a($$8, $$1);
   }

   private float c(ayv $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, ghw $$6, fkk.a $$7, int $$8, int $$9) {
      fkk.b $$10 = new fkk.b($$6, $$1, $$2, $$3, $$4, $$5, $$7, $$9);
      $$0.accept($$10);
      return $$10.a($$8, $$1);
   }

   void a(fnv $$0, boolean $$1, boolean $$2, float $$3, float $$4, float $$5, Matrix4f $$6, fdx $$7, float $$8, float $$9, float $$10, float $$11, int $$12) {
      $$0.a($$2, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12);
      if ($$1) {
         $$0.a($$2, $$4 + $$3, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   public int b(String $$0) {
      return azj.f(this.h.a($$0));
   }

   public int a(xm $$0) {
      return azj.f(this.h.a($$0));
   }

   public int a(ayv $$0) {
      return azj.f(this.h.a($$0));
   }

   public String a(String $$0, int $$1, boolean $$2) {
      return $$2 ? this.h.c($$0, $$1, ye.a) : this.h.b($$0, $$1, ye.a);
   }

   public String a(String $$0, int $$1) {
      return this.h.b($$0, $$1, ye.a);
   }

   public xm a(xm $$0, int $$1) {
      return this.h.a($$0, $$1, ye.a);
   }

   public int b(String $$0, int $$1) {
      return 9 * this.h.g($$0, $$1, ye.a).size();
   }

   public int b(xm $$0, int $$1) {
      return 9 * this.h.b($$0, $$1, ye.a).size();
   }

   public List<ayv> c(xm $$0, int $$1) {
      return ue.a().a(this.h.b($$0, $$1, ye.a));
   }

   public boolean a() {
      return ue.a().b();
   }

   public fjl b() {
      return this.h;
   }

   public static enum a {
      a,
      b,
      c;
   }

   class b implements ayw {
      final ghw a;
      private final boolean c;
      private final float d;
      private final float e;
      private final float f;
      private final float g;
      private final float h;
      private final Matrix4f i;
      private final fkk.a j;
      private final int k;
      float l;
      float m;
      @Nullable
      private List<fnv.a> n;

      private void a(fnv.a $$0) {
         if (this.n == null) {
            this.n = Lists.newArrayList();
         }

         this.n.add($$0);
      }

      public b(final ghw $$0, final float $$1, final float $$2, final int $$3, final boolean $$4, final Matrix4f $$5, final fkk.a $$6, final int $$7) {
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
      public boolean accept(int $$0, ye $$1, int $$2) {
         fnr $$3 = fkk.this.a($$1.k());
         fbr $$4 = $$3.a($$2, fkk.this.g);
         fnv $$5 = $$1.f() && $$2 != 32 ? $$3.a($$4) : $$3.a($$2);
         boolean $$6 = $$1.b();
         float $$7 = this.h;
         yg $$8 = $$1.a();
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

         if (!($$5 instanceof fnw)) {
            float $$16 = $$6 ? $$4.a() : 0.0F;
            float $$17 = this.c ? $$4.b() : 0.0F;
            fdx $$18 = this.a.getBuffer($$5.a(this.j));
            fkk.this.a($$5, $$6, $$1.c(), $$16, this.l + $$17, this.m + $$17, this.i, $$18, $$10, $$11, $$12, $$7, this.k);
         }

         float $$19 = $$4.a($$6);
         float $$20 = this.c ? 1.0F : 0.0F;
         if ($$1.d()) {
            this.a(new fnv.a(this.l + $$20 - 1.0F, this.m + $$20 + 4.5F, this.l + $$20 + $$19, this.m + $$20 + 4.5F - 1.0F, 0.01F, $$10, $$11, $$12, $$7));
         }

         if ($$1.e()) {
            this.a(new fnv.a(this.l + $$20 - 1.0F, this.m + $$20 + 9.0F, this.l + $$20 + $$19, this.m + $$20 + 9.0F - 1.0F, 0.01F, $$10, $$11, $$12, $$7));
         }

         this.l += $$19;
         return true;
      }

      public float a(int $$0, float $$1) {
         if ($$0 != 0) {
            float $$2 = (float)($$0 >> 24 & 0xFF) / 255.0F;
            float $$3 = (float)($$0 >> 16 & 0xFF) / 255.0F;
            float $$4 = (float)($$0 >> 8 & 0xFF) / 255.0F;
            float $$5 = (float)($$0 & 0xFF) / 255.0F;
            this.a(new fnv.a($$1 - 1.0F, this.m + 9.0F, this.l, this.m - 1.0F, 0.01F, $$3, $$4, $$5, $$2));
         }

         if (this.n != null) {
            fnv $$6 = fkk.this.a(ye.b).b();
            fdx $$7 = this.a.getBuffer($$6.a(this.j));

            for (fnv.a $$8 : this.n) {
               $$6.a($$8, this.i, $$7, this.k);
            }
         }

         return this.l;
      }
   }
}
