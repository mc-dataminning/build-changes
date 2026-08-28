import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class csj extends ctb {
   public static final double a = 4.0;
   protected static final double b = 16.0;
   public static final Predicate<bxw> c = $$0 -> $$0.fr() || $$0.bX();

   public csj(bxe<? extends csj> $$0, djz $$1) {
      super($$0, $$1);
   }

   public csj(bxe<? extends csj> $$0, djz $$1, bxw $$2, daa $$3) {
      super($$0, $$2, $$1, $$3);
   }

   public csj(bxe<? extends csj> $$0, djz $$1, double $$2, double $$3, double $$4, daa $$5) {
      super($$0, $$2, $$3, $$4, $$1, $$5);
   }

   @Override
   protected double bc() {
      return 0.05;
   }

   @Override
   protected void a(ffo $$0) {
      super.a($$0);
      if (!this.dV().C) {
         daa $$1 = this.f();
         jc $$2 = $$0.c();
         iw $$3 = $$0.b();
         iw $$4 = $$3.a($$2);
         dbw $$5 = $$1.a(kl.R, dbw.a);
         if ($$5.a(dbx.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jc $$6 : jc.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(ffq $$0) {
      super.a($$0);
      if (this.dV() instanceof aru $$1) {
         daa $$3 = this.f();
         dbw $$4 = $$3.a(kl.R, dbw.a);
         if ($$4.a(dbx.a)) {
            this.b($$1);
         } else if ($$4.c()) {
            this.a($$1, $$3, $$0.d() == ffq.a.c ? ((ffp)$$0).a() : null);
         }

         int $$5 = $$4.e().isPresent() && $$4.e().get().a().c() ? 2007 : 2002;
         $$1.c($$5, this.dv(), $$4.b());
         this.aq();
      }
   }

   private void b(aru $$0) {
      ffn $$1 = this.cR().c(4.0, 2.0, 4.0);

      for (bxw $$3 : this.dV().a(bxw.class, $$1, c)) {
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

      for (clb $$6 : this.dV().a(clb.class, $$1)) {
         $$6.q();
      }
   }

   protected abstract void a(aru var1, daa var2, @Nullable bwv var3);

   private void a(iw $$0) {
      ebg $$1 = this.dV().a_($$0);
      if ($$1.a(axg.aN)) {
         this.dV().a($$0, false, this);
      } else if (dlw.c($$1)) {
         dlw.a(null, $$1, this.dV(), $$0);
      } else if (dnu.h($$1)) {
         this.dV().a(null, 1009, $$0, 0);
         dnu.a(this.q(), this.dV(), $$0, $$1);
         this.dV().b($$0, $$1.b(dnu.b, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(bxw $$0, bvk $$1) {
      double $$2 = $$0.dt().d - this.dt().d;
      double $$3 = $$0.dt().f - this.dt().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
