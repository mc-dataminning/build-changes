import java.util.Iterator;
import java.util.List;

public class dsw extends dqf {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private dta d = dfy.a.o();
   private ji e;
   private boolean f;
   private boolean g;
   private static final ThreadLocal<ji> h = ThreadLocal.withInitial(() -> null);
   private float i;
   private float j;
   private long k;
   private int l;

   public dsw(jd $$0, dta $$1) {
      super(dqh.k, $$0, $$1);
   }

   public dsw(jd $$0, dta $$1, dta $$2, ji $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public ua a(jo.a $$0) {
      return this.e($$0);
   }

   public boolean b() {
      return this.f;
   }

   public ji c() {
      return this.e;
   }

   public boolean d() {
      return this.g;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return ayn.i($$0, this.j, this.i);
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

   private dta u() {
      return !this.b() && this.d() && this.d.b() instanceof dst
         ? dfy.bz.o().a(dsu.d, Boolean.valueOf(this.i > 0.25F)).a(dsu.c, this.d.a(dfy.br) ? duc.b : duc.a).a(dsu.a, this.d.c(dst.a))
         : this.d;
   }

   private static void a(dcu $$0, jd $$1, float $$2, dsw $$3) {
      ji $$4 = $$3.f();
      double $$5 = (double)($$2 - $$3.i);
      exp $$6 = $$3.u().k($$0, $$1);
      if (!$$6.c()) {
         ewr $$7 = a($$1, $$6.a(), $$3);
         List<bsq> $$8 = $$0.a_(null, dsv.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<ewr> $$9 = $$6.e();
            boolean $$10 = $$3.d.a(dfy.hV);
            Iterator var12 = $$8.iterator();

            while (true) {
               bsq $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (bsq)var12.next();
                  if ($$11.j_() != epd.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof aqu)) {
                        eww $$12 = $$11.dt();
                        double $$13 = $$12.c;
                        double $$14 = $$12.d;
                        double $$15 = $$12.e;
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

               for (ewr $$17 : $$9) {
                  ewr $$18 = dsv.a(a($$1, $$17, $$3), $$4, $$5);
                  ewr $$19 = $$11.cL();
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

   private static void a(ji $$0, bsq $$1, double $$2, ji $$3) {
      h.set($$0);
      $$1.a(btq.c, new eww($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      h.set(null);
   }

   private static void b(dcu $$0, jd $$1, float $$2, dsw $$3) {
      if ($$3.v()) {
         ji $$4 = $$3.f();
         if ($$4.o().d()) {
            double $$5 = $$3.d.k($$0, $$1).c(ji.a.b);
            ewr $$6 = a($$1, new ewr(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.i);

            for (bsq $$9 : $$0.a((bsq)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(ewr $$0, bsq $$1, jd $$2) {
      return $$1.j_() == epd.a && $$1.aF() && ($$1.d($$2) || $$1.dv() >= $$0.a && $$1.dv() <= $$0.d && $$1.dB() >= $$0.c && $$1.dB() <= $$0.f);
   }

   private boolean v() {
      return this.d.a(dfy.pg);
   }

   public ji f() {
      return this.f ? this.e : this.e.g();
   }

   private static double a(ewr $$0, ji $$1, ewr $$2) {
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

   private static ewr a(jd $$0, ewr $$1, dsw $$2) {
      double $$3 = (double)$$2.e($$2.i);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.e.j(), (double)$$0.v() + $$3 * (double)$$2.e.k(), (double)$$0.w() + $$3 * (double)$$2.e.l());
   }

   private static void a(jd $$0, bsq $$1, ji $$2, double $$3) {
      ewr $$4 = $$1.cL();
      ewr $$5 = exm.b().a().a($$0);
      if ($$4.c($$5)) {
         ji $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }
   }

   public dta j() {
      return this.d;
   }

   public void k() {
      if (this.n != null && (this.j < 1.0F || this.n.B)) {
         this.i = 1.0F;
         this.j = this.i;
         this.n.o(this.o);
         this.aw_();
         if (this.n.a_(this.o).a(dfy.bQ)) {
            dta $$0;
            if (this.g) {
               $$0 = dfy.a.o();
            } else {
               $$0 = dfw.b(this.d, this.n, this.o);
            }

            this.n.a(this.o, $$0, 3);
            this.n.a(this.o, $$0.b(), this.o);
         }
      }
   }

   public static void a(dcu $$0, jd $$1, dta $$2, dsw $$3) {
      $$3.k = $$0.Z();
      $$3.j = $$3.i;
      if ($$3.j >= 1.0F) {
         if ($$0.B && $$3.l < 5) {
            $$3.l++;
         } else {
            $$0.o($$1);
            $$3.aw_();
            if ($$0.a_($$1).a(dfy.bQ)) {
               dta $$4 = dfw.b($$3.d, $$0, $$1);
               if ($$4.i()) {
                  $$0.a($$1, $$3.d, 84);
                  dfw.a($$3.d, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(dtq.C) && $$4.c(dtq.C)) {
                     $$4 = $$4.a(dtq.C, Boolean.valueOf(false));
                  }

                  $$0.a($$1, $$4, 67);
                  $$0.a($$1, $$4.b(), $$1);
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
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      jn<dfw> $$2 = (jn<dfw>)(this.n != null ? this.n.a(lu.f) : lt.e.q());
      this.d = up.a($$2, $$0.p("blockState"));
      this.e = ji.a($$0.h("facing"));
      this.i = $$0.j("progress");
      this.j = this.i;
      this.f = $$0.q("extending");
      this.g = $$0.q("source");
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
      super.b($$0, $$1);
      $$0.a("blockState", up.a(this.d));
      $$0.a("facing", this.e.d());
      $$0.a("progress", this.j);
      $$0.a("extending", this.f);
      $$0.a("source", this.g);
   }

   public exp a(dca $$0, jd $$1) {
      exp $$2;
      if (!this.f && this.g && this.d.b() instanceof dst) {
         $$2 = this.d.a(dst.c, Boolean.valueOf(true)).k($$0, $$1);
      } else {
         $$2 = exm.a();
      }

      ji $$4 = h.get();
      if ((double)this.i < 1.0 && $$4 == this.f()) {
         return $$2;
      } else {
         dta $$5;
         if (this.d()) {
            $$5 = dfy.bz.o().a(dsu.a, this.e).a(dsu.d, Boolean.valueOf(this.f != 1.0F - this.i < 0.25F));
         } else {
            $$5 = this.d;
         }

         float $$7 = this.e(this.i);
         double $$8 = (double)((float)this.e.j() * $$7);
         double $$9 = (double)((float)this.e.k() * $$7);
         double $$10 = (double)((float)this.e.l() * $$7);
         return exm.a($$2, $$5.k($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long l() {
      return this.k;
   }

   @Override
   public void a(dcu $$0) {
      super.a($$0);
      if ($$0.a(lu.f).a(this.d.b().s().h()).isEmpty()) {
         this.d = dfy.a.o();
      }
   }
}
