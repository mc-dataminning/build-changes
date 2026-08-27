import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjy extends cjt implements cjj {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bpp> c = $$0 -> $$0.fm() || $$0.bN();

   public cjy(bpd<? extends cjy> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public cjy(cxb $$0, bpp $$1) {
      super(bpd.aE, $$1, $$0);
   }

   public cjy(cxb $$0, double $$1, double $$2, double $$3) {
      super(bpd.aE, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cqh r() {
      return cqp.vm;
   }

   @Override
   protected double aW() {
      return 0.05;
   }

   @Override
   protected void a(epp $$0) {
      super.a($$0);
      if (!this.dM().B) {
         cqm $$1 = this.p();
         il<csj> $$2 = csl.d($$1);
         List<bok> $$3 = csl.a($$1);
         boolean $$4 = $$2.a(csm.c) && $$3.isEmpty();
         ih $$5 = $$0.b();
         ib $$6 = $$0.a();
         ib $$7 = $$6.a($$5);
         if ($$4) {
            this.a($$7);
            this.a($$7.a($$5.g()));

            for (ih $$8 : ih.c.a) {
               this.a($$7.a($$8));
            }
         }
      }
   }

   @Override
   protected void a(epr $$0) {
      super.a($$0);
      if (!this.dM().B) {
         cqm $$1 = this.p();
         il<csj> $$2 = csl.d($$1);
         List<bok> $$3 = csl.a($$1);
         boolean $$4 = $$2.a(csm.c) && $$3.isEmpty();
         if ($$4) {
            this.s();
         } else if (!$$3.isEmpty()) {
            if (this.w()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == epr.a.c ? ((epq)$$0).a() : null);
            }
         }

         int $$5 = $$2.a().b() ? 2007 : 2002;
         this.dM().c($$5, this.dm(), csl.c($$1));
         this.am();
      }
   }

   private void s() {
      epo $$0 = this.cH().c(4.0, 2.0, 4.0);

      for (bpp $$2 : this.dM().a(bpp.class, $$0, c)) {
         double $$3 = this.g($$2);
         if ($$3 < 16.0) {
            if ($$2.fm()) {
               $$2.a(this.dN().c(this, this.af_()), 1.0F);
            }

            if ($$2.bN() && $$2.bA()) {
               $$2.aF();
            }
         }
      }

      for (cco $$5 : this.dM().a(cco.class, $$0)) {
         $$5.r();
      }
   }

   private void a(List<bok> $$0, @Nullable box $$1) {
      epo $$2 = this.cH().c(4.0, 2.0, 4.0);
      List<bpp> $$3 = this.dM().a(bpp.class, $$2);
      if (!$$3.isEmpty()) {
         box $$4 = this.H();

         for (bpp $$5 : $$3) {
            if ($$5.fD()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bok $$9 : $$0) {
                     il<boi> $$10 = $$9.b();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.af_(), $$5, $$9.d(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bok $$12 = new bok($$10, $$11, $$9.d(), $$9.e(), $$9.f());
                        if (!$$12.a(20)) {
                           $$5.b($$12, $$4);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void a(cqm $$0, il<csj> $$1) {
      bou $$2 = new bou(this.dM(), this.dr(), this.dt(), this.dx());
      if (this.af_() instanceof bpp $$3) {
         $$2.a($$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.g() / (float)$$2.k());
      $$2.a($$1);

      for (bok $$4 : csl.b($$0)) {
         $$2.a(new bok($$4));
      }

      ta $$5 = $$0.w();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dM().b($$2);
   }

   private boolean w() {
      return this.p().a(cqp.vp);
   }

   private void a(ib $$0) {
      dnb $$1 = this.dM().a_($$0);
      if ($$1.a(aun.aK)) {
         this.dM().a($$0, false, this);
      } else if (cyu.c($$1)) {
         cyu.a(null, $$1, this.dM(), $$0);
      } else if (daq.g($$1)) {
         this.dM().a(null, 1009, $$0, 0);
         daq.a(this.af_(), this.dM(), $$0, $$1);
         this.dM().b($$0, $$1.a(daq.c, Boolean.valueOf(false)));
      }
   }
}
