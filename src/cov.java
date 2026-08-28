import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cov extends coq {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<buf> c = $$0 -> $$0.fo() || $$0.bV();

   public cov(btq<? extends cov> $$0, dds $$1) {
      super($$0, $$1);
   }

   public cov(dds $$0, buf $$1, cvl $$2) {
      super(btq.aE, $$1, $$0, $$2);
   }

   public cov(dds $$0, double $$1, double $$2, double $$3, cvl $$4) {
      super(btq.aE, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cvg o() {
      return cvo.vq;
   }

   @Override
   protected double bc() {
      return 0.05;
   }

   @Override
   protected void a(eya $$0) {
      super.a($$0);
      if (!this.dS().B) {
         cvl $$1 = this.m();
         jj $$2 = $$0.b();
         je $$3 = $$0.a();
         je $$4 = $$3.a($$2);
         cxn $$5 = $$1.a(kr.I, cxn.a);
         if ($$5.a(cxo.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jj $$6 : jj.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(eyc $$0) {
      super.a($$0);
      if (!this.dS().B) {
         cvl $$1 = this.m();
         cxn $$2 = $$1.a(kr.I, cxn.a);
         if ($$2.a(cxo.a)) {
            this.q();
         } else if ($$2.c()) {
            if (this.t()) {
               this.a($$2);
            } else {
               this.a($$2.a(), $$0.c() == eyc.a.c ? ((eyb)$$0).a() : null);
            }
         }

         int $$3 = $$2.e().isPresent() && $$2.e().get().a().b() ? 2007 : 2002;
         this.dS().c($$3, this.ds(), $$2.b());
         this.as();
      }
   }

   private void q() {
      exz $$0 = this.cO().c(4.0, 2.0, 4.0);

      for (buf $$2 : this.dS().a(buf.class, $$0, c)) {
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

      for (chh $$5 : this.dS().a(chh.class, $$0)) {
         $$5.q();
      }
   }

   private void a(Iterable<bsq> $$0, @Nullable btj $$1) {
      exz $$2 = this.cO().c(4.0, 2.0, 4.0);
      List<buf> $$3 = this.dS().a(buf.class, $$2);
      if (!$$3.isEmpty()) {
         btj $$4 = this.E();

         for (buf $$5 : $$3) {
            if ($$5.fG()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bsq $$9 : $$0) {
                     jn<bso> $$10 = $$9.c();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.s(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bsq $$12 = new bsq($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cxn $$0) {
      bte $$1 = new bte(this.dS(), this.dx(), this.dz(), this.dD());
      if (this.s() instanceof buf $$2) {
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
      return this.m().a(cvo.vt);
   }

   private void a(je $$0) {
      dua $$1 = this.dS().a_($$0);
      if ($$1.a(aws.aL)) {
         this.dS().a($$0, false, this);
      } else if (dfn.c($$1)) {
         dfn.a(null, $$1, this.dS(), $$0);
      } else if (dhj.h($$1)) {
         this.dS().a(null, 1009, $$0, 0);
         dhj.a(this.s(), this.dS(), $$0, $$1);
         this.dS().b($$0, $$1.b(dhj.c, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(buf $$0, bsb $$1) {
      double $$2 = $$0.dq().d - this.dq().d;
      double $$3 = $$0.dq().f - this.dq().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
