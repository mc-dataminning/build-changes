import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class crc extends cqx {
   public static final double a = 4.0;
   private static final double c = 16.0;
   public static final Predicate<bwg> b = $$0 -> $$0.fr() || $$0.bY();

   public crc(bvr<? extends crc> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public crc(dhi $$0, bwg $$1, cxp $$2) {
      super(bvr.aW, $$1, $$0, $$2);
   }

   public crc(dhi $$0, double $$1, double $$2, double $$3, cxp $$4) {
      super(bvr.aW, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cxl m() {
      return cxt.we;
   }

   @Override
   protected double bd() {
      return 0.05;
   }

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      if (!this.dW().C) {
         cxp $$1 = this.l();
         jm $$2 = $$0.c();
         jh $$3 = $$0.b();
         jh $$4 = $$3.a($$2);
         czo $$5 = $$1.a(ku.Q, czo.a);
         if ($$5.a(czp.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jm $$6 : jm.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(fbw $$0) {
      super.a($$0);
      if (this.dW() instanceof ash $$1) {
         cxp $$3 = this.l();
         czo $$4 = $$3.a(ku.Q, czo.a);
         if ($$4.a(czp.a)) {
            this.b($$1);
         } else if ($$4.c()) {
            if (this.s()) {
               this.a($$4);
            } else {
               this.a($$1, $$4.a(), $$0.d() == fbw.a.c ? ((fbv)$$0).a() : null);
            }
         }

         int $$5 = $$4.e().isPresent() && $$4.e().get().a().c() ? 2007 : 2002;
         $$1.c($$5, this.dw(), $$4.b());
         this.at();
      }
   }

   private void b(ash $$0) {
      fbt $$1 = this.cR().c(4.0, 2.0, 4.0);

      for (bwg $$3 : this.dW().a(bwg.class, $$1, b)) {
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

      for (cjj $$6 : this.dW().a(cjj.class, $$1)) {
         $$6.x();
      }
   }

   private void a(ash $$0, Iterable<bup> $$1, @Nullable bvk $$2) {
      fbt $$3 = this.cR().c(4.0, 2.0, 4.0);
      List<bwg> $$4 = $$0.a(bwg.class, $$3);
      if (!$$4.isEmpty()) {
         bvk $$5 = this.E();

         for (bwg $$6 : $$4) {
            if ($$6.fL()) {
               double $$7 = this.g($$6);
               if ($$7 < 16.0) {
                  double $$8;
                  if ($$6 == $$2) {
                     $$8 = 1.0;
                  } else {
                     $$8 = 1.0 - Math.sqrt($$7) / 4.0;
                  }

                  for (bup $$10 : $$1) {
                     jq<bun> $$11 = $$10.c();
                     if ($$11.a().a()) {
                        $$11.a().a($$0, this, this.p(), $$6, $$10.e(), $$8);
                     } else {
                        int $$12 = $$10.a($$1x -> (int)($$8 * (double)$$1x + 0.5));
                        bup $$13 = new bup($$11, $$12, $$10.e(), $$10.f(), $$10.g());
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

   private void a(czo $$0) {
      bvd $$1 = new bvd(this.dW(), this.dB(), this.dD(), this.dH());
      if (this.p() instanceof bwg $$2) {
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
      return this.l().a(cxt.wh);
   }

   private void a(jh $$0) {
      dxv $$1 = this.dW().a_($$0);
      if ($$1.a(axu.aN)) {
         this.dW().a($$0, false, this);
      } else if (dje.c($$1)) {
         dje.a(null, $$1, this.dW(), $$0);
      } else if (dlb.h($$1)) {
         this.dW().a(null, 1009, $$0, 0);
         dlb.a(this.p(), this.dW(), $$0, $$1);
         this.dW().b($$0, $$1.b(dlb.c, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(bwg $$0, bua $$1) {
      double $$2 = $$0.du().d - this.du().d;
      double $$3 = $$0.du().f - this.du().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
