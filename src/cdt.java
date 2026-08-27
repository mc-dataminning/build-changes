public class cdt extends cdv {
   public cdt(bjx<? extends cdt> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public cdt(cqz $$0, bkj $$1) {
      super(bjx.aP, $$1, $$0);
   }

   public cdt(cqz $$0, double $$1, double $$2, double $$3) {
      super(bjx.aP, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cke s() {
      return ckm.pO;
   }

   private jq x() {
      ckj $$0 = this.t();
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
   protected void a(eic $$0) {
      super.a($$0);
      bjt $$1 = $$0.a();
      int $$2 = $$1 instanceof bzv ? 3 : 0;
      $$1.a(this.dM().b(this, this.v()), (float)$$2);
   }

   @Override
   protected void a(eid $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.dL().a(this, (byte)3);
         this.ak();
      }
   }
}
