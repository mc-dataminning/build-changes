public abstract class coz extends cor {
   private static final float b = 12.25F;

   protected coz(bty<? extends coz> $$0, dej $$1) {
      super($$0, $$1);
   }

   protected coz(bty<? extends coz> $$0, double $$1, double $$2, double $$3, dej $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   @Override
   public boolean a(double $$0) {
      if (this.ag < 2 && $$0 < 12.25) {
         return false;
      } else {
         double $$1 = this.cO().a() * 4.0;
         if (Double.isNaN($$1)) {
            $$1 = 4.0;
         }

         $$1 *= 64.0;
         return $$0 < $$1 * $$1;
      }
   }

   @Override
   public boolean o(boolean $$0) {
      return true;
   }

   @Override
   public void l() {
      super.l();
      eyu $$0 = cot.a(this, this::b);
      if ($$0.d() != eyu.a.a) {
         this.b($$0);
      }

      eyw $$1 = this.dv();
      double $$2 = this.dx() + $$1.d;
      double $$3 = this.dz() + $$1.e;
      double $$4 = this.dD() + $$1.f;
      this.G();
      float $$7;
      if (this.bi()) {
         for (int $$5 = 0; $$5 < 4; $$5++) {
            float $$6 = 0.25F;
            this.dS().a(lo.d, $$2 - $$1.d * 0.25, $$3 - $$1.e * 0.25, $$4 - $$1.f * 0.25, $$1.d, $$1.e, $$1.f);
         }

         $$7 = 0.8F;
      } else {
         $$7 = 0.99F;
      }

      this.h($$1.c((double)$$7));
      this.be();
      this.a_($$2, $$3, $$4);
      this.aW();
   }

   @Override
   protected double bc() {
      return 0.03;
   }
}
