public class cti extends ctk {
   public cti(bxn<? extends cti> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public cti(dkj $$0, byf $$1, dak $$2) {
      super(bxn.bl, $$1, $$0, $$2);
   }

   public cti(dkj $$0, double $$1, double $$2, double $$3, dak $$4) {
      super(bxn.bl, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected dag f() {
      return dao.rs;
   }

   private lx i() {
      dak $$0 = this.e();
      return (lx)($$0.f() ? lz.Z : new lv(lz.U, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lx $$1 = this.i();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dV().a($$1, this.dA(), this.dC(), this.dG(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ffz $$0) {
      super.a($$0);
      bxe $$1 = $$0.a();
      int $$2 = $$1 instanceof cot ? 3 : 0;
      $$1.a(this.dW().b(this, this.p()), (float)$$2);
   }

   @Override
   protected void a(fga $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, (byte)3);
         this.aq();
      }
   }
}
