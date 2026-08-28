import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cqd extends cpy {
   public static final double a = 4.0;
   private static final double c = 16.0;
   public static final Predicate<bvi> b = $$0 -> $$0.fr() || $$0.bY();

   public cqd(but<? extends cqd> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public cqd(dgj $$0, bvi $$1, cwq $$2) {
      super(but.aV, $$1, $$0, $$2);
   }

   public cqd(dgj $$0, double $$1, double $$2, double $$3, cwq $$4) {
      super(but.aV, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cwm m() {
      return cwu.wo;
   }

   @Override
   protected double bd() {
      return 0.05;
   }

   @Override
   protected void a(fax $$0) {
      super.a($$0);
      if (!this.dV().C) {
         cwq $$1 = this.l();
         jn $$2 = $$0.c();
         ji $$3 = $$0.b();
         ji $$4 = $$3.a($$2);
         cyp $$5 = $$1.a(kv.Q, cyp.a);
         if ($$5.a(cyq.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jn $$6 : jn.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(faz $$0) {
      super.a($$0);
      if (this.dV() instanceof ard $$1) {
         cwq $$3 = this.l();
         cyp $$4 = $$3.a(kv.Q, cyp.a);
         if ($$4.a(cyq.a)) {
            this.b($$1);
         } else if ($$4.c()) {
            if (this.s()) {
               this.a($$4);
            } else {
               this.a($$1, $$4.a(), $$0.d() == faz.a.c ? ((fay)$$0).a() : null);
            }
         }

         int $$5 = $$4.e().isPresent() && $$4.e().get().a().c() ? 2007 : 2002;
         $$1.c($$5, this.dv(), $$4.b());
         this.at();
      }
   }

   private void b(ard $$0) {
      faw $$1 = this.cR().c(4.0, 2.0, 4.0);

      for (bvi $$3 : this.dV().a(bvi.class, $$1, b)) {
         double $$4 = this.g($$3);
         if ($$4 < 16.0) {
            if ($$3.fr()) {
               $$3.a($$0, this.dW().c(this, this.p()), 1.0F);
            }

            if ($$3.bY() && $$3.bL()) {
               $$3.aN();
            }
         }
      }

      for (cil $$6 : this.dV().a(cil.class, $$1)) {
         $$6.x();
      }
   }

   private void a(ard $$0, Iterable<btr> $$1, @Nullable bum $$2) {
      faw $$3 = this.cR().c(4.0, 2.0, 4.0);
      List<bvi> $$4 = $$0.a(bvi.class, $$3);
      if (!$$4.isEmpty()) {
         bum $$5 = this.E();

         for (bvi $$6 : $$4) {
            if ($$6.fL()) {
               double $$7 = this.g($$6);
               if ($$7 < 16.0) {
                  double $$8;
                  if ($$6 == $$2) {
                     $$8 = 1.0;
                  } else {
                     $$8 = 1.0 - Math.sqrt($$7) / 4.0;
                  }

                  for (btr $$10 : $$1) {
                     jr<btp> $$11 = $$10.c();
                     if ($$11.a().a()) {
                        $$11.a().a($$0, this, this.p(), $$6, $$10.e(), $$8);
                     } else {
                        int $$12 = $$10.a($$1x -> (int)($$8 * (double)$$1x + 0.5));
                        btr $$13 = new btr($$11, $$12, $$10.e(), $$10.f(), $$10.g());
                        if (!$$13.a(20)) {
                           $$6.b($$13, $$5);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void a(cyp $$0) {
      buf $$1 = new buf(this.dV(), this.dA(), this.dC(), this.dG());
      if (this.p() instanceof bvi $$2) {
         $$1.a($$2);
      }

      $$1.a(3.0F);
      $$1.b(-0.5F);
      $$1.c(10);
      $$1.c(-$$1.c() / (float)$$1.g());
      $$1.a($$0);
      this.dV().b($$1);
   }

   private boolean s() {
      return this.l().a(cwu.wr);
   }

   private void a(ji $$0) {
      dwy $$1 = this.dV().a_($$0);
      if ($$1.a(awp.aN)) {
         this.dV().a($$0, false, this);
      } else if (dif.c($$1)) {
         dif.a(null, $$1, this.dV(), $$0);
      } else if (dkc.h($$1)) {
         this.dV().a(null, 1009, $$0, 0);
         dkc.a(this.p(), this.dV(), $$0, $$1);
         this.dV().b($$0, $$1.b(dkc.c, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(bvi $$0, btc $$1) {
      double $$2 = $$0.dt().d - this.dt().d;
      double $$3 = $$0.dt().f - this.dt().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
