public class dvt extends duw implements dwc {
   private final dve a = new dve();
   private final dvj b = new dvj() {
      @Override
      protected void a(dhh $$0, jh $$1, dxu $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, axf.it, axg.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dhh $$0, jh $$1, dxu $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, axf.is, axg.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dhh $$0, jh $$1, dxu $$2, int $$3, int $$4) {
         $$0.a(dvt.this.p, dkn.fU, 1, $$4);
      }

      @Override
      protected boolean a(cpw $$0) {
         return $$0.gw().b(dvt.this);
      }
   };

   public dvt(jh $$0, dxu $$1) {
      super(duy.d, $$0, $$1);
   }

   public static void a(dhh $$0, jh $$1, dxu $$2, dvt $$3) {
      $$3.a.a();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.a.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public void a(cpw $$0) {
      if (!this.q && !$$0.aa_()) {
         this.b.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   public void b(cpw $$0) {
      if (!this.q && !$$0.aa_()) {
         this.b.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   public boolean c(cpw $$0) {
      return btb.a(this, $$0);
   }

   public void b() {
      if (!this.q) {
         this.b.c(this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
