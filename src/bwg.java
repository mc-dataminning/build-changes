public abstract class bwg extends bwa {
   protected static final float bE = 0.0F;

   protected bwg(bvi<? extends bwg> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public float c(ji $$0) {
      return this.a($$0, this.dU());
   }

   public float a(ji $$0, dhc $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dha $$0, bvh $$1) {
      return this.a(this.du(), $$0) >= 0.0F;
   }

   public boolean go() {
      return !this.O().k();
   }

   public boolean gp() {
      if (this.bs.a(cfc.Z)) {
         return this.bs.c(cfc.Z).isPresent();
      } else {
         for (cek $$0 : this.bC.b()) {
            if ($$0.h() && $$0.k() instanceof cdp) {
               return true;
            }
         }

         return false;
      }
   }

   protected boolean gq() {
      return true;
   }

   @Override
   public void a(bva $$0) {
      super.a($$0);
      if (this.gq() && !this.gp()) {
         this.bC.b(ccw.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         fbx $$3 = new fbx($$0.dz() - this.dz(), $$0.dB() - this.dB(), $$0.dF() - this.dF()).d().c((double)Math.max($$2 - 2.0F, 0.0F));
         this.O().a(this.dz() + $$3.d, this.dB() + $$3.e, this.dF() + $$3.f, this.gr());
      }
   }

   @Override
   public boolean a(bva $$0, float $$1) {
      this.a($$0.du(), 5);
      return true;
   }

   protected double gr() {
      return 1.0;
   }
}
