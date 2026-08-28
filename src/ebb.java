import java.util.Iterator;
import java.util.List;

public class ebb extends dye {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private static final ebg d = dng.a.m();
   private static final float e = 0.0F;
   private static final boolean f = false;
   private static final boolean g = false;
   private ebg h = d;
   private jc i;
   private boolean j = false;
   private boolean k = false;
   private static final ThreadLocal<jc> l = ThreadLocal.withInitial(() -> null);
   private float m = 0.0F;
   private float q = 0.0F;
   private long r;
   private int s;

   public ebb(iw $$0, ebg $$1) {
      super(dyg.l, $$0, $$1);
   }

   public ebb(iw $$0, ebg $$1, ebg $$2, jc $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.h = $$2;
      this.i = $$3;
      this.j = $$4;
      this.k = $$5;
   }

   @Override
   public ua a(ji.a $$0) {
      return this.e($$0);
   }

   public boolean a() {
      return this.j;
   }

   public jc c() {
      return this.i;
   }

   public boolean d() {
      return this.k;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return azq.h($$0, this.q, this.m);
   }

   public float b(float $$0) {
      return (float)this.i.j() * this.e(this.a($$0));
   }

   public float c(float $$0) {
      return (float)this.i.k() * this.e(this.a($$0));
   }

   public float d(float $$0) {
      return (float)this.i.l() * this.e(this.a($$0));
   }

   private float e(float $$0) {
      return this.j ? $$0 - 1.0F : 1.0F - $$0;
   }

   private ebg u() {
      return !this.a() && this.d() && this.h.b() instanceof eay
         ? dng.bJ.m().b(eaz.d, Boolean.valueOf(this.m > 0.25F)).b(eaz.c, this.h.a(dng.by) ? eci.b : eci.a).b(eaz.a, this.h.c(eay.a))
         : this.h;
   }

