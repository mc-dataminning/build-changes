import java.util.Iterator;
import java.util.List;

public class dov extends dmf {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private doz d = dca.a.n();
   private ih e;
   private boolean f;
   private boolean g;
   private static final ThreadLocal<ih> h = ThreadLocal.withInitial(() -> null);
   private float i;
   private float j;
   private long k;
   private int l;

   public dov(ib $$0, doz $$1) {
      super(dmh.k, $$0, $$1);
   }

   public dov(ib $$0, doz $$1, doz $$2, ih $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public tm a(in.a $$0) {
      return this.d($$0);
   }

   public boolean b() {
      return this.f;
   }

   public ih c() {
      return this.e;
   }

   public boolean d() {
      return this.g;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return axk.i($$0, this.j, this.i);
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

   private doz t() {
      return !this.b() && this.d() && this.d.b() instanceof dos
         ? dca.bz.n().a(dot.d, Boolean.valueOf(this.i > 0.25F)).a(dot.c, this.d.a(dca.br) ? dqb.b : dqb.a).a(dot.a, this.d.c(dos.a))
         : this.d;
   }

   private static void a(cyx $$0, ib $$1, float $$2, dov $$3) {
      ih $$4 = $$3.f();
      double $$5 = (double)($$2 - $$3.i);
      est $$6 = $$3.t().k($$0, $$1);
      if (!$$6.c()) {
         erv $$7 = a($$1, $$6.a(), $$3);
         List<bpv> $$8 = $$0.a_(null, dou.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<erv> $$9 = $$6.e();
            boolean $$10 = $$3.d.a(dca.hV);
            Iterator var12 = $$8.iterator();

            while (true) {
               bpv $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (bpv)var12.next();
                  if ($$11.k_() != ekx.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof apt)) {
                        esa $$12 = $$11.dp();
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

               for (erv $$17 : $$9) {
                  erv $$18 = dou.a(a($$1, $$17, $$3), $$4, $$5);
                  erv $$19 = $$11.cH();
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

   private static void a(ih $$0, bpv $$1, double $$2, ih $$3) {
      h.set($$0);
      $$1.a(bqt.c, new esa($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      h.set(null);
   }

   private static void b(cyx $$0, ib $$1, float $$2, dov $$3) {
      if ($$3.u()) {
         ih $$4 = $$3.f();
         if ($$4.o().d()) {
            double $$5 = $$3.d.k($$0, $$1).c(ih.a.b);
            erv $$6 = a($$1, new erv(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.i);

            for (bpv $$9 : $$0.a((bpv)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(erv $$0, bpv $$1, ib $$2) {
      return $$1.k_() == ekx.a && $$1.aC() && ($$1.d($$2) || $$1.dr() >= $$0.a && $$1.dr() <= $$0.d && $$1.dx() >= $$0.c && $$1.dx() <= $$0.f);
   }

   private boolean u() {
      return this.d.a(dca.pg);
   }

   public ih f() {
      return this.f ? this.e : this.e.g();
   }

   private static double a(erv $$0, ih $$1, erv $$2) {
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

   private static erv a(ib $$0, erv $$1, dov $$2) {
      double $$3 = (double)$$2.e($$2.i);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.e.j(), (double)$$0.v() + $$3 * (double)$$2.e.k(), (double)$$0.w() + $$3 * (double)$$2.e.l());
   }

   private static void a(ib $$0, bpv $$1, ih $$2, double $$3) {
      erv $$4 = $$1.cH();
      erv $$5 = esq.b().a().a($$0);
      if ($$4.c($$5)) {
         ih $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }
   }

   public doz j() {
      return this.d;
   }

   public void k() {
      if (this.o != null && (this.j < 1.0F || this.o.B)) {
         this.i = 1.0F;
         this.j = this.i;
         this.o.o(this.p);
         this.ax_();
         if (this.o.a_(this.p).a(dca.bQ)) {
            doz $$0;
            if (this.g) {
               $$0 = dca.a.n();
            } else {
               $$0 = dby.b(this.d, this.o, this.p);
            }

            this.o.a(this.p, $$0, 3);
            this.o.a(this.p, $$0.b(), this.p);
         }
      }
   }

   public static void a(cyx $$0, ib $$1, doz $$2, dov $$3) {
      $$3.k = $$0.Y();
      $$3.j = $$3.i;
      if ($$3.j >= 1.0F) {
         if ($$0.B && $$3.l < 5) {
            $$3.l++;
         } else {
            $$0.o($$1);
            $$3.ax_();
            if ($$0.a_($$1).a(dca.bQ)) {
               doz $$4 = dby.b($$3.d, $$0, $$1);
               if ($$4.i()) {
                  $$0.a($$1, $$3.d, 84);
                  dby.a($$3.d, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(dpp.C) && $$4.c(dpp.C)) {
                     $$4 = $$4.a(dpp.C, Boolean.valueOf(false));
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
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      im<dby> $$2 = (im<dby>)(this.o != null ? this.o.a(ks.f) : kr.e.p());
      this.d = ub.a($$2, $$0.p("blockState"));
      this.e = ih.a($$0.h("facing"));
      this.i = $$0.j("progress");
      this.j = this.i;
      this.f = $$0.q("extending");
      this.g = $$0.q("source");
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("blockState", ub.a(this.d));
      $$0.a("facing", this.e.d());
      $$0.a("progress", this.j);
      $$0.a("extending", this.f);
      $$0.a("source", this.g);
   }

   public est a(cyd $$0, ib $$1) {
      est $$2;
      if (!this.f && this.g && this.d.b() instanceof dos) {
         $$2 = this.d.a(dos.c, Boolean.valueOf(true)).k($$0, $$1);
      } else {
         $$2 = esq.a();
      }

      ih $$4 = h.get();
      if ((double)this.i < 1.0 && $$4 == this.f()) {
         return $$2;
      } else {
         doz $$5;
         if (this.d()) {
            $$5 = dca.bz.n().a(dot.a, this.e).a(dot.d, Boolean.valueOf(this.f != 1.0F - this.i < 0.25F));
         } else {
            $$5 = this.d;
         }

         float $$7 = this.e(this.i);
         double $$8 = (double)((float)this.e.j() * $$7);
         double $$9 = (double)((float)this.e.k() * $$7);
         double $$10 = (double)((float)this.e.l() * $$7);
         return esq.a($$2, $$5.k($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long l() {
      return this.k;
   }

   @Override
   public void a(cyx $$0) {
      super.a($$0);
      if ($$0.a(ks.f).a(this.d.b().r().h()).isEmpty()) {
         this.d = dca.a.n();
      }
   }
}
