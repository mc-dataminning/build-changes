public class crr extends crt {
   public crr(bwj<? extends crr> $$0, dip $$1) {
      super($$0, $$1);
   }

   public crr(dip $$0, bwz $$1, cys $$2) {
      super(bwj.bk, $$1, $$0, $$2);
   }

   public crr(dip $$0, double $$1, double $$2, double $$3, cys $$4) {
      super(bwj.bk, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cyo f() {
      return cyw.rn;
   }

   private lv g() {
      cys $$0 = this.ae_();
      return (lv)($$0.f() ? lx.Z : new lt(lx.U, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lv $$1 = this.g();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dV().a($$1, this.dA(), this.dC(), this.dG(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(fdt $$0) {
      super.a($$0);
      bwa $$1 = $$0.a();
      int $$2 = $$1 instanceof cnc ? 3 : 0;
      $$1.a(this.dW().b(this, this.q()), (float)$$2);
   }

   @Override
   protected void a(fdu $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, (byte)3);
         this.at();
      }
   }
}