   private static void a(djz $$0, iw $$1, float $$2, ebb $$3) {
      jc $$4 = $$3.f();
      double $$5 = (double)($$2 - $$3.m);
      fgm $$6 = $$3.u().g($$0, $$1);
      if (!$$6.c()) {
         ffn $$7 = a($$1, $$6.a(), $$3);
         List<bwv> $$8 = $$0.a_(null, eba.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<ffn> $$9 = $$6.e();
            boolean $$10 = $$3.h.a(dng.ix);
            Iterator var12 = $$8.iterator();

            while (true) {
               bwv $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (bwv)var12.next();
                  if ($$11.j_() != exv.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof arv)) {
                        ffs $$12 = $$11.dy();
                        double $$13 = $$12.d;
                        double $$14 = $$12.e;
                        double $$15 = $$12.f;
                        switch ($$4.o()) {
                           case a:
                              $$13 = (double)$$4.j();
                              break;
                           case b:
                              $$14 = (double)$$4.k();
                              break;
                           case c:
                              $$15 = (double)$$4.l();
                        }

                        $$11.n($$13, $$14, $$15);
                        break;
                     }
                  }
               }

               double $$16 = 0.0;

               for (ffn $$17 : $$9) {
                  ffn $$18 = eba.a(a($$1, $$17, $$3), $$4, $$5);
                  ffn $$19 = $$11.cR();
                  if ($$18.c($$19)) {
                     $$16 = Math.max($$16, a($$18, $$4, $$19));
                     if ($$16 >= $$5) {
                        break;
                     }
                  }
               }

               if (!($$16 <= 0.0)) {
                  $$16 = Math.min($$16, $$5) + 0.01;
                  a($$4, $$11, $$16, $$4);
                  if (!$$3.j && $$3.k) {
                     a($$1, $$11, $$4, $$5);
                  }
               }
            }
         }
      }
   }

   private static void a(jc $$0, bwv $$1, double $$2, jc $$3) {
      l.set($$0);
      $$1.a(bya.c, new ffs($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      l.set(null);
   }

   private static void b(djz $$0, iw $$1, float $$2, ebb $$3) {
      if ($$3.v()) {
         jc $$4 = $$3.f();
         if ($$4.o().d()) {
            double $$5 = $$3.h.g($$0, $$1).c(jc.a.b);
            ffn $$6 = a($$1, new ffn(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.m);

            for (bwv $$9 : $$0.a((bwv)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(ffn $$0, bwv $$1, iw $$2) {
      return $$1.j_() == exv.a && $$1.aH() && ($$1.d($$2) || $$1.dA() >= $$0.a && $$1.dA() <= $$0.d && $$1.dG() >= $$0.c && $$1.dG() <= $$0.f);
   }

   private boolean v() {
      return this.h.a(dng.pO);
   }

   public jc f() {
      return this.j ? this.i : this.i.g();
   }

   private static double a(ffn $$0, jc $$1, ffn $$2) {
      switch ($$1) {
         case f:
            return $$0.d - $$2.a;
         case e:
            return $$2.d - $$0.a;
         case b:
         default:
            return $$0.e - $$2.b;
         case a:
            return $$2.e - $$0.b;
         case d:
            return $$0.f - $$2.c;
         case c:
            return $$2.f - $$0.c;
      }
   }

   private static ffn a(iw $$0, ffn $$1, ebb $$2) {
      double $$3 = (double)$$2.e($$2.m);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.i.j(), (double)$$0.v() + $$3 * (double)$$2.i.k(), (double)$$0.w() + $$3 * (double)$$2.i.l());
   }

   private static void a(iw $$0, bwv $$1, jc $$2, double $$3) {
      ffn $$4 = $$1.cR();
      ffn $$5 = fgj.b().a().a($$0);
      if ($$4.c($$5)) {
         jc $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }
   }

   public ebg j() {
      return this.h;
   }

   public void k() {
      if (this.n != null && (this.q < 1.0F || this.n.C)) {
         this.m = 1.0F;
         this.q = this.m;
         this.n.o(this.o);
         this.aw_();
         if (this.n.a_(this.o).a(dng.ca)) {
            ebg $$0;
            if (this.k) {
               $$0 = dng.a.m();
            } else {
               $$0 = dne.b(this.h, this.n, this.o);
            }

            this.n.a(this.o, $$0, 3);
            this.n.b(this.o, $$0.b(), eyu.a(this.n, this.s(), null));
         }
      }
   }

   @Override
   public void a(iw $$0, ebg $$1) {
      this.k();
   }

   public jc s() {
      return this.j ? this.i : this.i.g();
   }

   public static void a(djz $$0, iw $$1, ebg $$2, ebb $$3) {
      $$3.r = $$0.ae();
      $$3.q = $$3.m;
      if ($$3.q >= 1.0F) {
         if ($$0.C && $$3.s < 5) {
            $$3.s++;
         } else {
            $$0.o($$1);
            $$3.aw_();
            if ($$0.a_($$1).a(dng.ca)) {
               ebg $$4 = dne.b($$3.h, $$0, $$1);
               if ($$4.l()) {
                  $$0.a($$1, $$3.h, 340);
                  dne.a($$3.h, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(ebw.I) && $$4.c(ebw.I)) {
                     $$4 = $$4.b(ebw.I, Boolean.valueOf(false));
                  }

                  $$0.a($$1, $$4, 67);
                  $$0.b($$1, $$4.b(), eyu.a($$0, $$3.s(), null));
               }
            }
         }
      } else {
         float $$5 = $$3.m + 0.5F;
         a($$0, $$1, $$5, $$3);
         b($$0, $$1, $$5, $$3);
         $$3.m = $$5;
         if ($$3.m >= 1.0F) {
            $$3.m = 1.0F;
         }
      }
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      ali<va> $$2 = $$1.a(uo.a);
      this.h = $$0.<ebg>a("blockState", ebg.a, $$2).orElse(d);
      this.i = $$0.<jc>a("facing", jc.k).orElse(jc.a);
      this.m = $$0.b("progress", 0.0F);
      this.q = this.m;
      this.j = $$0.b("extending", false);
      this.k = $$0.b("source", false);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      ali<va> $$2 = $$1.a(uo.a);
      $$0.a("blockState", ebg.a, $$2, this.h);
      $$0.a("facing", jc.k, this.i);
      $$0.a("progress", this.q);
      $$0.a("extending", this.j);
      $$0.a("source", this.k);
   }

   public fgm a(djd $$0, iw $$1) {
      fgm $$2;
      if (!this.j && this.k && this.h.b() instanceof eay) {
         $$2 = this.h.b(eay.c, Boolean.valueOf(true)).g($$0, $$1);
      } else {
         $$2 = fgj.a();
      }

      jc $$4 = l.get();
      if ((double)this.m < 1.0 && $$4 == this.f()) {
         return $$2;
      } else {
         ebg $$5;
         if (this.d()) {
            $$5 = dng.bJ.m().b(eaz.a, this.i).b(eaz.d, Boolean.valueOf(this.j != 1.0F - this.m < 0.25F));
         } else {
            $$5 = this.h;
         }

         float $$7 = this.e(this.m);
         double $$8 = (double)((float)this.i.j() * $$7);
         double $$9 = (double)((float)this.i.k() * $$7);
         double $$10 = (double)((float)this.i.l() * $$7);
         return fgj.a($$2, $$5.g($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long t() {
      return this.r;
   }

   @Override
   public void a(djz $$0) {
      super.a($$0);
      if ($$0.a(mi.i).a(this.h.b().p().h()).isEmpty()) {
         this.h = dng.a.m();
      }
   }
}
