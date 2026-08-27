import java.util.Iterator;
import java.util.List;

public class dpu extends dnd {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private dpy d = dcx.a.n();
   private ir e;
   private boolean f;
   private boolean g;
   private static final ThreadLocal<ir> h = ThreadLocal.withInitial(() -> null);
   private float i;
   private float j;
   private long k;
   private int l;

   public dpu(im $$0, dpy $$1) {
      super(dnf.k, $$0, $$1);
   }

   public dpu(im $$0, dpy $$1, dpy $$2, ir $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public ty a(ix.a $$0) {
      return this.d($$0);
   }

   public boolean b() {
      return this.f;
   }

   public ir c() {
      return this.e;
   }

   public boolean d() {
      return this.g;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return axw.i($$0, this.j, this.i);
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

   private dpy t() {
      return !this.b() && this.d() && this.d.b() instanceof dpr
         ? dcx.bz.n().a(dps.d, Boolean.valueOf(this.i > 0.25F)).a(dps.c, this.d.a(dcx.br) ? dra.b : dra.a).a(dps.a, this.d.c(dpr.a))
         : this.d;
   }

   private static void a(czu $$0, im $$1, float $$2, dpu $$3) {
      ir $$4 = $$3.f();
      double $$5 = (double)($$2 - $$3.i);
      ety $$6 = $$3.t().k($$0, $$1);
      if (!$$6.c()) {
         eta $$7 = a($$1, $$6.a(), $$3);
         List<bql> $$8 = $$0.a_(null, dpt.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<eta> $$9 = $$6.e();
            boolean $$10 = $$3.d.a(dcx.hV);
            Iterator var12 = $$8.iterator();

            while (true) {
               bql $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (bql)var12.next();
                  if ($$11.k_() != elw.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof aqf)) {
                        etf $$12 = $$11.dq();
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

                        $$11.o($$13, $$14, $$15);
                        break;
                     }
                  }
               }

               double $$16 = 0.0;

               for (eta $$17 : $$9) {
                  eta $$18 = dpt.a(a($$1, $$17, $$3), $$4, $$5);
                  eta $$19 = $$11.cI();
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

   private static void a(ir $$0, bql $$1, double $$2, ir $$3) {
      h.set($$0);
      $$1.a(brj.c, new etf($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      h.set(null);
   }

   private static void b(czu $$0, im $$1, float $$2, dpu $$3) {
      if ($$3.u()) {
         ir $$4 = $$3.f();
         if ($$4.o().d()) {
            double $$5 = $$3.d.k($$0, $$1).c(ir.a.b);
            eta $$6 = a($$1, new eta(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.i);

            for (bql $$9 : $$0.a((bql)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(eta $$0, bql $$1, im $$2) {
      return $$1.k_() == elw.a && $$1.aC() && ($$1.d($$2) || $$1.ds() >= $$0.a && $$1.ds() <= $$0.d && $$1.dy() >= $$0.c && $$1.dy() <= $$0.f);
   }

   private boolean u() {
      return this.d.a(dcx.pg);
   }

   public ir f() {
      return this.f ? this.e : this.e.g();
   }

   private static double a(eta $$0, ir $$1, eta $$2) {
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

   private static eta a(im $$0, eta $$1, dpu $$2) {
      double $$3 = (double)$$2.e($$2.i);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.e.j(), (double)$$0.v() + $$3 * (double)$$2.e.k(), (double)$$0.w() + $$3 * (double)$$2.e.l());
   }

   private static void a(im $$0, bql $$1, ir $$2, double $$3) {
      eta $$4 = $$1.cI();
      eta $$5 = etv.b().a().a($$0);
      if ($$4.c($$5)) {
         ir $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }
   }

   public dpy j() {
      return this.d;
   }

   public void k() {
      if (this.o != null && (this.j < 1.0F || this.o.B)) {
         this.i = 1.0F;
         this.j = this.i;
         this.o.o(this.p);
         this.aw_();
         if (this.o.a_(this.p).a(dcx.bQ)) {
            dpy $$0;
            if (this.g) {
               $$0 = dcx.a.n();
            } else {
               $$0 = dcv.b(this.d, this.o, this.p);
            }

            this.o.a(this.p, $$0, 3);
            this.o.a(this.p, $$0.b(), this.p);
         }
      }
   }

   public static void a(czu $$0, im $$1, dpy $$2, dpu $$3) {
      $$3.k = $$0.Y();
      $$3.j = $$3.i;
      if ($$3.j >= 1.0F) {
         if ($$0.B && $$3.l < 5) {
            $$3.l++;
         } else {
            $$0.o($$1);
            $$3.aw_();
            if ($$0.a_($$1).a(dcx.bQ)) {
               dpy $$4 = dcv.b($$3.d, $$0, $$1);
               if ($$4.i()) {
                  $$0.a($$1, $$3.d, 84);
                  dcv.a($$3.d, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(dqo.C) && $$4.c(dqo.C)) {
                     $$4 = $$4.a(dqo.C, Boolean.valueOf(false));
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
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      iw<dcv> $$2 = (iw<dcv>)(this.o != null ? this.o.a(ld.f) : lc.e.p());
      this.d = un.a($$2, $$0.p("blockState"));
      this.e = ir.a($$0.h("facing"));
      this.i = $$0.j("progress");
      this.j = this.i;
      this.f = $$0.q("extending");
      this.g = $$0.q("source");
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      $$0.a("blockState", un.a(this.d));
      $$0.a("facing", this.e.d());
      $$0.a("progress", this.j);
      $$0.a("extending", this.f);
      $$0.a("source", this.g);
   }

   public ety a(cza $$0, im $$1) {
      ety $$2;
      if (!this.f && this.g && this.d.b() instanceof dpr) {
         $$2 = this.d.a(dpr.c, Boolean.valueOf(true)).k($$0, $$1);
      } else {
         $$2 = etv.a();
      }

      ir $$4 = h.get();
      if ((double)this.i < 1.0 && $$4 == this.f()) {
         return $$2;
      } else {
         dpy $$5;
         if (this.d()) {
            $$5 = dcx.bz.n().a(dps.a, this.e).a(dps.d, Boolean.valueOf(this.f != 1.0F - this.i < 0.25F));
         } else {
            $$5 = this.d;
         }

         float $$7 = this.e(this.i);
         double $$8 = (double)((float)this.e.j() * $$7);
         double $$9 = (double)((float)this.e.k() * $$7);
         double $$10 = (double)((float)this.e.l() * $$7);
         return etv.a($$2, $$5.k($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long l() {
      return this.k;
   }

   @Override
   public void a(czu $$0) {
      super.a($$0);
      if ($$0.a(ld.f).a(this.d.b().r().h()).isEmpty()) {
         this.d = dcx.a.n();
      }
   }
}
