import java.util.Optional;
import javax.annotation.Nullable;

public abstract class coa extends cmz implements cnh {
   public static final coa.a f = new coa.a();

   public coa(bsv<? extends coa> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public coa(bsv<? extends coa> $$0, dbt $$1, bsp $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
   }

   coa(bsv<? extends coa> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dbt $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected evh as() {
      float $$0 = this.ak().n().a() / 2.0F;
      float $$1 = this.ak().n().b();
      float $$2 = 0.15F;
      return new evh(
         this.dn().c - (double)$$0,
         this.dn().d - 0.15F,
         this.dn().e - (double)$$0,
         this.dn().c + (double)$$0,
         this.dn().d - 0.15F + (double)$$1,
         this.dn().e + (double)$$0
      );
   }

   @Override
   public boolean i(bsp $$0) {
      return $$0 instanceof coa ? false : super.i($$0);
   }

   @Override
   protected boolean b(bsp $$0) {
      if ($$0 instanceof coa) {
         return false;
      } else {
         return $$0.ak() == bsv.E ? false : super.b($$0);
      }
   }

   @Override
   protected void a(evj $$0) {
      super.a($$0);
      if (!this.dP().B) {
         btk $$2 = this.s() instanceof btk $$1 ? $$1 : null;
         bsp $$3 = $$0.a().g($$0.e()).orElse($$0.a());
         if ($$2 != null) {
            $$2.A($$3);
         }

         $$3.a(this.dQ().c(this, $$2), 1.0F);
         this.z();
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   @Override
   protected abstract void z();

   @Override
   protected void a(evi $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.z();
         this.ao();
      }
   }

   @Override
   protected void a(evk $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.ao();
      }
   }

   @Override
   protected boolean u() {
      return false;
   }

   @Override
   public cuk p() {
      return cuk.l;
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
   protected lh v() {
      return null;
   }

   @Override
   public void l() {
      if (!this.dP().B && this.dv() > this.dP().am() + 30) {
         this.z();
         this.ao();
      } else {
         super.l();
      }
   }

   public static class a extends dbm {
      @Override
      public boolean a(dbl $$0, bsp $$1) {
         return false;
      }

      @Override
      public Optional<Float> a(dbl $$0, daz $$1, iz $$2, drx $$3, enq $$4) {
         return $$3.a(awl.cy) ? Optional.of(3600000.0F) : Optional.empty();
      }
   }
}
