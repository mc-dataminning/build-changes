import java.util.Optional;
import javax.annotation.Nullable;

public abstract class cnj extends cmf implements cmo {
   public cnj(bsb<? extends cnj> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cnj(bsb<? extends cnj> $$0, dca $$1, brv $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
   }

   cnj(bsb<? extends cnj> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dca $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewp as() {
      float $$0 = this.ak().n().a() / 2.0F;
      float $$1 = this.ak().n().b();
      float $$2 = 0.15F;
      return new ewp(
         this.ds().c - (double)$$0,
         this.ds().d - 0.15F,
         this.ds().e - (double)$$0,
         this.ds().c + (double)$$0,
         this.ds().d - 0.15F + (double)$$1,
         this.ds().e + (double)$$0
      );
   }

   @Override
   public boolean i(brv $$0) {
      return $$0 instanceof cnj ? false : super.i($$0);
   }

   @Override
   protected boolean b(brv $$0) {
      return $$0 instanceof cnj ? false : super.b($$0);
   }

   @Override
   protected void a(ewr $$0) {
      super.a($$0);
      if (!this.dU().C) {
         bso $$2 = this.t() instanceof bso $$1 ? $$1 : null;
         if ($$2 != null) {
            $$2.A($$0.a());
         }

         $$0.a().a(this.dX().c(this, $$2), 1.0F);
         this.y();
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   @Override
   protected abstract void y();

   @Override
   protected void a(ewq $$0) {
      super.a($$0);
      if (!this.dU().C) {
         this.y();
         this.ao();
      }
   }

   @Override
   protected void a(ews $$0) {
      super.a($$0);
      if (!this.dU().C && !this.f) {
         this.ao();
      }

      this.f = false;
   }

   @Override
   protected boolean r() {
      return false;
   }

   @Override
   public cuh p() {
      return cuh.i;
   }

   @Override
   protected float w() {
      return 1.0F;
   }

   @Override
   protected float x() {
      return this.w();
   }

   @Nullable
   @Override
   protected kz u() {
      return null;
   }

   @Override
   public void l() {
      if (!this.dU().C && this.dA() > this.dU().am() + 30) {
         this.y();
         this.ao();
      } else {
         super.l();
      }
   }

   public static class a extends dbt {
      @Override
      public boolean a(dbs $$0, brv $$1) {
         return false;
      }

      @Override
      public Optional<Float> a(dbs $$0, dbg $$1, ir $$2, dtc $$3, epe $$4) {
         return $$3.a(awe.cB) ? Optional.of(3600000.0F) : Optional.empty();
      }
   }
}
