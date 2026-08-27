import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccx extends ccs implements ccj {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bjg> c = $$0 -> $$0.ff() || $$0.bM();

   public ccx(biu<? extends ccx> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public ccx(cpv $$0, bjg $$1) {
      super(biu.aA, $$1, $$0);
   }

   public ccx(cpv $$0, double $$1, double $$2, double $$3) {
      super(biu.aA, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cja s() {
      return cji.uu;
   }

   @Override
   protected float w() {
      return 0.05F;
   }

   @Override
   protected void a(ehj $$0) {
      super.a($$0);
      if (!this.dL().B) {
         cjf $$1 = this.q();
         clc $$2 = cle.d($$1);
         List<bid> $$3 = cle.a($$1);
         boolean $$4 = $$2 == clf.c && $$3.isEmpty();
         hc $$5 = $$0.b();
         gw $$6 = $$0.a();
         gw $$7 = $$6.a($$5);
         if ($$4) {
            this.a($$7);
            this.a($$7.a($$5.g()));

            for (hc $$8 : hc.c.a) {
               this.a($$7.a($$8));
            }
         }
      }
   }

   @Override
   protected void a(ehl $$0) {
      super.a($$0);
      if (!this.dL().B) {
         cjf $$1 = this.q();
         clc $$2 = cle.d($$1);
         List<bid> $$3 = cle.a($$1);
         boolean $$4 = $$2 == clf.c && $$3.isEmpty();
         if ($$4) {
            this.x();
         } else if (!$$3.isEmpty()) {
            if (this.y()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == ehl.a.c ? ((ehk)$$0).a() : null);
            }
         }

         int $$5 = $$2.b() ? 2007 : 2002;
         this.dL().c($$5, this.dl(), cle.c($$1));
         this.ak();
      }
   }

   private void x() {
      ehi $$0 = this.cG().c(4.0, 2.0, 4.0);

      for (bjg $$2 : this.dL().a(bjg.class, $$0, c)) {
         double $$3 = this.f($$2);
         if ($$3 < 16.0) {
            if ($$2.ff()) {
               $$2.a(this.dM().c(this, this.v()), 1.0F);
            }

            if ($$2.bM() && $$2.bv()) {
               $$2.aD();
            }
         }
      }

      for (bvy $$5 : this.dL().a(bvy.class, $$0)) {
         $$5.s();
      }
   }

   private void a(List<bid> $$0, @Nullable biq $$1) {
      ehi $$2 = this.cG().c(4.0, 2.0, 4.0);
      List<bjg> $$3 = this.dL().a(bjg.class, $$2);
      if (!$$3.isEmpty()) {
         biq $$4 = this.G();

         for (bjg $$5 : $$3) {
            if ($$5.fx()) {
               double $$6 = this.f($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bid $$9 : $$0) {
                     bib $$10 = $$9.c();
                     if ($$10.a()) {
                        $$10.a(this, this.v(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bid $$12 = new bid($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cjf $$0, clc $$1) {
      bin $$2 = new bin(this.dL(), this.dq(), this.ds(), this.dw());
      biq $$3 = this.v();
      if ($$3 instanceof bjg) {
         $$2.a((bjg)$$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.h() / (float)$$2.m());
      $$2.a($$1);

      for (bid $$4 : cle.b($$0)) {
         $$2.a(new bid($$4));
      }

      qy $$5 = $$0.v();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dL().b($$2);
   }

   private boolean y() {
      return this.q().a(cji.ux);
   }

   private void a(gw $$0) {
      dfj $$1 = this.dL().a_($$0);
      if ($$1.a(apt.aJ)) {
         this.dL().a($$0, false, this);
      } else if (crn.c($$1)) {
         crn.a(null, $$1, this.dL(), $$0);
      } else if (cti.g($$1)) {
         this.dL().a(null, 1009, $$0, 0);
         cti.a(this.v(), this.dL(), $$0, $$1);
         this.dL().b($$0, $$1.a(cti.b, Boolean.valueOf(false)));
      }
   }
}
