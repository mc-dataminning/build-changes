import java.util.Optional;
import javax.annotation.Nullable;

public abstract class cng extends cmf implements cmn {
   public static final cng.a f = new cng.a();

   public cng(bsc<? extends cng> $$0, daz $$1) {
      super($$0, $$1);
   }

   public cng(bsc<? extends cng> $$0, daz $$1, brw $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
   }

   cng(bsc<? extends cng> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, daz $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected euh as() {
      float $$0 = this.ak().n().a() / 2.0F;
      float $$1 = this.ak().n().b();
      float $$2 = 0.15F;
      return new euh(
         this.dn().c - (double)$$0,
         this.dn().d - 0.15F,
         this.dn().e - (double)$$0,
         this.dn().c + (double)$$0,
         this.dn().d - 0.15F + (double)$$1,
         this.dn().e + (double)$$0
      );
   }

   @Override
   public boolean i(brw $$0) {
      return $$0 instanceof cng ? false : super.i($$0);
   }

   @Override
   protected boolean b(brw $$0) {
      if ($$0 instanceof cng) {
         return false;
      } else {
         return $$0.ak() == bsc.E ? false : super.b($$0);
      }
   }

   @Override
   protected void a(euj $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bsq $$2 = this.s() instanceof bsq $$1 ? $$1 : null;
         if ($$2 != null) {
            $$2.A($$0.a());
         }

         $$0.a().a(this.dQ().c(this, $$2), 1.0F);
         this.z();
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   @Override
   protected abstract void z();

   @Override
   protected void a(eui $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.z();
         this.ao();
      }
   }

   @Override
   protected void a(euk $$0) {
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
   public ctq p() {
      return ctq.i;
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
   protected kw v() {
      return null;
   }

   @Override
   public void l() {
      if (!this.dP().B && this.dv() > this.dP().al() + 30) {
         this.z();
         this.ao();
      } else {
         super.l();
      }
   }

   public static class a extends das {
      @Override
      public boolean a(dar $$0, brw $$1) {
         return false;
      }

      @Override
      public Optional<Float> a(dar $$0, daf $$1, io $$2, drd $$3, emw $$4) {
         return $$3.a(avx.cy) ? Optional.of(3600000.0F) : Optional.empty();
      }
   }
}
