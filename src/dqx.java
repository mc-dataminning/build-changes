import java.util.Iterator;
import java.util.List;

public class dqx extends dog {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private drb d = dea.a.n();
   private it e;
   private boolean f;
   private boolean g;
   private static final ThreadLocal<it> h = ThreadLocal.withInitial(() -> null);
   private float i;
   private float j;
   private long k;
   private int l;

   public dqx(io $$0, drb $$1) {
      super(doi.k, $$0, $$1);
   }

   public dqx(io $$0, drb $$1, drb $$2, it $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public ud a(iz.a $$0) {
      return this.e($$0);
   }

   public boolean b() {
      return this.f;
   }

   public it c() {
      return this.e;
   }

   public boolean d() {
      return this.g;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return ayd.i($$0, this.j, this.i);
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

   private drb u() {
      return !this.b() && this.d() && this.d.b() instanceof dqu
         ? dea.bz.n().a(dqv.d, Boolean.valueOf(this.i > 0.25F)).a(dqv.c, this.d.a(dea.br) ? dsd.b : dsd.a).a(dqv.a, this.d.c(dqu.a))
         : this.d;
   }

   private static void a(dax $$0, io $$1, float $$2, dqx $$3) {
      it $$4 = $$3.f();
      double $$5 = (double)($$2 - $$3.i);
      evd $$6 = $$3.u().k($$0, $$1);
      if (!$$6.c()) {
         euf $$7 = a($$1, $$6.a(), $$3);
         List<bru> $$8 = $$0.a_(null, dqw.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<euf> $$9 = $$6.e();
            boolean $$10 = $$3.d.a(dea.hV);
            Iterator var12 = $$8.iterator();

            while (true) {
               bru $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (bru)var12.next();
                  if ($$11.k_() != emz.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof aqn)) {
                        euk $$12 = $$11.ds();
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

               for (euf $$17 : $$9) {
                  euf $$18 = dqw.a(a($$1, $$17, $$3), $$4, $$5);
                  euf $$19 = $$11.cK();
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

   private static void a(it $$0, bru $$1, double $$2, it $$3) {
      h.set($$0);
      $$1.a(bst.c, new euk($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      h.set(null);
   }

   private static void b(dax $$0, io $$1, float $$2, dqx $$3) {
      if ($$3.v()) {
         it $$4 = $$3.f();
         if ($$4.o().d()) {
            double $$5 = $$3.d.k($$0, $$1).c(it.a.b);
            euf $$6 = a($$1, new euf(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.i);

            for (bru $$9 : $$0.a((bru)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(euf $$0, bru $$1, io $$2) {
      return $$1.k_() == emz.a && $$1.aE() && ($$1.e($$2) || $$1.du() >= $$0.a && $$1.du() <= $$0.d && $$1.dA() >= $$0.c && $$1.dA() <= $$0.f);
   }

   private boolean v() {
      return this.d.a(dea.pg);
   }

   public it f() {
      return this.f ? this.e : this.e.g();
   }

   private static double a(euf $$0, it $$1, euf $$2) {
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

   private static euf a(io $$0, euf $$1, dqx $$2) {
      double $$3 = (double)$$2.e($$2.i);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.e.j(), (double)$$0.v() + $$3 * (double)$$2.e.k(), (double)$$0.w() + $$3 * (double)$$2.e.l());
   }

   private static void a(io $$0, bru $$1, it $$2, double $$3) {
      euf $$4 = $$1.cK();
      euf $$5 = eva.b().a().a($$0);
      if ($$4.c($$5)) {
         it $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }
   }

   public drb j() {
      return this.d;
   }

   public void k() {
      if (this.n != null && (this.j < 1.0F || this.n.B)) {
         this.i = 1.0F;
         this.j = this.i;
         this.n.o(this.o);
         this.aw_();
         if (this.n.a_(this.o).a(dea.bQ)) {
            drb $$0;
            if (this.g) {
               $$0 = dea.a.n();
            } else {
               $$0 = ddy.b(this.d, this.n, this.o);
            }

            this.n.a(this.o, $$0, 3);
            this.n.a(this.o, $$0.b(), this.o);
         }
      }
   }

   public static void a(dax $$0, io $$1, drb $$2, dqx $$3) {
      $$3.k = $$0.Y();
      $$3.j = $$3.i;
      if ($$3.j >= 1.0F) {
         if ($$0.B && $$3.l < 5) {
            $$3.l++;
         } else {
            $$0.o($$1);
            $$3.aw_();
            if ($$0.a_($$1).a(dea.bQ)) {
               drb $$4 = ddy.b($$3.d, $$0, $$1);
               if ($$4.i()) {
                  $$0.a($$1, $$3.d, 84);
                  ddy.a($$3.d, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(drr.C) && $$4.c(drr.C)) {
                     $$4 = $$4.a(drr.C, Boolean.valueOf(false));
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
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      iy<ddy> $$2 = (iy<ddy>)(this.n != null ? this.n.a(lf.f) : le.e.p());
      this.d = us.a($$2, $$0.p("blockState"));
      this.e = it.a($$0.h("facing"));
      this.i = $$0.j("progress");
      this.j = this.i;
      this.f = $$0.q("extending");
      this.g = $$0.q("source");
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      $$0.a("blockState", us.a(this.d));
      $$0.a("facing", this.e.d());
      $$0.a("progress", this.j);
      $$0.a("extending", this.f);
      $$0.a("source", this.g);
   }

   public evd a(dad $$0, io $$1) {
      evd $$2;
      if (!this.f && this.g && this.d.b() instanceof dqu) {
         $$2 = this.d.a(dqu.c, Boolean.valueOf(true)).k($$0, $$1);
      } else {
         $$2 = eva.a();
      }

      it $$4 = h.get();
      if ((double)this.i < 1.0 && $$4 == this.f()) {
         return $$2;
      } else {
         drb $$5;
         if (this.d()) {
            $$5 = dea.bz.n().a(dqv.a, this.e).a(dqv.d, Boolean.valueOf(this.f != 1.0F - this.i < 0.25F));
         } else {
            $$5 = this.d;
         }

         float $$7 = this.e(this.i);
         double $$8 = (double)((float)this.e.j() * $$7);
         double $$9 = (double)((float)this.e.k() * $$7);
         double $$10 = (double)((float)this.e.l() * $$7);
         return eva.a($$2, $$5.k($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long l() {
      return this.k;
   }

   @Override
   public void a(dax $$0) {
      super.a($$0);
      if ($$0.a(lf.f).a(this.d.b().r().h()).isEmpty()) {
         this.d = dea.a.n();
      }
   }
}
