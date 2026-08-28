public abstract class bun extends buh {
   protected static final float bY = 0.0F;

   protected bun(btq<? extends bun> $$0, dds $$1) {
      super($$0, $$1);
   }

   public float c(je $$0) {
      return this.a($$0, this.dS());
   }

   public float a(je $$0, ddv $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(ddt $$0, btp $$1) {
      return this.a(this.ds(), $$0) >= 0.0F;
   }

   public boolean gk() {
      return !this.P().m();
   }

   public boolean gl() {
      if (this.bC.a(cdi.Z)) {
         return this.bC.c(cdi.Z).isPresent();
      } else {
         for (ccq $$0 : this.bT.b()) {
            if ($$0.h() && $$0.k() instanceof cbv) {
               return true;
            }
         }

         return false;
      }
   }

   protected boolean gm() {
      return true;
   }

   @Override
   public void b(btj $$0) {
      super.b($$0);
      if (this.gm() && !this.gl()) {
         this.bT.b(cbc.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         eye $$3 = new eye($$0.dx() - this.dx(), $$0.dz() - this.dz(), $$0.dD() - this.dD()).d().c((double)Math.max($$2 - 2.0F, 0.0F));
         this.P().a(this.dx() + $$3.d, this.dz() + $$3.e, this.dD() + $$3.f, this.gn());
      }
   }

   @Override
   public boolean a(btj $$0, float $$1) {
      this.a($$0.ds(), 5);
      return true;
   }

   protected double gn() {
      return 1.0;
   }
}
