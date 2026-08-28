import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class csh extends csz {
   public static final double a = 4.0;
   protected static final double b = 16.0;
   public static final Predicate<bxu> c = $$0 -> $$0.fr() || $$0.bX();

   public csh(bxc<? extends csh> $$0, djx $$1) {
      super($$0, $$1);
   }

   public csh(bxc<? extends csh> $$0, djx $$1, bxu $$2, czy $$3) {
      super($$0, $$2, $$1, $$3);
   }

   public csh(bxc<? extends csh> $$0, djx $$1, double $$2, double $$3, double $$4, czy $$5) {
      super($$0, $$2, $$3, $$4, $$1, $$5);
   }

   @Override
   protected double bc() {
      return 0.05;
   }

   @Override
   protected void a(ffm $$0) {
      super.a($$0);
      if (!this.dV().C) {
         czy $$1 = this.f();
         jb $$2 = $$0.c();
         iv $$3 = $$0.b();
         iv $$4 = $$3.a($$2);
         dbu $$5 = $$1.a(kk.R, dbu.a);
         if ($$5.a(dbv.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jb $$6 : jb.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(ffo $$0) {
      super.a($$0);
      if (this.dV() instanceof ars $$1) {
         czy $$3 = this.f();
         dbu $$4 = $$3.a(kk.R, dbu.a);
         if ($$4.a(dbv.a)) {
            this.b($$1);
         } else if ($$4.c()) {
            this.a($$1, $$3, $$0.d() == ffo.a.c ? ((ffn)$$0).a() : null);
         }

         int $$5 = $$4.e().isPresent() && $$4.e().get().a().c() ? 2007 : 2002;
         $$1.c($$5, this.dv(), $$4.b());
         this.aq();
      }
   }

   private void b(ars $$0) {
      ffl $$1 = this.cR().c(4.0, 2.0, 4.0);

      for (bxu $$3 : this.dV().a(bxu.class, $$1, c)) {
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

      for (ckz $$6 : this.dV().a(ckz.class, $$1)) {
         $$6.q();
      }
   }

   protected abstract void a(ars var1, czy var2, @Nullable bwt var3);

   private void a(iv $$0) {
      ebe $$1 = this.dV().a_($$0);
      if ($$1.a(axe.aN)) {
         this.dV().a($$0, false, this);
      } else if (dlu.c($$1)) {
         dlu.a(null, $$1, this.dV(), $$0);
      } else if (dns.h($$1)) {
         this.dV().a(null, 1009, $$0, 0);
         dns.a(this.q(), this.dV(), $$0, $$1);
         this.dV().b($$0, $$1.b(dns.b, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(bxu $$0, bvi $$1) {
      double $$2 = $$0.dt().d - this.dt().d;
      double $$3 = $$0.dt().f - this.dt().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
