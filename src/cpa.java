import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cpa extends cov {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<buk> c = $$0 -> $$0.fo() || $$0.bV();

   public cpa(btv<? extends cpa> $$0, deg $$1) {
      super($$0, $$1);
   }

   public cpa(deg $$0, buk $$1, cvp $$2) {
      super(btv.aE, $$1, $$0, $$2);
   }

   public cpa(deg $$0, double $$1, double $$2, double $$3, cvp $$4) {
      super(btv.aE, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cvk o() {
      return cvt.vq;
   }

   @Override
   protected double bc() {
      return 0.05;
   }

   @Override
   protected void a(eyo $$0) {
      super.a($$0);
      if (!this.dS().B) {
         cvp $$1 = this.m();
         jj $$2 = $$0.c();
         je $$3 = $$0.b();
         je $$4 = $$3.a($$2);
         cxo $$5 = $$1.a(kr.L, cxo.a);
         if ($$5.a(cxp.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jj $$6 : jj.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(eyq $$0) {
      super.a($$0);
      if (!this.dS().B) {
         cvp $$1 = this.m();
         cxo $$2 = $$1.a(kr.L, cxo.a);
         if ($$2.a(cxp.a)) {
            this.q();
         } else if ($$2.c()) {
            if (this.t()) {
               this.a($$2);
            } else {
               this.a($$2.a(), $$0.d() == eyq.a.c ? ((eyp)$$0).a() : null);
            }
         }

         int $$3 = $$2.e().isPresent() && $$2.e().get().a().b() ? 2007 : 2002;
         this.dS().c($$3, this.ds(), $$2.b());
         this.as();
      }
   }

   private void q() {
      eyn $$0 = this.cO().c(4.0, 2.0, 4.0);

      for (buk $$2 : this.dS().a(buk.class, $$0, c)) {
         double $$3 = this.g($$2);
         if ($$3 < 16.0) {
            if ($$2.fo()) {
               $$2.a(this.dT().c(this, this.s()), 1.0F);
            }

            if ($$2.bV() && $$2.bI()) {
               $$2.aL();
            }
         }
      }

      for (chm $$5 : this.dS().a(chm.class, $$0)) {
         $$5.q();
      }
   }

   private void a(Iterable<bsv> $$0, @Nullable bto $$1) {
      eyn $$2 = this.cO().c(4.0, 2.0, 4.0);
      List<buk> $$3 = this.dS().a(buk.class, $$2);
      if (!$$3.isEmpty()) {
         bto $$4 = this.F();

         for (buk $$5 : $$3) {
            if ($$5.fH()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bsv $$9 : $$0) {
                     jn<bst> $$10 = $$9.c();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.s(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bsv $$12 = new bsv($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cxo $$0) {
      btj $$1 = new btj(this.dS(), this.dx(), this.dz(), this.dD());
      if (this.s() instanceof buk $$2) {
         $$1.a($$2);
      }

      $$1.a(3.0F);
      $$1.b(-0.5F);
      $$1.c(10);
      $$1.c(-$$1.g() / (float)$$1.j());
      $$1.a($$0);
      this.dS().b($$1);
   }

   private boolean t() {
      return this.m().a(cvt.vt);
   }

   private void a(je $$0) {
      duo $$1 = this.dS().a_($$0);
      if ($$1.a(awt.aL)) {
         this.dS().a($$0, false, this);
      } else if (dgb.c($$1)) {
         dgb.a(null, $$1, this.dS(), $$0);
      } else if (dhx.h($$1)) {
         this.dS().a(null, 1009, $$0, 0);
         dhx.a(this.s(), this.dS(), $$0, $$1);
         this.dS().b($$0, $$1.b(dhx.c, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(buk $$0, bsg $$1) {
      double $$2 = $$0.dq().d - this.dq().d;
      double $$3 = $$0.dq().f - this.dq().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
