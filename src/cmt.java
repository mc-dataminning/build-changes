public class cmt extends cmv {
   public cmt(bsa<? extends cmt> $$0, dax $$1) {
      super($$0, $$1);
   }

   public cmt(dax $$0, bso $$1) {
      super(bsa.aT, $$1, $$0);
   }

   public cmt(dax $$0, double $$1, double $$2, double $$3) {
      super(bsa.aT, $$1, $$2, $$3, $$0);
   }

   @Override
   protected ctj u() {
      return ctr.qC;
   }

   private kw v() {
      cto $$0 = this.p();
      return (kw)(!$$0.e() && !$$0.a(this.u()) ? new ku(ky.S, $$0) : ky.W);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         kw $$1 = this.v();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dP().a($$1, this.du(), this.dw(), this.dA(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(euh $$0) {
      super.a($$0);
      bru $$1 = $$0.a();
      int $$2 = $$1 instanceof cil ? 3 : 0;
      $$1.a(this.dQ().b(this, this.s()), (float)$$2);
   }

   @Override
   protected void a(eui $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.dP().a(this, (byte)3);
         this.ao();
      }
   }
}
