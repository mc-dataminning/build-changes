public abstract class csf extends crx {
   private static final float a = 12.25F;

   protected csf(bwo<? extends csf> $$0, dja $$1) {
      super($$0, $$1);
   }

   protected csf(bwo<? extends csf> $$0, double $$1, double $$2, double $$3, dja $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   @Override
   public boolean a(double $$0) {
      if (this.af < 2 && $$0 < 12.25) {
         return false;
      } else {
         double $$1 = this.cR().a() * 4.0;
         if (Double.isNaN($$1)) {
            $$1 = 4.0;
         }

         $$1 *= 64.0;
         return $$0 < $$1 * $$1;
      }
   }

   @Override
   public boolean n(boolean $$0) {
      return true;
   }

   @Override
   public void h() {
      this.j();
      this.bf();
      this.g();
      feo $$0 = crz.a(this, this::b);
      feq $$1;
      if ($$0.d() != feo.a.a) {
         $$1 = $$0.g();
      } else {
         $$1 = this.dt().e(this.dy());
      }

      this.b($$1);
      this.A();
      this.aK();
      super.h();
      if ($$0.d() != feo.a.a && this.bK()) {
         this.b($$0);
      }
   }

   private void g() {
      feq $$0 = this.dy();
      feq $$1 = this.dt();
      float $$4;
      if (this.bj()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.dV().a(lx.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = 0.8F;
      } else {
         $$4 = 0.99F;
      }

      this.i($$0.c((double)$$4));
   }

   private void j() {
      if (this.ak) {
         for (iu $$0 : iu.a(this.cR())) {
            eah $$1 = this.dV().a_($$0);
            if ($$1.a(dmh.nJ)) {
               $$1.a(this.dV(), $$0, this);
            }
         }
      }
   }

   @Override
   protected double bd() {
      return 0.03;
   }
}
