public class cne extends cng {
   public cne(bsj<? extends cne> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public cne(dcd $$0, bsy $$1) {
      super(bsj.aT, $$1, $$0);
   }

   public cne(dcd $$0, double $$1, double $$2, double $$3) {
      super(bsj.aT, $$1, $$2, $$3, $$0);
   }

   @Override
   protected ctv u() {
      return cud.qC;
   }

   private lh v() {
      cua $$0 = this.p();
      return (lh)(!$$0.e() && !$$0.a(this.u()) ? new lf(lj.S, $$0) : lj.W);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lh $$1 = this.v();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dP().a($$1, this.du(), this.dw(), this.dA(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(evw $$0) {
      super.a($$0);
      bsd $$1 = $$0.a();
      int $$2 = $$1 instanceof ciw ? 3 : 0;
      $$1.a(this.dQ().b(this, this.s()), (float)$$2);
   }

   @Override
   protected void a(evx $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.dP().a(this, (byte)3);
         this.ao();
      }
   }
}
