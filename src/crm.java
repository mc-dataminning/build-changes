import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class crm extends cse {
   public static final double a = 4.0;
   protected static final double b = 16.0;
   public static final Predicate<bxe> c = $$0 -> $$0.fr() || $$0.bY();

   public crm(bwo<? extends crm> $$0, dja $$1) {
      super($$0, $$1);
   }

   public crm(bwo<? extends crm> $$0, dja $$1, bxe $$2, czd $$3) {
      super($$0, $$2, $$1, $$3);
   }

   public crm(bwo<? extends crm> $$0, dja $$1, double $$2, double $$3, double $$4, czd $$5) {
      super($$0, $$2, $$3, $$4, $$1, $$5);
   }

   @Override
   protected double bd() {
      return 0.05;
   }

   @Override
   protected void a(fem $$0) {
      super.a($$0);
      if (!this.dV().C) {
         czd $$1 = this.f();
         ja $$2 = $$0.c();
         iu $$3 = $$0.b();
         iu $$4 = $$3.a($$2);
         daz $$5 = $$1.a(kj.R, daz.a);
         if ($$5.a(dba.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (ja $$6 : ja.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(feo $$0) {
      super.a($$0);
      if (this.dV() instanceof arq $$1) {
         czd $$3 = this.f();
         daz $$4 = $$3.a(kj.R, daz.a);
         if ($$4.a(dba.a)) {
            this.b($$1);
         } else if ($$4.c()) {
            this.a($$1, $$3, $$0.d() == feo.a.c ? ((fen)$$0).a() : null);
         }

         int $$5 = $$4.e().isPresent() && $$4.e().get().a().c() ? 2007 : 2002;
         $$1.c($$5, this.dv(), $$4.b());
         this.at();
      }
   }

   private void b(arq $$0) {
      fel $$1 = this.cR().c(4.0, 2.0, 4.0);

      for (bxe $$3 : this.dV().a(bxe.class, $$1, c)) {
         double $$4 = this.g($$3);
         if ($$4 < 16.0) {
            if ($$3.fr()) {
               $$3.a($$0, this.dW().c(this, this.q()), 1.0F);
            }

            if ($$3.bY() && $$3.bK()) {
               $$3.aN();
            }
         }
      }

      for (ckn $$6 : this.dV().a(ckn.class, $$1)) {
         $$6.q();
      }
   }

   protected abstract void a(arq var1, czd var2, @Nullable bwf var3);

   private void a(iu $$0) {
      eah $$1 = this.dV().a_($$0);
      if ($$1.a(axc.aN)) {
         this.dV().a($$0, false, this);
      } else if (dkx.c($$1)) {
         dkx.a(null, $$1, this.dV(), $$0);
      } else if (dmv.h($$1)) {
         this.dV().a(null, 1009, $$0, 0);
         dmv.a(this.q(), this.dV(), $$0, $$1);
         this.dV().b($$0, $$1.b(dmv.b, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(bxe $$0, buu $$1) {
      double $$2 = $$0.dt().d - this.dt().d;
      double $$3 = $$0.dt().f - this.dt().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
