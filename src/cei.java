public class cei extends cek {
   public cei(bkm<? extends cei> $$0, crs $$1) {
      super($$0, $$1);
   }

   public cei(crs $$0, bky $$1) {
      super(bkm.aP, $$1, $$0);
   }

   public cei(crs $$0, double $$1, double $$2, double $$3) {
      super(bkm.aP, $$1, $$2, $$3, $$0);
   }

   @Override
   protected ckw s() {
      return cle.pO;
   }

   private jq x() {
      clb $$0 = this.t();
      return (jq)($$0.b() ? js.R : new jo(js.O, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         jq $$1 = this.x();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dL().a($$1, this.dq(), this.ds(), this.dw(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ejf $$0) {
      super.a($$0);
      bki $$1 = $$0.a();
      int $$2 = $$1 instanceof cak ? 3 : 0;
      $$1.a(this.dM().b(this, this.v()), (float)$$2);
   }

   @Override
   protected void a(ejg $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.dL().a(this, (byte)3);
         this.ak();
      }
   }
}
