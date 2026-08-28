import java.util.Iterator;
import java.util.List;

public class dvk extends dsr {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private dvo d = dil.a.m();
   private jm e;
   private boolean f;
   private boolean g;
   private static final ThreadLocal<jm> h = ThreadLocal.withInitial(() -> null);
   private float i;
   private float j;
   private long k;
   private int l;

   public dvk(jh $$0, dvo $$1) {
      super(dst.k, $$0, $$1);
   }

   public dvk(jh $$0, dvo $$1, dvo $$2, jm $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public un a(js.a $$0) {
      return this.e($$0);
   }

   public boolean b() {
      return this.f;
   }

   public jm c() {
      return this.e;
   }

   public boolean d() {
      return this.g;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return azn.h($$0, this.j, this.i);
   }

   public float b(float $$0) {
      return (float)this.e.j() * this.e(this.a($$0));
   }

   public float c(float $$0) {
      return (float)this.e.k() * this.e(this.a($$0));
   }

   public float d(float $$0) {
      return (float)this.e.l() * this.e(this.a($$0));
   }

   private float e(float $$0) {
      return this.f ? $$0 - 1.0F : 1.0F - $$0;
   }

   private dvo v() {
      return !this.b() && this.d() && this.d.b() instanceof dvh
         ? dil.bz.m().b(dvi.d, Boolean.valueOf(this.i > 0.25F)).b(dvi.c, this.d.a(dil.br) ? dwp.b : dwp.a).b(dvi.a, this.d.c(dvh.a))
         : this.d;
   }

   private static void a(dff $$0, jh $$1, float $$2, dvk $$3) {
      jm $$4 = $$3.f();
      double $$5 = (double)($$2 - $$3.i);
      fal $$6 = $$3.v().g($$0, $$1);
      if (!$$6.c()) {
         ezm $$7 = a($$1, $$6.a(), $$3);
         List<bui> $$8 = $$0.a_(null, dvj.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<ezm> $$9 = $$6.e();
            boolean $$10 = $$3.d.a(dil.hV);
            Iterator var12 = $$8.iterator();

            while (true) {
               bui $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (bui)var12.next();
                  if ($$11.k_() != ert.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof arr)) {
                        ezr $$12 = $$11.dB();
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

               for (ezm $$17 : $$9) {
                  ezm $$18 = dvj.a(a($$1, $$17, $$3), $$4, $$5);
                  ezm $$19 = $$11.cT();
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
                  if (!$$3.f && $$3.g) {
                     a($$1, $$11, $$4, $$5);
                  }
               }
            }
         }
      }
   }

   private static void a(jm $$0, bui $$1, double $$2, jm $$3) {
      h.set($$0);
      $$1.a(bvi.c, new ezr($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      $$1.aM();
      h.set(null);
   }

   private static void b(dff $$0, jh $$1, float $$2, dvk $$3) {
      if ($$3.w()) {
         jm $$4 = $$3.f();
         if ($$4.o().d()) {
            double $$5 = $$3.d.g($$0, $$1).c(jm.a.b);
            ezm $$6 = a($$1, new ezm(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.i);

            for (bui $$9 : $$0.a((bui)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(ezm $$0, bui $$1, jh $$2) {
      return $$1.k_() == ert.a && $$1.aL() && ($$1.d($$2) || $$1.dD() >= $$0.a && $$1.dD() <= $$0.d && $$1.dJ() >= $$0.c && $$1.dJ() <= $$0.f);
   }

   private boolean w() {
      return this.d.a(dil.pg);
   }

   public jm f() {
      return this.f ? this.e : this.e.g();
   }

   private static double a(ezm $$0, jm $$1, ezm $$2) {
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

   private static ezm a(jh $$0, ezm $$1, dvk $$2) {
      double $$3 = (double)$$2.e($$2.i);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.e.j(), (double)$$0.v() + $$3 * (double)$$2.e.k(), (double)$$0.w() + $$3 * (double)$$2.e.l());
   }

   private static void a(jh $$0, bui $$1, jm $$2, double $$3) {
      ezm $$4 = $$1.cT();
      ezm $$5 = fai.b().a().a($$0);
      if ($$4.c($$5)) {
         jm $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }
   }

   public dvo j() {
      return this.d;
   }

   public void k() {
      if (this.o != null && (this.j < 1.0F || this.o.C)) {
         this.i = 1.0F;
         this.j = this.i;
         this.o.o(this.p);
         this.aw_();
         if (this.o.a_(this.p).a(dil.bQ)) {
            dvo $$0;
            if (this.g) {
               $$0 = dil.a.m();
            } else {
               $$0 = dij.b(this.d, this.o, this.p);
            }

            this.o.a(this.p, $$0, 3);
            this.o.b(this.p, $$0.b(), ess.a(this.o, this.t(), null));
         }
      }
   }

   public jm t() {
      return this.f ? this.e : this.e.g();
   }

   public static void a(dff $$0, jh $$1, dvo $$2, dvk $$3) {
      $$3.k = $$0.aa();
      $$3.j = $$3.i;
      if ($$3.j >= 1.0F) {
         if ($$0.C && $$3.l < 5) {
            $$3.l++;
         } else {
            $$0.o($$1);
            $$3.aw_();
            if ($$0.a_($$1).a(dil.bQ)) {
               dvo $$4 = dij.b($$3.d, $$0, $$1);
               if ($$4.l()) {
                  $$0.a($$1, $$3.d, 84);
                  dij.a($$3.d, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(dwe.C) && $$4.c(dwe.C)) {
                     $$4 = $$4.b(dwe.C, Boolean.valueOf(false));
                  }

                  $$0.a($$1, $$4, 67);
                  $$0.b($$1, $$4.b(), ess.a($$0, $$3.t(), null));
               }
            }
         }
      } else {
         float $$5 = $$3.i + 0.5F;
         a($$0, $$1, $$5, $$3);
         b($$0, $$1, $$5, $$3);
         $$3.i = $$5;
         if ($$3.i >= 1.0F) {
            $$3.i = 1.0F;
         }
      }
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      jr<dij> $$2 = (jr<dij>)(this.o != null ? this.o.a(ma.f) : lz.e);
      this.d = vc.a($$2, $$0.p("blockState"));
      this.e = jm.a($$0.h("facing"));
      this.i = $$0.j("progress");
      this.j = this.i;
      this.f = $$0.q("extending");
      this.g = $$0.q("source");
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("blockState", vc.a(this.d));
      $$0.a("facing", this.e.d());
      $$0.a("progress", this.j);
      $$0.a("extending", this.f);
      $$0.a("source", this.g);
   }

   public fal a(dek $$0, jh $$1) {
      fal $$2;
      if (!this.f && this.g && this.d.b() instanceof dvh) {
         $$2 = this.d.b(dvh.c, Boolean.valueOf(true)).g($$0, $$1);
      } else {
         $$2 = fai.a();
      }

      jm $$4 = h.get();
      if ((double)this.i < 1.0 && $$4 == this.f()) {
         return $$2;
      } else {
         dvo $$5;
         if (this.d()) {
            $$5 = dil.bz.m().b(dvi.a, this.e).b(dvi.d, Boolean.valueOf(this.f != 1.0F - this.i < 0.25F));
         } else {
            $$5 = this.d;
         }

         float $$7 = this.e(this.i);
         double $$8 = (double)((float)this.e.j() * $$7);
         double $$9 = (double)((float)this.e.k() * $$7);
         double $$10 = (double)((float)this.e.l() * $$7);
         return fai.a($$2, $$5.g($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long u() {
      return this.k;
   }

   @Override
   public void a(dff $$0) {
      super.a($$0);
      if ($$0.a(ma.f).a(this.d.b().p().h()).isEmpty()) {
         this.d = dil.a.m();
      }
   }
}
