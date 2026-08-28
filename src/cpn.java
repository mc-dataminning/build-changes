import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cpn extends cpi {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<buv> c = $$0 -> $$0.ft() || $$0.bZ();

   public cpn(bug<? extends cpn> $$0, dev $$1) {
      super($$0, $$1);
   }

   public cpn(dev $$0, buv $$1, cvx $$2) {
      super(bug.aE, $$1, $$0, $$2);
   }

   public cpn(dev $$0, double $$1, double $$2, double $$3, cvx $$4) {
      super(bug.aE, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cvt o() {
      return cwb.vq;
   }

   @Override
   protected double be() {
      return 0.05;
   }

   @Override
   protected void a(ezd $$0) {
      super.a($$0);
      if (!this.dX().C) {
         cvx $$1 = this.m();
         jl $$2 = $$0.c();
         jg $$3 = $$0.b();
         jg $$4 = $$3.a($$2);
         cxw $$5 = $$1.a(kt.P, cxw.a);
         if ($$5.a(cxx.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jl $$6 : jl.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(ezf $$0) {
      super.a($$0);
      if (!this.dX().C) {
         cvx $$1 = this.m();
         cxw $$2 = $$1.a(kt.P, cxw.a);
         if ($$2.a(cxx.a)) {
            this.q();
         } else if ($$2.c()) {
            if (this.t()) {
               this.a($$2);
            } else {
               this.a($$2.a(), $$0.d() == ezf.a.c ? ((eze)$$0).a() : null);
            }
         }

         int $$3 = $$2.e().isPresent() && $$2.e().get().a().c() ? 2007 : 2002;
         this.dX().c($$3, this.dx(), $$2.b());
         this.au();
      }
   }

   private void q() {
      ezc $$0 = this.cS().c(4.0, 2.0, 4.0);

      for (buv $$2 : this.dX().a(buv.class, $$0, c)) {
         double $$3 = this.g($$2);
         if ($$3 < 16.0) {
            if ($$2.ft()) {
               $$2.a(this.dY().c(this, this.s()), 1.0F);
            }

            if ($$2.bZ() && $$2.bM()) {
               $$2.aN();
            }
         }
      }

      for (chy $$5 : this.dX().a(chy.class, $$0)) {
         $$5.q();
      }
   }

   private void a(Iterable<bte> $$0, @Nullable btz $$1) {
      ezc $$2 = this.cS().c(4.0, 2.0, 4.0);
      List<buv> $$3 = this.dX().a(buv.class, $$2);
      if (!$$3.isEmpty()) {
         btz $$4 = this.F();

         for (buv $$5 : $$3) {
            if ($$5.fN()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bte $$9 : $$0) {
                     jp<btc> $$10 = $$9.c();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.s(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bte $$12 = new bte($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cxw $$0) {
      bts $$1 = new bts(this.dX(), this.dC(), this.dE(), this.dI());
      if (this.s() instanceof buv $$2) {
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
      return this.m().a(cwb.vt);
   }

   private void a(jg $$0) {
      dvd $$1 = this.dX().a_($$0);
      if ($$1.a(awz.aL)) {
         this.dX().a($$0, false, this);
      } else if (dgq.c($$1)) {
         dgq.a(null, $$1, this.dX(), $$0);
      } else if (dim.h($$1)) {
         this.dX().a(null, 1009, $$0, 0);
         dim.a(this.s(), this.dX(), $$0, $$1);
         this.dX().b($$0, $$1.b(dim.c, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(buv $$0, bsp $$1) {
      double $$2 = $$0.dv().d - this.dv().d;
      double $$3 = $$0.dv().f - this.dv().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
