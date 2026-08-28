import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class crb extends crt {
   public static final double a = 4.0;
   protected static final double b = 16.0;
   public static final Predicate<bwz> c = $$0 -> $$0.fq() || $$0.bY();

   public crb(bwj<? extends crb> $$0, dip $$1) {
      super($$0, $$1);
   }

   public crb(bwj<? extends crb> $$0, dip $$1, bwz $$2, cys $$3) {
      super($$0, $$2, $$1, $$3);
   }

   public crb(bwj<? extends crb> $$0, dip $$1, double $$2, double $$3, double $$4, cys $$5) {
      super($$0, $$2, $$3, $$4, $$1, $$5);
   }

   @Override
   protected cyo f() {
      return cyw.ws;
   }

   @Override
   protected double bd() {
      return 0.05;
   }

   @Override
   protected void a(fds $$0) {
      super.a($$0);
      if (!this.dV().C) {
         cys $$1 = this.ae_();
         ja $$2 = $$0.c();
         iu $$3 = $$0.b();
         iu $$4 = $$3.a($$2);
         dao $$5 = $$1.a(kj.R, dao.a);
         if ($$5.a(dap.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (ja $$6 : ja.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(fdu $$0) {
      super.a($$0);
      if (this.dV() instanceof aro $$1) {
         cys $$3 = this.ae_();
         dao $$4 = $$3.a(kj.R, dao.a);
         if ($$4.a(dap.a)) {
            this.b($$1);
         } else if ($$4.c()) {
            this.a($$1, $$3, $$0.d() == fdu.a.c ? ((fdt)$$0).a() : null);
         }

         int $$5 = $$4.e().isPresent() && $$4.e().get().a().c() ? 2007 : 2002;
         $$1.c($$5, this.dv(), $$4.b());
         this.at();
      }
   }

   private void b(aro $$0) {
      fdr $$1 = this.cR().c(4.0, 2.0, 4.0);

      for (bwz $$3 : this.dV().a(bwz.class, $$1, c)) {
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

      for (ckd $$6 : this.dV().a(ckd.class, $$1)) {
         $$6.q();
      }
   }

   protected abstract void a(aro var1, cys var2, @Nullable bwa var3);

   private void a(iu $$0) {
      dzo $$1 = this.dV().a_($$0);
      if ($$1.a(axa.aN)) {
         this.dV().a($$0, false, this);
      } else if (dkm.c($$1)) {
         dkm.a(null, $$1, this.dV(), $$0);
      } else if (dmj.h($$1)) {
         this.dV().a(null, 1009, $$0, 0);
         dmj.a(this.q(), this.dV(), $$0, $$1);
         this.dV().b($$0, $$1.b(dmj.b, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(bwz $$0, bup $$1) {
      double $$2 = $$0.dt().d - this.dt().d;
      double $$3 = $$0.dt().f - this.dt().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
