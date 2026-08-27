import java.util.Iterator;
import java.util.List;

public class dqd extends dnm {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private dqh d = ddg.a.n();
   private is e;
   private boolean f;
   private boolean g;
   private static final ThreadLocal<is> h = ThreadLocal.withInitial(() -> null);
   private float i;
   private float j;
   private long k;
   private int l;

   public dqd(in $$0, dqh $$1) {
      super(dno.k, $$0, $$1);
   }

   public dqd(in $$0, dqh $$1, dqh $$2, is $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public ua a(iy.a $$0) {
      return this.d($$0);
   }

   public boolean b() {
      return this.f;
   }

   public is c() {
      return this.e;
   }

   public boolean d() {
      return this.g;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return axz.i($$0, this.j, this.i);
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

   private dqh t() {
      return !this.b() && this.d() && this.d.b() instanceof dqa
         ? ddg.bz.n().a(dqb.d, Boolean.valueOf(this.i > 0.25F)).a(dqb.c, this.d.a(ddg.br) ? drj.b : drj.a).a(dqb.a, this.d.c(dqa.a))
         : this.d;
   }

   private static void a(dad $$0, in $$1, float $$2, dqd $$3) {
      is $$4 = $$3.f();
      double $$5 = (double)($$2 - $$3.i);
      eui $$6 = $$3.t().k($$0, $$1);
      if (!$$6.c()) {
         etk $$7 = a($$1, $$6.a(), $$3);
         List<brh> $$8 = $$0.a_(null, dqc.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<etk> $$9 = $$6.e();
            boolean $$10 = $$3.d.a(ddg.hV);
            Iterator var12 = $$8.iterator();

            while (true) {
               brh $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (brh)var12.next();
                  if ($$11.k_() != emf.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof aqi)) {
                        etp $$12 = $$11.dq();
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

               for (etk $$17 : $$9) {
                  etk $$18 = dqc.a(a($$1, $$17, $$3), $$4, $$5);
                  etk $$19 = $$11.cI();
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

   private static void a(is $$0, brh $$1, double $$2, is $$3) {
      h.set($$0);
      $$1.a(bsf.c, new etp($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      h.set(null);
   }

   private static void b(dad $$0, in $$1, float $$2, dqd $$3) {
      if ($$3.u()) {
         is $$4 = $$3.f();
         if ($$4.o().d()) {
            double $$5 = $$3.d.k($$0, $$1).c(is.a.b);
            etk $$6 = a($$1, new etk(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.i);

            for (brh $$9 : $$0.a((brh)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(etk $$0, brh $$1, in $$2) {
      return $$1.k_() == emf.a && $$1.aC() && ($$1.d($$2) || $$1.ds() >= $$0.a && $$1.ds() <= $$0.d && $$1.dy() >= $$0.c && $$1.dy() <= $$0.f);
   }

   private boolean u() {
      return this.d.a(ddg.pg);
   }

   public is f() {
      return this.f ? this.e : this.e.g();
   }

   private static double a(etk $$0, is $$1, etk $$2) {
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

   private static etk a(in $$0, etk $$1, dqd $$2) {
      double $$3 = (double)$$2.e($$2.i);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.e.j(), (double)$$0.v() + $$3 * (double)$$2.e.k(), (double)$$0.w() + $$3 * (double)$$2.e.l());
   }

   private static void a(in $$0, brh $$1, is $$2, double $$3) {
      etk $$4 = $$1.cI();
      etk $$5 = euf.b().a().a($$0);
      if ($$4.c($$5)) {
         is $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }
   }

   public dqh j() {
      return this.d;
   }

   public void k() {
      if (this.n != null && (this.j < 1.0F || this.n.B)) {
         this.i = 1.0F;
         this.j = this.i;
         this.n.o(this.o);
         this.aw_();
         if (this.n.a_(this.o).a(ddg.bQ)) {
            dqh $$0;
            if (this.g) {
               $$0 = ddg.a.n();
            } else {
               $$0 = dde.b(this.d, this.n, this.o);
            }

            this.n.a(this.o, $$0, 3);
            this.n.a(this.o, $$0.b(), this.o);
         }
      }
   }

   public static void a(dad $$0, in $$1, dqh $$2, dqd $$3) {
      $$3.k = $$0.Y();
      $$3.j = $$3.i;
      if ($$3.j >= 1.0F) {
         if ($$0.B && $$3.l < 5) {
            $$3.l++;
         } else {
            $$0.o($$1);
            $$3.aw_();
            if ($$0.a_($$1).a(ddg.bQ)) {
               dqh $$4 = dde.b($$3.d, $$0, $$1);
               if ($$4.i()) {
                  $$0.a($$1, $$3.d, 84);
                  dde.a($$3.d, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(dqx.C) && $$4.c(dqx.C)) {
                     $$4 = $$4.a(dqx.C, Boolean.valueOf(false));
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
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      ix<dde> $$2 = (ix<dde>)(this.n != null ? this.n.a(le.f) : ld.e.p());
      this.d = up.a($$2, $$0.p("blockState"));
      this.e = is.a($$0.h("facing"));
      this.i = $$0.j("progress");
      this.j = this.i;
      this.f = $$0.q("extending");
      this.g = $$0.q("source");
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      $$0.a("blockState", up.a(this.d));
      $$0.a("facing", this.e.d());
      $$0.a("progress", this.j);
      $$0.a("extending", this.f);
      $$0.a("source", this.g);
   }

   public eui a(czj $$0, in $$1) {
      eui $$2;
      if (!this.f && this.g && this.d.b() instanceof dqa) {
         $$2 = this.d.a(dqa.c, Boolean.valueOf(true)).k($$0, $$1);
      } else {
         $$2 = euf.a();
      }

      is $$4 = h.get();
      if ((double)this.i < 1.0 && $$4 == this.f()) {
         return $$2;
      } else {
         dqh $$5;
         if (this.d()) {
            $$5 = ddg.bz.n().a(dqb.a, this.e).a(dqb.d, Boolean.valueOf(this.f != 1.0F - this.i < 0.25F));
         } else {
            $$5 = this.d;
         }

         float $$7 = this.e(this.i);
         double $$8 = (double)((float)this.e.j() * $$7);
         double $$9 = (double)((float)this.e.k() * $$7);
         double $$10 = (double)((float)this.e.l() * $$7);
         return euf.a($$2, $$5.k($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long l() {
      return this.k;
   }

   @Override
   public void a(dad $$0) {
      super.a($$0);
      if ($$0.a(le.f).a(this.d.b().r().h()).isEmpty()) {
         this.d = ddg.a.n();
      }
   }
}
