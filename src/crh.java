import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class crh extends crz {
   public static final double a = 4.0;
   protected static final double b = 16.0;
   public static final Predicate<bxc> c = $$0 -> $$0.fq() || $$0.bY();

   public crh(bwm<? extends crh> $$0, div $$1) {
      super($$0, $$1);
   }

   public crh(bwm<? extends crh> $$0, div $$1, bxc $$2, cyy $$3) {
      super($$0, $$2, $$1, $$3);
   }

   public crh(bwm<? extends crh> $$0, div $$1, double $$2, double $$3, double $$4, cyy $$5) {
      super($$0, $$2, $$3, $$4, $$1, $$5);
   }

   @Override
   protected double bd() {
      return 0.05;
   }

   @Override
   protected void a(fee $$0) {
      super.a($$0);
      if (!this.dV().C) {
         cyy $$1 = this.f();
         ja $$2 = $$0.c();
         iu $$3 = $$0.b();
         iu $$4 = $$3.a($$2);
         dau $$5 = $$1.a(kj.R, dau.a);
         if ($$5.a(dav.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (ja $$6 : ja.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(feg $$0) {
      super.a($$0);
      if (this.dV() instanceof arq $$1) {
         cyy $$3 = this.f();
         dau $$4 = $$3.a(kj.R, dau.a);
         if ($$4.a(dav.a)) {
            this.b($$1);
         } else if ($$4.c()) {
            this.a($$1, $$3, $$0.d() == feg.a.c ? ((fef)$$0).a() : null);
         }

         int $$5 = $$4.e().isPresent() && $$4.e().get().a().c() ? 2007 : 2002;
         $$1.c($$5, this.dv(), $$4.b());
         this.at();
      }
   }

   private void b(arq $$0) {
      fed $$1 = this.cR().c(4.0, 2.0, 4.0);

      for (bxc $$3 : this.dV().a(bxc.class, $$1, c)) {
         double $$4 = this.g($$3);
         if ($$4 < 16.0) {
            if ($$3.fq()) {
               $$3.a($$0, this.dW().c(this, this.q()), 1.0F);
            }

            if ($$3.bY() && $$3.bK()) {
               $$3.aN();
            }
         }
      }

      for (ckj $$6 : this.dV().a(ckj.class, $$1)) {
         $$6.q();
      }
   }

   protected abstract void a(arq var1, cyy var2, @Nullable bwd var3);

   private void a(iu $$0) {
      dzz $$1 = this.dV().a_($$0);
      if ($$1.a(axc.aN)) {
         this.dV().a($$0, false, this);
      } else if (dks.c($$1)) {
         dks.a(null, $$1, this.dV(), $$0);
      } else if (dmp.h($$1)) {
         this.dV().a(null, 1009, $$0, 0);
         dmp.a(this.q(), this.dV(), $$0, $$1);
         this.dV().b($$0, $$1.b(dmp.b, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(bxc $$0, bus $$1) {
      double $$2 = $$0.dt().d - this.dt().d;
      double $$3 = $$0.dt().f - this.dt().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
