import java.util.Optional;
import javax.annotation.Nullable;

public abstract class coe extends cnd implements cnl {
   public static final coe.a g = new coe.a();

   public coe(bsz<? extends coe> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public coe(bsz<? extends coe> $$0, dbx $$1, bst $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
   }

   coe(bsz<? extends coe> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dbx $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected evl as() {
      float $$0 = this.ak().n().a() / 2.0F;
      float $$1 = this.ak().n().b();
      float $$2 = 0.15F;
      return new evl(
         this.dn().c - (double)$$0,
         this.dn().d - 0.15F,
         this.dn().e - (double)$$0,
         this.dn().c + (double)$$0,
         this.dn().d - 0.15F + (double)$$1,
         this.dn().e + (double)$$0
      );
   }

   @Override
   public boolean i(bst $$0) {
      return $$0 instanceof coe ? false : super.i($$0);
   }

   @Override
   protected boolean b(bst $$0) {
      if ($$0 instanceof coe) {
         return false;
      } else {
         return $$0.ak() == bsz.E ? false : super.b($$0);
      }
   }

   @Override
   protected void a(evn $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bto $$2 = this.s() instanceof bto $$1 ? $$1 : null;
         bst $$3 = $$0.a().g($$0.e()).orElse($$0.a());
         if ($$2 != null) {
            $$2.A($$3);
         }

         $$3.a(this.dQ().c(this, $$2), 1.0F);
         this.y();
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void y();

   @Override
   protected void a(evm $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.y();
         this.ao();
      }
   }

   @Override
   protected void a(evo $$0) {
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
   public cuo p() {
      return cuo.l;
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
         this.y();
         this.ao();
      } else {
         super.l();
      }
   }

   public static class a extends dbq {
      @Override
      public boolean a(dbp $$0, bst $$1) {
         return false;
      }

      @Override
      public Optional<Float> a(dbp $$0, dbd $$1, iz $$2, dsb $$3, enu $$4) {
         return $$3.a(awo.cy) ? Optional.of(3600000.0F) : Optional.empty();
      }
   }
}
