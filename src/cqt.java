import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cqt extends cqo {
   public static final double a = 4.0;
   private static final double c = 16.0;
   public static final Predicate<bvx> b = $$0 -> $$0.fr() || $$0.bY();

   public cqt(bvi<? extends cqt> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqt(dgz $$0, bvx $$1, cxg $$2) {
      super(bvi.aW, $$1, $$0, $$2);
   }

   public cqt(dgz $$0, double $$1, double $$2, double $$3, cxg $$4) {
      super(bvi.aW, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cxc m() {
      return cxk.wo;
   }

   @Override
   protected double bd() {
      return 0.05;
   }

   @Override
   protected void a(fbn $$0) {
      super.a($$0);
      if (!this.dW().C) {
         cxg $$1 = this.l();
         jm $$2 = $$0.c();
         jh $$3 = $$0.b();
         jh $$4 = $$3.a($$2);
         czf $$5 = $$1.a(ku.Q, czf.a);
         if ($$5.a(czg.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jm $$6 : jm.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(fbp $$0) {
      super.a($$0);
      if (this.dW() instanceof arx $$1) {
         cxg $$3 = this.l();
         czf $$4 = $$3.a(ku.Q, czf.a);
         if ($$4.a(czg.a)) {
            this.b($$1);
         } else if ($$4.c()) {
            if (this.s()) {
               this.a($$4);
            } else {
               this.a($$1, $$4.a(), $$0.d() == fbp.a.c ? ((fbo)$$0).a() : null);
            }
         }

         int $$5 = $$4.e().isPresent() && $$4.e().get().a().c() ? 2007 : 2002;
         $$1.c($$5, this.dw(), $$4.b());
         this.at();
      }
   }

   private void b(arx $$0) {
      fbm $$1 = this.cR().c(4.0, 2.0, 4.0);

      for (bvx $$3 : this.dW().a(bvx.class, $$1, b)) {
         double $$4 = this.g($$3);
         if ($$4 < 16.0) {
            if ($$3.fr()) {
               $$3.a($$0, this.dX().c(this, this.p()), 1.0F);
            }

            if ($$3.bY() && $$3.bL()) {
               $$3.aN();
            }
         }
      }

      for (cja $$6 : this.dW().a(cja.class, $$1)) {
         $$6.x();
      }
   }

   private void a(arx $$0, Iterable<bug> $$1, @Nullable bvb $$2) {
      fbm $$3 = this.cR().c(4.0, 2.0, 4.0);
      List<bvx> $$4 = $$0.a(bvx.class, $$3);
      if (!$$4.isEmpty()) {
         bvb $$5 = this.E();

         for (bvx $$6 : $$4) {
            if ($$6.fL()) {
               double $$7 = this.g($$6);
               if ($$7 < 16.0) {
                  double $$8;
                  if ($$6 == $$2) {
                     $$8 = 1.0;
                  } else {
                     $$8 = 1.0 - Math.sqrt($$7) / 4.0;
                  }

                  for (bug $$10 : $$1) {
                     jq<bue> $$11 = $$10.c();
                     if ($$11.a().a()) {
                        $$11.a().a($$0, this, this.p(), $$6, $$10.e(), $$8);
                     } else {
                        int $$12 = $$10.a($$1x -> (int)($$8 * (double)$$1x + 0.5));
                        bug $$13 = new bug($$11, $$12, $$10.e(), $$10.f(), $$10.g());
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

   private void a(czf $$0) {
      buu $$1 = new buu(this.dW(), this.dB(), this.dD(), this.dH());
      if (this.p() instanceof bvx $$2) {
         $$1.a($$2);
      }

      $$1.a(3.0F);
      $$1.b(-0.5F);
      $$1.c(10);
      $$1.c(-$$1.c() / (float)$$1.g());
      $$1.a($$0);
      this.dW().b($$1);
   }

   private boolean s() {
      return this.l().a(cxk.wr);
   }

   private void a(jh $$0) {
      dxo $$1 = this.dW().a_($$0);
      if ($$1.a(axk.aN)) {
         this.dW().a($$0, false, this);
      } else if (div.c($$1)) {
         div.a(null, $$1, this.dW(), $$0);
      } else if (dks.h($$1)) {
         this.dW().a(null, 1009, $$0, 0);
         dks.a(this.p(), this.dW(), $$0, $$1);
         this.dW().b($$0, $$1.b(dks.c, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(bvx $$0, btr $$1) {
      double $$2 = $$0.du().d - this.du().d;
      double $$3 = $$0.du().f - this.du().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
