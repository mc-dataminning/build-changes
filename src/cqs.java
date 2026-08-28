public abstract class cqs extends cqk {
   private static final float a = 12.25F;

   protected cqs(bvi<? extends cqs> $$0, dgz $$1) {
      super($$0, $$1);
   }

   protected cqs(bvi<? extends cqs> $$0, double $$1, double $$2, double $$3, dgz $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   @Override
   public boolean a(double $$0) {
      if (this.af < 2 && $$0 < 12.25) {
         return false;
      } else {
         double $$1 = this.cQ().a() * 4.0;
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
      fbv $$0 = cqm.a(this, this::b);
      fbx $$1;
      if ($$0.d() != fbv.a.a) {
         $$1 = $$0.g();
      } else {
         $$1 = this.ds().e(this.dx());
      }

      this.b($$1);
      this.A();
      this.aK();
      super.h();
      if ($$0.d() != fbv.a.a && this.bJ()) {
         this.b($$0);
      }
   }

   private void g() {
      fbx $$0 = this.dx();
      fbx $$1 = this.ds();
      float $$4;
      if (this.bj()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.dU().a(lt.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = 0.8F;
      } else {
         $$4 = 0.99F;
      }

      this.i($$0.c((double)$$4));
   }

   private void j() {
      if (this.ak) {
         for (ji $$0 : ji.a(this.cQ())) {
            dxq $$1 = this.dU().a_($$0);
            if ($$1.a(dkg.nF)) {
               $$1.a(this.dU(), $$0, this);
            }
         }
      }
   }

   @Override
   protected double bd() {
      return 0.03;
   }
}
