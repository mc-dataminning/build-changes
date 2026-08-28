import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class css extends ctk {
   public static final double a = 4.0;
   protected static final double b = 16.0;
   public static final Predicate<byf> c = $$0 -> $$0.fr() || $$0.bX();

   public css(bxn<? extends css> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public css(bxn<? extends css> $$0, dkj $$1, byf $$2, dak $$3) {
      super($$0, $$2, $$1, $$3);
   }

   public css(bxn<? extends css> $$0, dkj $$1, double $$2, double $$3, double $$4, dak $$5) {
      super($$0, $$2, $$3, $$4, $$1, $$5);
   }

   @Override
   protected double bc() {
      return 0.05;
   }

   @Override
   protected void a(ffy $$0) {
      super.a($$0);
      if (!this.dV().C) {
         dak $$1 = this.f();
         jc $$2 = $$0.c();
         iw $$3 = $$0.b();
         iw $$4 = $$3.a($$2);
         dcg $$5 = $$1.a(kl.R, dcg.a);
         if ($$5.a(dch.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jc $$6 : jc.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(fga $$0) {
      super.a($$0);
      if (this.dV() instanceof asb $$1) {
         dak $$3 = this.f();
         dcg $$4 = $$3.a(kl.R, dcg.a);
         if ($$4.a(dch.a)) {
            this.b($$1);
         } else if ($$4.c()) {
            this.a($$1, $$3, $$0.d() == fga.a.c ? ((ffz)$$0).a() : null);
         }

         int $$5 = $$4.e().isPresent() && $$4.e().get().a().c() ? 2007 : 2002;
         $$1.c($$5, this.dv(), $$4.b());
         this.aq();
      }
   }

   private void b(asb $$0) {
      ffx $$1 = this.cR().c(4.0, 2.0, 4.0);

      for (byf $$3 : this.dV().a(byf.class, $$1, c)) {
         double $$4 = this.g($$3);
         if ($$4 < 16.0) {
            if ($$3.fr()) {
               $$3.a($$0, this.dW().c(this, this.q()), 1.0F);
            }

            if ($$3.bX() && $$3.bJ()) {
               $$3.aM();
            }
         }
      }

      for (clk $$6 : this.dV().a(clk.class, $$1)) {
         $$6.q();
      }
   }

   protected abstract void a(asb var1, dak var2, @Nullable bxe var3);

   private void a(iw $$0) {
      ebq $$1 = this.dV().a_($$0);
      if ($$1.a(axn.aN)) {
         this.dV().a($$0, false, this);
      } else if (dmg.c($$1)) {
         dmg.a(null, $$1, this.dV(), $$0);
      } else if (doe.h($$1)) {
         this.dV().a(null, 1009, $$0, 0);
         doe.a(this.q(), this.dV(), $$0, $$1);
         this.dV().b($$0, $$1.b(doe.b, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(byf $$0, bvt $$1) {
      double $$2 = $$0.dt().d - this.dt().d;
      double $$3 = $$0.dt().f - this.dt().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
