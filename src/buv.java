public abstract class buv extends bup {
   protected static final float bX = 0.0F;

   protected buv(bty<? extends buv> $$0, dej $$1) {
      super($$0, $$1);
   }

   public float c(jf $$0) {
      return this.a($$0, this.dS());
   }

   public float a(jf $$0, dem $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dek $$0, btx $$1) {
      return this.a(this.ds(), $$0) >= 0.0F;
   }

   public boolean gk() {
      return !this.P().m();
   }

   public boolean gl() {
      if (this.bB.a(cdq.Z)) {
         return this.bB.c(cdq.Z).isPresent();
      } else {
         for (ccy $$0 : this.bS.b()) {
            if ($$0.h() && $$0.k() instanceof ccd) {
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
   public void b(btr $$0) {
      super.b($$0);
      if (this.gm() && !this.gl()) {
         this.bS.b(cbk.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         eyw $$3 = new eyw($$0.dx() - this.dx(), $$0.dz() - this.dz(), $$0.dD() - this.dD()).d().c((double)Math.max($$2 - 2.0F, 0.0F));
         this.P().a(this.dx() + $$3.d, this.dz() + $$3.e, this.dD() + $$3.f, this.gn());
      }
   }

   @Override
   public boolean a(btr $$0, float $$1) {
      this.a($$0.ds(), 5);
      return true;
   }

   protected double gn() {
      return 1.0;
   }
}
