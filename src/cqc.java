import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cqc extends cpx {
   public static final double a = 4.0;
   private static final double c = 16.0;
   public static final Predicate<bvg> b = $$0 -> $$0.fr() || $$0.bY();

   public cqc(bur<? extends cqc> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public cqc(dgi $$0, bvg $$1, cwp $$2) {
      super(bur.aW, $$1, $$0, $$2);
   }

   public cqc(dgi $$0, double $$1, double $$2, double $$3, cwp $$4) {
      super(bur.aW, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cwl m() {
      return cwt.wo;
   }

   @Override
   protected double bd() {
      return 0.05;
   }

   @Override
   protected void a(faw $$0) {
      super.a($$0);
      if (!this.dW().C) {
         cwp $$1 = this.l();
         jn $$2 = $$0.c();
         ji $$3 = $$0.b();
         ji $$4 = $$3.a($$2);
         cyo $$5 = $$1.a(kv.Q, cyo.a);
         if ($$5.a(cyp.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jn $$6 : jn.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(fay $$0) {
      super.a($$0);
      if (this.dW() instanceof arc $$1) {
         cwp $$3 = this.l();
         cyo $$4 = $$3.a(kv.Q, cyo.a);
         if ($$4.a(cyp.a)) {
            this.b($$1);
         } else if ($$4.c()) {
            if (this.s()) {
               this.a($$4);
            } else {
               this.a($$1, $$4.a(), $$0.d() == fay.a.c ? ((fax)$$0).a() : null);
            }
         }

         int $$5 = $$4.e().isPresent() && $$4.e().get().a().c() ? 2007 : 2002;
         $$1.c($$5, this.dw(), $$4.b());
         this.at();
      }
   }

   private void b(arc $$0) {
      fav $$1 = this.cR().c(4.0, 2.0, 4.0);

      for (bvg $$3 : this.dW().a(bvg.class, $$1, b)) {
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

      for (cij $$6 : this.dW().a(cij.class, $$1)) {
         $$6.x();
      }
   }

   private void a(arc $$0, Iterable<btp> $$1, @Nullable buk $$2) {
      fav $$3 = this.cR().c(4.0, 2.0, 4.0);
      List<bvg> $$4 = $$0.a(bvg.class, $$3);
      if (!$$4.isEmpty()) {
         buk $$5 = this.E();

         for (bvg $$6 : $$4) {
            if ($$6.fL()) {
               double $$7 = this.g($$6);
               if ($$7 < 16.0) {
                  double $$8;
                  if ($$6 == $$2) {
                     $$8 = 1.0;
                  } else {
                     $$8 = 1.0 - Math.sqrt($$7) / 4.0;
                  }

                  for (btp $$10 : $$1) {
                     jr<btn> $$11 = $$10.c();
                     if ($$11.a().a()) {
                        $$11.a().a($$0, this, this.p(), $$6, $$10.e(), $$8);
                     } else {
                        int $$12 = $$10.a($$1x -> (int)($$8 * (double)$$1x + 0.5));
                        btp $$13 = new btp($$11, $$12, $$10.e(), $$10.f(), $$10.g());
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

   private void a(cyo $$0) {
      bud $$1 = new bud(this.dW(), this.dB(), this.dD(), this.dH());
      if (this.p() instanceof bvg $$2) {
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
      return this.l().a(cwt.wr);
   }

   private void a(ji $$0) {
      dwx $$1 = this.dW().a_($$0);
      if ($$1.a(awp.aN)) {
         this.dW().a($$0, false, this);
      } else if (die.c($$1)) {
         die.a(null, $$1, this.dW(), $$0);
      } else if (dkb.h($$1)) {
         this.dW().a(null, 1009, $$0, 0);
         dkb.a(this.p(), this.dW(), $$0, $$1);
         this.dW().b($$0, $$1.b(dkb.c, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(bvg $$0, bta $$1) {
      double $$2 = $$0.du().d - this.du().d;
      double $$3 = $$0.du().f - this.du().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
