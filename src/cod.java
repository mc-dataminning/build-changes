import java.util.Optional;
import javax.annotation.Nullable;

public abstract class cod extends cnc implements cnk {
   public static final cod.a f = new cod.a();

   public cod(bsy<? extends cod> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public cod(bsy<? extends cod> $$0, dbw $$1, bss $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
   }

   cod(bsy<? extends cod> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dbw $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected evk as() {
      float $$0 = this.ak().n().a() / 2.0F;
      float $$1 = this.ak().n().b();
      float $$2 = 0.15F;
      return new evk(
         this.dn().c - (double)$$0,
         this.dn().d - 0.15F,
         this.dn().e - (double)$$0,
         this.dn().c + (double)$$0,
         this.dn().d - 0.15F + (double)$$1,
         this.dn().e + (double)$$0
      );
   }

   @Override
   public boolean i(bss $$0) {
      return $$0 instanceof cod ? false : super.i($$0);
   }

   @Override
   protected boolean b(bss $$0) {
      if ($$0 instanceof cod) {
         return false;
      } else {
         return $$0.ak() == bsy.E ? false : super.b($$0);
      }
   }

   @Override
   protected void a(evm $$0) {
      super.a($$0);
      if (!this.dP().B) {
         btn $$2 = this.s() instanceof btn $$1 ? $$1 : null;
         bss $$3 = $$0.a().g($$0.e()).orElse($$0.a());
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
   protected void a(evl $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.z();
         this.ao();
      }
   }

   @Override
   protected void a(evn $$0) {
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
   public cun p() {
      return cun.l;
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
   protected lg v() {
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

   public static class a extends dbp {
      @Override
      public boolean a(dbo $$0, bss $$1) {
         return false;
      }

      @Override
      public Optional<Float> a(dbo $$0, dbc $$1, iz $$2, dsa $$3, ent $$4) {
         return $$3.a(awo.cy) ? Optional.of(3600000.0F) : Optional.empty();
      }
   }
}
