import java.util.Iterator;
import java.util.List;

public class dff extends dcv {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private dfj d = csw.a.n();
   private hc e;
   private boolean f;
   private boolean g;
   private static final ThreadLocal<hc> h = ThreadLocal.withInitial(() -> null);
   private float i;
   private float j;
   private long k;
   private int l;

   public dff(gw $$0, dfj $$1) {
      super(dcx.k, $$0, $$1);
   }

   public dff(gw $$0, dfj $$1, dfj $$2, hc $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public qy as_() {
      return this.o();
   }

   public boolean c() {
      return this.f;
   }

   public hc d() {
      return this.e;
   }

   public boolean f() {
      return this.g;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return arx.i($$0, this.j, this.i);
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

   private dfj w() {
      return !this.c() && this.f() && this.d.b() instanceof dfc
         ? csw.bz.n().a(dfd.c, Boolean.valueOf(this.i > 0.25F)).a(dfd.b, this.d.a(csw.br) ? dgl.b : dgl.a).a(dfd.a, this.d.c(dfc.a))
         : this.d;
   }

   private static void a(cpv $$0, gw $$1, float $$2, dff $$3) {
      hc $$4 = $$3.g();
      double $$5 = (double)($$2 - $$3.i);
      eig $$6 = $$3.w().k($$0, $$1);
      if (!$$6.c()) {
         ehi $$7 = a($$1, $$6.a(), $$3);
         List<biq> $$8 = $$0.a_(null, dfe.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<ehi> $$9 = $$6.e();
            boolean $$10 = $$3.d.a(csw.hV);
            Iterator var12 = $$8.iterator();

            while (true) {
               biq $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (biq)var12.next();
                  if ($$11.q_() != ear.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof aks)) {
                        ehn $$12 = $$11.do();
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

               for (ehi $$17 : $$9) {
                  ehi $$18 = dfe.a(a($$1, $$17, $$3), $$4, $$5);
                  ehi $$19 = $$11.cG();
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

   private static void a(hc $$0, biq $$1, double $$2, hc $$3) {
      h.set($$0);
      $$1.a(bjm.c, new ehn($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      h.set(null);
   }

   private static void b(cpv $$0, gw $$1, float $$2, dff $$3) {
      if ($$3.x()) {
         hc $$4 = $$3.g();
         if ($$4.o().d()) {
            double $$5 = $$3.d.k($$0, $$1).c(hc.a.b);
            ehi $$6 = a($$1, new ehi(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.i);

            for (biq $$9 : $$0.a((biq)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(ehi $$0, biq $$1, gw $$2) {
      return $$1.q_() == ear.a && $$1.aA() && ($$1.d($$2) || $$1.dq() >= $$0.a && $$1.dq() <= $$0.d && $$1.dw() >= $$0.c && $$1.dw() <= $$0.f);
   }

   private boolean x() {
      return this.d.a(csw.pg);
   }

   public hc g() {
      return this.f ? this.e : this.e.g();
   }

   private static double a(ehi $$0, hc $$1, ehi $$2) {
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

   private static ehi a(gw $$0, ehi $$1, dff $$2) {
      double $$3 = (double)$$2.e($$2.i);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.e.j(), (double)$$0.v() + $$3 * (double)$$2.e.k(), (double)$$0.w() + $$3 * (double)$$2.e.l());
   }

   private static void a(gw $$0, biq $$1, hc $$2, double $$3) {
      ehi $$4 = $$1.cG();
      ehi $$5 = eid.b().a().a($$0);
      if ($$4.c($$5)) {
         hc $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }
   }

   public dfj i() {
      return this.d;
   }

   public void j() {
      if (this.o != null && (this.j < 1.0F || this.o.B)) {
         this.i = 1.0F;
         this.j = this.i;
         this.o.n(this.p);
         this.at_();
         if (this.o.a_(this.p).a(csw.bQ)) {
            dfj $$0;
            if (this.g) {
               $$0 = csw.a.n();
            } else {
               $$0 = csv.b(this.d, this.o, this.p);
            }

            this.o.a(this.p, $$0, 3);
            this.o.a(this.p, $$0.b(), this.p);
         }
      }
   }

   public static void a(cpv $$0, gw $$1, dfj $$2, dff $$3) {
      $$3.k = $$0.V();
      $$3.j = $$3.i;
      if ($$3.j >= 1.0F) {
         if ($$0.B && $$3.l < 5) {
            $$3.l++;
         } else {
            $$0.n($$1);
            $$3.at_();
            if ($$0.a_($$1).a(csw.bQ)) {
               dfj $$4 = csv.b($$3.d, $$0, $$1);
               if ($$4.i()) {
                  $$0.a($$1, $$3.d, 84);
                  csv.a($$3.d, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(dfz.C) && $$4.c(dfz.C)) {
                     $$4 = $$4.a(dfz.C, Boolean.valueOf(false));
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
   public void a(qy $$0) {
      super.a($$0);
      hh<csv> $$1 = (hh<csv>)(this.o != null ? this.o.a(je.e) : jd.f.p());
      this.d = rk.a($$1, $$0.p("blockState"));
      this.e = hc.a($$0.h("facing"));
      this.i = $$0.j("progress");
      this.j = this.i;
      this.f = $$0.q("extending");
      this.g = $$0.q("source");
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      $$0.a("blockState", rk.a(this.d));
      $$0.a("facing", this.e.d());
      $$0.a("progress", this.j);
      $$0.a("extending", this.f);
      $$0.a("source", this.g);
   }

   public eig a(cpb $$0, gw $$1) {
      eig $$2;
      if (!this.f && this.g && this.d.b() instanceof dfc) {
         $$2 = this.d.a(dfc.b, Boolean.valueOf(true)).k($$0, $$1);
      } else {
         $$2 = eid.a();
      }

      hc $$4 = h.get();
      if ((double)this.i < 1.0 && $$4 == this.g()) {
         return $$2;
      } else {
         dfj $$5;
         if (this.f()) {
            $$5 = csw.bz.n().a(dfd.a, this.e).a(dfd.c, Boolean.valueOf(this.f != 1.0F - this.i < 0.25F));
         } else {
            $$5 = this.d;
         }

         float $$7 = this.e(this.i);
         double $$8 = (double)((float)this.e.j() * $$7);
         double $$9 = (double)((float)this.e.k() * $$7);
         double $$10 = (double)((float)this.e.l() * $$7);
         return eid.a($$2, $$5.k($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long v() {
      return this.k;
   }

   @Override
   public void a(cpv $$0) {
      super.a($$0);
      if ($$0.a(je.e).a(this.d.b().q().g()).isEmpty()) {
         this.d = csw.a.n();
      }
   }
}
