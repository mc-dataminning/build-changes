import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cps extends cpn {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bva> c = $$0 -> $$0.ft() || $$0.bZ();

   public cps(bul<? extends cps> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cps(dfb $$0, bva $$1, cwb $$2) {
      super(bul.aE, $$1, $$0, $$2);
   }

   public cps(dfb $$0, double $$1, double $$2, double $$3, cwb $$4) {
      super(bul.aE, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cvx o() {
      return cwf.vq;
   }

   @Override
   protected double be() {
      return 0.05;
   }

   @Override
   protected void a(ezj $$0) {
      super.a($$0);
      if (!this.dX().C) {
         cwb $$1 = this.m();
         jm $$2 = $$0.c();
         jh $$3 = $$0.b();
         jh $$4 = $$3.a($$2);
         cya $$5 = $$1.a(ku.Q, cya.a);
         if ($$5.a(cyb.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jm $$6 : jm.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(ezl $$0) {
      super.a($$0);
      if (!this.dX().C) {
         cwb $$1 = this.m();
         cya $$2 = $$1.a(ku.Q, cya.a);
         if ($$2.a(cyb.a)) {
            this.q();
         } else if ($$2.c()) {
            if (this.t()) {
               this.a($$2);
            } else {
               this.a($$2.a(), $$0.d() == ezl.a.c ? ((ezk)$$0).a() : null);
            }
         }

         int $$3 = $$2.e().isPresent() && $$2.e().get().a().c() ? 2007 : 2002;
         this.dX().c($$3, this.dx(), $$2.b());
         this.av();
      }
   }

   private void q() {
      ezi $$0 = this.cS().c(4.0, 2.0, 4.0);

      for (bva $$2 : this.dX().a(bva.class, $$0, c)) {
         double $$3 = this.g($$2);
         if ($$3 < 16.0) {
            if ($$2.ft()) {
               $$2.a(this.dY().c(this, this.s()), 1.0F);
            }

            if ($$2.bZ() && $$2.bM()) {
               $$2.aO();
            }
         }
      }

      for (cid $$5 : this.dX().a(cid.class, $$0)) {
         $$5.q();
      }
   }

   private void a(Iterable<btj> $$0, @Nullable bue $$1) {
      ezi $$2 = this.cS().c(4.0, 2.0, 4.0);
      List<bva> $$3 = this.dX().a(bva.class, $$2);
      if (!$$3.isEmpty()) {
         bue $$4 = this.E();

         for (bva $$5 : $$3) {
            if ($$5.fN()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (btj $$9 : $$0) {
                     jq<bth> $$10 = $$9.c();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.s(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        btj $$12 = new btj($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cya $$0) {
      btx $$1 = new btx(this.dX(), this.dC(), this.dE(), this.dI());
      if (this.s() instanceof bva $$2) {
         $$1.a($$2);
      }

      $$1.a(3.0F);
      $$1.b(-0.5F);
      $$1.c(10);
      $$1.c(-$$1.g() / (float)$$1.j());
      $$1.a($$0);
      this.dX().b($$1);
   }

   private boolean t() {
      return this.m().a(cwf.vt);
   }

   private void a(jh $$0) {
      dvj $$1 = this.dX().a_($$0);
      if ($$1.a(axa.aL)) {
         this.dX().a($$0, false, this);
      } else if (dgw.c($$1)) {
         dgw.a(null, $$1, this.dX(), $$0);
      } else if (dis.h($$1)) {
         this.dX().a(null, 1009, $$0, 0);
         dis.a(this.s(), this.dX(), $$0, $$1);
         this.dX().b($$0, $$1.b(dis.c, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(bva $$0, bsu $$1) {
      double $$2 = $$0.dv().d - this.dv().d;
      double $$3 = $$0.dv().f - this.dv().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
