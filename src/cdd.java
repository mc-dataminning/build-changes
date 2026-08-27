import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdd extends ccy implements ccp {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bjm> c = $$0 -> $$0.fg() || $$0.bM();

   public cdd(bja<? extends cdd> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public cdd(cqb $$0, bjm $$1) {
      super(bja.aA, $$1, $$0);
   }

   public cdd(cqb $$0, double $$1, double $$2, double $$3) {
      super(bja.aA, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cjg s() {
      return cjo.uu;
   }

   @Override
   protected float w() {
      return 0.05F;
   }

   @Override
   protected void a(ehd $$0) {
      super.a($$0);
      if (!this.dL().B) {
         cjl $$1 = this.q();
         cli $$2 = clk.d($$1);
         List<bij> $$3 = clk.a($$1);
         boolean $$4 = $$2 == cll.c && $$3.isEmpty();
         ha $$5 = $$0.b();
         gw $$6 = $$0.a();
         gw $$7 = $$6.a($$5);
         if ($$4) {
            this.a($$7);
            this.a($$7.a($$5.g()));

            for (ha $$8 : ha.c.a) {
               this.a($$7.a($$8));
            }
         }
      }
   }

   @Override
   protected void a(ehf $$0) {
      super.a($$0);
      if (!this.dL().B) {
         cjl $$1 = this.q();
         cli $$2 = clk.d($$1);
         List<bij> $$3 = clk.a($$1);
         boolean $$4 = $$2 == cll.c && $$3.isEmpty();
         if ($$4) {
            this.x();
         } else if (!$$3.isEmpty()) {
            if (this.y()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == ehf.a.c ? ((ehe)$$0).a() : null);
            }
         }

         int $$5 = $$2.b() ? 2007 : 2002;
         this.dL().c($$5, this.dl(), clk.c($$1));
         this.ak();
      }
   }

   private void x() {
      ehc $$0 = this.cG().c(4.0, 2.0, 4.0);

      for (bjm $$2 : this.dL().a(bjm.class, $$0, c)) {
         double $$3 = this.f($$2);
         if ($$3 < 16.0) {
            if ($$2.fg()) {
               $$2.a(this.dM().c(this, this.v()), 1.0F);
            }

            if ($$2.bM() && $$2.bv()) {
               $$2.aD();
            }
         }
      }

      for (bwe $$5 : this.dL().a(bwe.class, $$0)) {
         $$5.s();
      }
   }

   private void a(List<bij> $$0, @Nullable biw $$1) {
      ehc $$2 = this.cG().c(4.0, 2.0, 4.0);
      List<bjm> $$3 = this.dL().a(bjm.class, $$2);
      if (!$$3.isEmpty()) {
         biw $$4 = this.G();

         for (bjm $$5 : $$3) {
            if ($$5.fy()) {
               double $$6 = this.f($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bij $$9 : $$0) {
                     bih $$10 = $$9.c();
                     if ($$10.a()) {
                        $$10.a(this, this.v(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bij $$12 = new bij($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cjl $$0, cli $$1) {
      bit $$2 = new bit(this.dL(), this.dq(), this.ds(), this.dw());
      biw $$3 = this.v();
      if ($$3 instanceof bjm) {
         $$2.a((bjm)$$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.h() / (float)$$2.m());
      $$2.a($$1);

      for (bij $$4 : clk.b($$0)) {
         $$2.a(new bij($$4));
      }

      qw $$5 = $$0.v();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dL().b($$2);
   }

   private boolean y() {
      return this.q().a(cjo.ux);
   }

   private void a(gw $$0) {
      dfd $$1 = this.dL().a_($$0);
      if ($$1.a(apv.aJ)) {
         this.dL().a($$0, false, this);
      } else if (crt.c($$1)) {
         crt.a(null, $$1, this.dL(), $$0);
      } else if (ctq.g($$1)) {
         this.dL().a(null, 1009, $$0, 0);
         ctq.a(this.v(), this.dL(), $$0, $$1);
         this.dL().b($$0, $$1.a(ctq.c, Boolean.valueOf(false)));
      }
   }
}
