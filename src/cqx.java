import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cqx extends cqs {
   public static final double a = 4.0;
   private static final double c = 16.0;
   public static final Predicate<bwb> b = $$0 -> $$0.fp() || $$0.bY();

   public cqx(bvm<? extends cqx> $$0, dha $$1) {
      super($$0, $$1);
   }

   public cqx(dha $$0, bwb $$1, cxk $$2) {
      super(bvm.aW, $$1, $$0, $$2);
   }

   public cqx(dha $$0, double $$1, double $$2, double $$3, cxk $$4) {
      super(bvm.aW, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cxg m() {
      return cxo.we;
   }

   @Override
   protected double bd() {
      return 0.05;
   }

   @Override
   protected void a(fbo $$0) {
      super.a($$0);
      if (!this.dV().C) {
         cxk $$1 = this.l();
         jm $$2 = $$0.c();
         jh $$3 = $$0.b();
         jh $$4 = $$3.a($$2);
         czj $$5 = $$1.a(ku.Q, czj.a);
         if ($$5.a(czk.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jm $$6 : jm.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(fbq $$0) {
      super.a($$0);
      if (this.dV() instanceof ash $$1) {
         cxk $$3 = this.l();
         czj $$4 = $$3.a(ku.Q, czj.a);
         if ($$4.a(czk.a)) {
            this.b($$1);
         } else if ($$4.c()) {
            if (this.s()) {
               this.a($$4);
            } else {
               this.a($$1, $$4.a(), $$0.d() == fbq.a.c ? ((fbp)$$0).a() : null);
            }
         }

         int $$5 = $$4.e().isPresent() && $$4.e().get().a().c() ? 2007 : 2002;
         $$1.c($$5, this.dv(), $$4.b());
         this.at();
      }
   }

   private void b(ash $$0) {
      fbn $$1 = this.cR().c(4.0, 2.0, 4.0);

      for (bwb $$3 : this.dV().a(bwb.class, $$1, b)) {
         double $$4 = this.g($$3);
         if ($$4 < 16.0) {
            if ($$3.fp()) {
               $$3.a($$0, this.dW().c(this, this.p()), 1.0F);
            }

            if ($$3.bY() && $$3.bL()) {
               $$3.aN();
            }
         }
      }

      for (cje $$6 : this.dV().a(cje.class, $$1)) {
         $$6.x();
      }
   }

   private void a(ash $$0, Iterable<buk> $$1, @Nullable bvf $$2) {
      fbn $$3 = this.cR().c(4.0, 2.0, 4.0);
      List<bwb> $$4 = $$0.a(bwb.class, $$3);
      if (!$$4.isEmpty()) {
         bvf $$5 = this.D();

         for (bwb $$6 : $$4) {
            if ($$6.fJ()) {
               double $$7 = this.g($$6);
               if ($$7 < 16.0) {
                  double $$8;
                  if ($$6 == $$2) {
                     $$8 = 1.0;
                  } else {
                     $$8 = 1.0 - Math.sqrt($$7) / 4.0;
                  }

                  for (buk $$10 : $$1) {
                     jq<bui> $$11 = $$10.c();
                     if ($$11.a().a()) {
                        $$11.a().a($$0, this, this.p(), $$6, $$10.e(), $$8);
                     } else {
                        int $$12 = $$10.a($$1x -> (int)($$8 * (double)$$1x + 0.5));
                        buk $$13 = new buk($$11, $$12, $$10.e(), $$10.f(), $$10.g());
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

   private void a(czj $$0) {
      buy $$1 = new buy(this.dV(), this.dA(), this.dC(), this.dG());
      if (this.p() instanceof bwb $$2) {
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
      return this.l().a(cxo.wh);
   }

   private void a(jh $$0) {
      dxn $$1 = this.dV().a_($$0);
      if ($$1.a(axu.aN)) {
         this.dV().a($$0, false, this);
      } else if (diw.c($$1)) {
         diw.a(null, $$1, this.dV(), $$0);
      } else if (dkt.h($$1)) {
         this.dV().a(null, 1009, $$0, 0);
         dkt.a(this.p(), this.dV(), $$0, $$1);
         this.dV().b($$0, $$1.b(dkt.c, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(bwb $$0, btv $$1) {
      double $$2 = $$0.dt().d - this.dt().d;
      double $$3 = $$0.dt().f - this.dt().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
