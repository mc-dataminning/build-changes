import javax.annotation.Nullable;

public class cgg extends cfi implements cfq {
   public cgg(blt<? extends cgg> $$0, cti $$1) {
      super($$0, $$1);
   }

   public cgg(blt<? extends cgg> $$0, cdf $$1, cti $$2) {
      super($$0, $$1.dr(), $$1.gf(), $$1.dx(), $$2);
      this.b($$1);
   }

   @Override
   protected elh aq() {
      float $$0 = this.ai().n().a / 2.0F;
      float $$1 = this.ai().n().b;
      float $$2 = 0.15F;
      return new elh(
         this.dk().c - (double)$$0,
         this.dk().d - 0.15F,
         this.dk().e - (double)$$0,
         this.dk().c + (double)$$0,
         this.dk().d - 0.15F + (double)$$1,
         this.dk().e + (double)$$0
      );
   }

   @Override
   protected float a(bmr $$0, blq $$1) {
      return 0.0F;
   }

   @Override
   public boolean h(blp $$0) {
      return $$0 instanceof cgg ? false : super.h($$0);
   }

   @Override
   protected boolean a(blp $$0) {
      return $$0 instanceof cgg ? false : super.a($$0);
   }

   @Override
   protected void a(elj $$0) {
      super.a($$0);
      if (!this.dM().B) {
         $$0.a().a(this.dN().a(this, this.w() instanceof bmf $$1 ? $$1 : null), 1.0F);
         this.y();
      }
   }

   private void y() {
      this.dM().a(this, null, null, this.dr(), this.dt(), this.dx(), (float)(3.0 + this.ag.j()), false, cti.a.e, jx.y, jx.z, arm.Be);
   }

   @Override
   protected void a(eli $$0) {
      super.a($$0);
      this.y();
      this.am();
   }

   @Override
   protected void a(elk $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.am();
      }
   }

   @Override
   protected boolean s() {
      return false;
   }

   @Override
   public cmr q() {
      return cmr.f;
   }

   @Override
   protected float x() {
      return 1.0F;
   }

   @Nullable
   @Override
   protected jv u() {
      return null;
   }

   @Override
   protected csr.a ag_() {
      return csr.a.b;
   }
}
