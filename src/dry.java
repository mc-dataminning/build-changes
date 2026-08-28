import java.util.Iterator;
import java.util.List;

public class dry extends dph {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private dsc d = dfb.a.o();
   private je e;
   private boolean f;
   private boolean g;
   private static final ThreadLocal<je> h = ThreadLocal.withInitial(() -> null);
   private float i;
   private float j;
   private long k;
   private int l;

   public dry(iz $$0, dsc $$1) {
      super(dpj.k, $$0, $$1);
   }

   public dry(iz $$0, dsc $$1, dsc $$2, je $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public us a(jk.a $$0) {
      return this.e($$0);
   }

   public boolean b() {
      return this.f;
   }

   public je c() {
      return this.e;
   }

   public boolean d() {
      return this.g;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return ayz.i($$0, this.j, this.i);
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

   private dsc u() {
      return !this.b() && this.d() && this.d.b() instanceof drv
         ? dfb.bz.o().a(drw.d, Boolean.valueOf(this.i > 0.25F)).a(drw.c, this.d.a(dfb.br) ? dte.b : dte.a).a(drw.a, this.d.c(drv.a))
         : this.d;
   }

   private static void a(dby $$0, iz $$1, float $$2, dry $$3) {
      je $$4 = $$3.f();
      double $$5 = (double)($$2 - $$3.i);
      ewk $$6 = $$3.u().k($$0, $$1);
      if (!$$6.c()) {
         evm $$7 = a($$1, $$6.a(), $$3);
         List<bsu> $$8 = $$0.a_(null, drx.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<evm> $$9 = $$6.e();
            boolean $$10 = $$3.d.a(dfb.hV);
            Iterator var12 = $$8.iterator();

            while (true) {
               bsu $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (bsu)var12.next();
                  if ($$11.k_() != eoa.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof arg)) {
                        evr $$12 = $$11.ds();
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

               for (evm $$17 : $$9) {
                  evm $$18 = drx.a(a($$1, $$17, $$3), $$4, $$5);
                  evm $$19 = $$11.cK();
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

   private static void a(je $$0, bsu $$1, double $$2, je $$3) {
      h.set($$0);
      $$1.a(btu.c, new evr($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      h.set(null);
   }

   private static void b(dby $$0, iz $$1, float $$2, dry $$3) {
      if ($$3.v()) {
         je $$4 = $$3.f();
         if ($$4.o().d()) {
            double $$5 = $$3.d.k($$0, $$1).c(je.a.b);
            evm $$6 = a($$1, new evm(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.i);

            for (bsu $$9 : $$0.a((bsu)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(evm $$0, bsu $$1, iz $$2) {
      return $$1.k_() == eoa.a && $$1.aE() && ($$1.e($$2) || $$1.du() >= $$0.a && $$1.du() <= $$0.d && $$1.dA() >= $$0.c && $$1.dA() <= $$0.f);
   }

   private boolean v() {
      return this.d.a(dfb.pg);
   }

   public je f() {
      return this.f ? this.e : this.e.g();
   }

   private static double a(evm $$0, je $$1, evm $$2) {
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

   private static evm a(iz $$0, evm $$1, dry $$2) {
      double $$3 = (double)$$2.e($$2.i);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.e.j(), (double)$$0.v() + $$3 * (double)$$2.e.k(), (double)$$0.w() + $$3 * (double)$$2.e.l());
   }

   private static void a(iz $$0, bsu $$1, je $$2, double $$3) {
      evm $$4 = $$1.cK();
      evm $$5 = ewh.b().a().a($$0);
      if ($$4.c($$5)) {
         je $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }
   }

   public dsc j() {
      return this.d;
   }

   public void k() {
      if (this.n != null && (this.j < 1.0F || this.n.B)) {
         this.i = 1.0F;
         this.j = this.i;
         this.n.o(this.o);
         this.av_();
         if (this.n.a_(this.o).a(dfb.bQ)) {
            dsc $$0;
            if (this.g) {
               $$0 = dfb.a.o();
            } else {
               $$0 = dez.b(this.d, this.n, this.o);
            }

            this.n.a(this.o, $$0, 3);
            this.n.a(this.o, $$0.b(), this.o);
         }
      }
   }

   public static void a(dby $$0, iz $$1, dsc $$2, dry $$3) {
      $$3.k = $$0.Z();
      $$3.j = $$3.i;
      if ($$3.j >= 1.0F) {
         if ($$0.B && $$3.l < 5) {
            $$3.l++;
         } else {
            $$0.o($$1);
            $$3.av_();
            if ($$0.a_($$1).a(dfb.bQ)) {
               dsc $$4 = dez.b($$3.d, $$0, $$1);
               if ($$4.i()) {
                  $$0.a($$1, $$3.d, 84);
                  dez.a($$3.d, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(dss.C) && $$4.c(dss.C)) {
                     $$4 = $$4.a(dss.C, Boolean.valueOf(false));
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
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      jj<dez> $$2 = (jj<dez>)(this.n != null ? this.n.a(lq.f) : lp.e.p());
      this.d = vh.a($$2, $$0.p("blockState"));
      this.e = je.a($$0.h("facing"));
      this.i = $$0.j("progress");
      this.j = this.i;
      this.f = $$0.q("extending");
      this.g = $$0.q("source");
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("blockState", vh.a(this.d));
      $$0.a("facing", this.e.d());
      $$0.a("progress", this.j);
      $$0.a("extending", this.f);
      $$0.a("source", this.g);
   }

   public ewk a(dbe $$0, iz $$1) {
      ewk $$2;
      if (!this.f && this.g && this.d.b() instanceof drv) {
         $$2 = this.d.a(drv.c, Boolean.valueOf(true)).k($$0, $$1);
      } else {
         $$2 = ewh.a();
      }

      je $$4 = h.get();
      if ((double)this.i < 1.0 && $$4 == this.f()) {
         return $$2;
      } else {
         dsc $$5;
         if (this.d()) {
            $$5 = dfb.bz.o().a(drw.a, this.e).a(drw.d, Boolean.valueOf(this.f != 1.0F - this.i < 0.25F));
         } else {
            $$5 = this.d;
         }

         float $$7 = this.e(this.i);
         double $$8 = (double)((float)this.e.j() * $$7);
         double $$9 = (double)((float)this.e.k() * $$7);
         double $$10 = (double)((float)this.e.l() * $$7);
         return ewh.a($$2, $$5.k($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long l() {
      return this.k;
   }

   @Override
   public void a(dby $$0) {
      super.a($$0);
      if ($$0.a(lq.f).a(this.d.b().s().h()).isEmpty()) {
         this.d = dfb.a.o();
      }
   }
}
