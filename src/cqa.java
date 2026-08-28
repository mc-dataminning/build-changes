import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cqa extends cpv {
   public static final double a = 4.0;
   private static final double c = 16.0;
   public static final Predicate<bvf> b = $$0 -> $$0.fr() || $$0.bY();

   public cqa(buq<? extends cqa> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public cqa(dgg $$0, bvf $$1, cwn $$2) {
      super(buq.aV, $$1, $$0, $$2);
   }

   public cqa(dgg $$0, double $$1, double $$2, double $$3, cwn $$4) {
      super(buq.aV, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cwj m() {
      return cwr.wo;
   }

   @Override
   protected double bd() {
      return 0.05;
   }

   @Override
   protected void a(fau $$0) {
      super.a($$0);
      if (!this.dW().C) {
         cwn $$1 = this.l();
         jn $$2 = $$0.c();
         ji $$3 = $$0.b();
         ji $$4 = $$3.a($$2);
         cym $$5 = $$1.a(kv.Q, cym.a);
         if ($$5.a(cyn.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jn $$6 : jn.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(faw $$0) {
      super.a($$0);
      if (this.dW() instanceof arc $$1) {
         cwn $$3 = this.l();
         cym $$4 = $$3.a(kv.Q, cym.a);
         if ($$4.a(cyn.a)) {
            this.b($$1);
         } else if ($$4.c()) {
            if (this.s()) {
               this.a($$4);
            } else {
               this.a($$1, $$4.a(), $$0.d() == faw.a.c ? ((fav)$$0).a() : null);
            }
         }

         int $$5 = $$4.e().isPresent() && $$4.e().get().a().c() ? 2007 : 2002;
         $$1.c($$5, this.dw(), $$4.b());
         this.at();
      }
   }

   private void b(arc $$0) {
      fat $$1 = this.cR().c(4.0, 2.0, 4.0);

      for (bvf $$3 : this.dW().a(bvf.class, $$1, b)) {
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

      for (cii $$6 : this.dW().a(cii.class, $$1)) {
         $$6.x();
      }
   }

   private void a(arc $$0, Iterable<bto> $$1, @Nullable buj $$2) {
      fat $$3 = this.cR().c(4.0, 2.0, 4.0);
      List<bvf> $$4 = $$0.a(bvf.class, $$3);
      if (!$$4.isEmpty()) {
         buj $$5 = this.E();

         for (bvf $$6 : $$4) {
            if ($$6.fL()) {
               double $$7 = this.g($$6);
               if ($$7 < 16.0) {
                  double $$8;
                  if ($$6 == $$2) {
                     $$8 = 1.0;
                  } else {
                     $$8 = 1.0 - Math.sqrt($$7) / 4.0;
                  }

                  for (bto $$10 : $$1) {
                     jr<btm> $$11 = $$10.c();
                     if ($$11.a().a()) {
                        $$11.a().a($$0, this, this.p(), $$6, $$10.e(), $$8);
                     } else {
                        int $$12 = $$10.a($$1x -> (int)($$8 * (double)$$1x + 0.5));
                        bto $$13 = new bto($$11, $$12, $$10.e(), $$10.f(), $$10.g());
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

   private void a(cym $$0) {
      buc $$1 = new buc(this.dW(), this.dB(), this.dD(), this.dH());
      if (this.p() instanceof bvf $$2) {
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
      return this.l().a(cwr.wr);
   }

   private void a(ji $$0) {
      dwv $$1 = this.dW().a_($$0);
      if ($$1.a(awo.aN)) {
         this.dW().a($$0, false, this);
      } else if (dic.c($$1)) {
         dic.a(null, $$1, this.dW(), $$0);
      } else if (djz.h($$1)) {
         this.dW().a(null, 1009, $$0, 0);
         djz.a(this.p(), this.dW(), $$0, $$1);
         this.dW().b($$0, $$1.b(djz.c, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(bvf $$0, bsz $$1) {
      double $$2 = $$0.du().d - this.du().d;
      double $$3 = $$0.du().f - this.du().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
