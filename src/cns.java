public class cns extends cnu {
   public cns(bsy<? extends cns> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public cns(dbw $$0, btn $$1) {
      super(bsy.aT, $$1, $$0);
   }

   public cns(dbw $$0, double $$1, double $$2, double $$3) {
      super(bsy.aT, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cui u() {
      return cuq.qC;
   }

   private lg v() {
      cun $$0 = this.p();
      return (lg)(!$$0.e() && !$$0.a(this.u()) ? new le(li.S, $$0) : li.W);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lg $$1 = this.v();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dP().a($$1, this.du(), this.dw(), this.dA(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(evm $$0) {
      super.a($$0);
      bss $$1 = $$0.a();
      int $$2 = $$1 instanceof cjk ? 3 : 0;
      $$1.a(this.dQ().b(this, this.s()), (float)$$2);
   }

   @Override
   protected void a(evn $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.dP().a(this, (byte)3);
         this.ao();
      }
   }
}
