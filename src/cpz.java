import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cpz extends cpu {
   public static final double a = 4.0;
   private static final double c = 16.0;
   public static final Predicate<bvh> b = $$0 -> $$0.fp() || $$0.bY();

   public cpz(bus<? extends cpz> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public cpz(dfm $$0, bvh $$1, cwm $$2) {
      super(bus.aS, $$1, $$0, $$2);
   }

   public cpz(dfm $$0, double $$1, double $$2, double $$3, cwm $$4) {
      super(bus.aS, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cwi l() {
      return cwq.vG;
   }

   @Override
   protected double bd() {
      return 0.05;
   }

   @Override
   protected void a(ezu $$0) {
      super.a($$0);
      if (!this.dV().C) {
         cwm $$1 = this.j();
         jm $$2 = $$0.c();
         jh $$3 = $$0.b();
         jh $$4 = $$3.a($$2);
         cyl $$5 = $$1.a(ku.Q, cyl.a);
         if ($$5.a(cym.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jm $$6 : jm.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(ezw $$0) {
      super.a($$0);
      if (this.dV() instanceof arp $$1) {
         cwm $$3 = this.j();
         cyl $$4 = $$3.a(ku.Q, cyl.a);
         if ($$4.a(cym.a)) {
            this.b($$1);
         } else if ($$4.c()) {
            if (this.n()) {
               this.a($$4);
            } else {
               this.a($$1, $$4.a(), $$0.d() == ezw.a.c ? ((ezv)$$0).a() : null);
            }
         }

         int $$5 = $$4.e().isPresent() && $$4.e().get().a().c() ? 2007 : 2002;
         $$1.c($$5, this.dv(), $$4.b());
         this.at();
      }
   }

   private void b(arp $$0) {
      ezt $$1 = this.cR().c(4.0, 2.0, 4.0);

      for (bvh $$3 : this.dV().a(bvh.class, $$1, b)) {
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

      for (cik $$6 : this.dV().a(cik.class, $$1)) {
         $$6.n();
      }
   }

   private void a(arp $$0, Iterable<btq> $$1, @Nullable bul $$2) {
      ezt $$3 = this.cR().c(4.0, 2.0, 4.0);
      List<bvh> $$4 = $$0.a(bvh.class, $$3);
      if (!$$4.isEmpty()) {
         bul $$5 = this.B();

         for (bvh $$6 : $$4) {
            if ($$6.fJ()) {
               double $$7 = this.g($$6);
               if ($$7 < 16.0) {
                  double $$8;
                  if ($$6 == $$2) {
                     $$8 = 1.0;
                  } else {
                     $$8 = 1.0 - Math.sqrt($$7) / 4.0;
                  }

                  for (btq $$10 : $$1) {
                     jq<bto> $$11 = $$10.c();
                     if ($$11.a().a()) {
                        $$11.a().a($$0, this, this.p(), $$6, $$10.e(), $$8);
                     } else {
                        int $$12 = $$10.a($$1x -> (int)($$8 * (double)$$1x + 0.5));
                        btq $$13 = new btq($$11, $$12, $$10.e(), $$10.f(), $$10.g());
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

   private void a(cyl $$0) {
      bue $$1 = new bue(this.dV(), this.dA(), this.dC(), this.dG());
      if (this.p() instanceof bvh $$2) {
         $$1.a($$2);
      }

      $$1.a(3.0F);
      $$1.b(-0.5F);
      $$1.c(10);
      $$1.c(-$$1.c() / (float)$$1.g());
      $$1.a($$0);
      this.dV().b($$1);
   }

   private boolean n() {
      return this.j().a(cwq.vJ);
   }

   private void a(jh $$0) {
      dvv $$1 = this.dV().a_($$0);
      if ($$1.a(axc.aM)) {
         this.dV().a($$0, false, this);
      } else if (dhi.c($$1)) {
         dhi.a(null, $$1, this.dV(), $$0);
      } else if (dje.h($$1)) {
         this.dV().a(null, 1009, $$0, 0);
         dje.a(this.p(), this.dV(), $$0, $$1);
         this.dV().b($$0, $$1.b(dje.c, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(bvh $$0, btb $$1) {
      double $$2 = $$0.dt().d - this.dt().d;
      double $$3 = $$0.dt().f - this.dt().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
