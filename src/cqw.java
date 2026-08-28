import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cqw extends cqr {
   public static final double a = 4.0;
   private static final double c = 16.0;
   public static final Predicate<bvy> b = $$0 -> $$0.ft() || $$0.bX();

   public cqw(bvi<? extends cqw> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqw(dgz $$0, bvy $$1, cxh $$2) {
      super(bvi.aV, $$1, $$0, $$2);
   }

   public cqw(dgz $$0, double $$1, double $$2, double $$3, cxh $$4) {
      super(bvi.aV, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cxd g() {
      return cxl.wq;
   }

   @Override
   protected double bd() {
      return 0.05;
   }

   @Override
   protected void a(fbt $$0) {
      super.a($$0);
      if (!this.dU().C) {
         cxh $$1 = this.f();
         jn $$2 = $$0.c();
         ji $$3 = $$0.b();
         ji $$4 = $$3.a($$2);
         cze $$5 = $$1.a(kv.R, cze.a);
         if ($$5.a(czf.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jn $$6 : jn.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      if (this.dU() instanceof ard $$1) {
         cxh $$3 = this.f();
         cze $$4 = $$3.a(kv.R, cze.a);
         if ($$4.a(czf.a)) {
            this.b($$1);
         } else if ($$4.c()) {
            float $$5 = $$3.a(kv.S, 1.0F);
            if (this.j()) {
               this.a($$4, $$5);
            } else {
               this.a($$1, $$4.a(), $$5, $$0.d() == fbv.a.c ? ((fbu)$$0).a() : null);
            }
         }

         int $$6 = $$4.e().isPresent() && $$4.e().get().a().c() ? 2007 : 2002;
         $$1.c($$6, this.du(), $$4.b());
         this.at();
      }
   }

   private void b(ard $$0) {
      fbs $$1 = this.cQ().c(4.0, 2.0, 4.0);

      for (bvy $$3 : this.dU().a(bvy.class, $$1, b)) {
         double $$4 = this.g($$3);
         if ($$4 < 16.0) {
            if ($$3.ft()) {
               $$3.a($$0, this.dV().c(this, this.q()), 1.0F);
            }

            if ($$3.bX() && $$3.bJ()) {
               $$3.aN();
            }
         }
      }

      for (cje $$6 : this.dU().a(cje.class, $$1)) {
         $$6.q();
      }
   }

   private void a(ard $$0, Iterable<bue> $$1, float $$2, @Nullable bva $$3) {
      fbs $$4 = this.cQ().c(4.0, 2.0, 4.0);
      List<bvy> $$5 = $$0.a(bvy.class, $$4);
      if (!$$5.isEmpty()) {
         bva $$6 = this.z();

         for (bvy $$7 : $$5) {
            if ($$7.fN()) {
               double $$8 = this.g($$7);
               if ($$8 < 16.0) {
                  double $$9;
                  if ($$7 == $$3) {
                     $$9 = 1.0;
                  } else {
                     $$9 = 1.0 - Math.sqrt($$8) / 4.0;
                  }

                  for (bue $$11 : $$1) {
                     jr<buc> $$12 = $$11.c();
                     if ($$12.a().a()) {
                        $$12.a().a($$0, this, this.q(), $$7, $$11.e(), $$9);
                     } else {
                        int $$13 = $$11.a($$2x -> (int)((double)$$2 * $$9 * (double)$$2x + 0.5));
                        bue $$14 = new bue($$12, $$13, $$11.e(), $$11.f(), $$11.g());
                        if (!$$14.a(20)) {
                           $$7.b($$14, $$6);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void a(cze $$0, float $$1) {
      bus $$2 = new bus(this.dU(), this.dz(), this.dB(), this.dF());
      if (this.q() instanceof bvy $$3) {
         $$2.a($$3);
      }

      $$2.a(3.0F);
      $$2.c(-0.5F);
      $$2.c(10);
      $$2.d(-$$2.e() / (float)$$2.i());
      $$2.a($$0);
      $$2.b($$1);
      this.dU().b($$2);
   }

   private boolean j() {
      return this.f().a(cxl.wt);
   }

   private void a(ji $$0) {
      dxq $$1 = this.dU().a_($$0);
      if ($$1.a(awp.aN)) {
         this.dU().a($$0, false, this);
      } else if (diw.c($$1)) {
         diw.a(null, $$1, this.dU(), $$0);
      } else if (dkt.h($$1)) {
         this.dU().a(null, 1009, $$0, 0);
         dkt.a(this.q(), this.dU(), $$0, $$1);
         this.dU().b($$0, $$1.b(dkt.b, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(bvy $$0, btp $$1) {
      double $$2 = $$0.ds().d - this.ds().d;
      double $$3 = $$0.ds().f - this.ds().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
