public class cnv extends cnx {
   public cnv(btb<? extends cnv> $$0, dbz $$1) {
      super($$0, $$1);
   }

   public cnv(dbz $$0, btq $$1) {
      super(btb.aT, $$1, $$0);
   }

   public cnv(dbz $$0, double $$1, double $$2, double $$3) {
      super(btb.aT, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cul u() {
      return cut.qC;
   }

   private lg v() {
      cuq $$0 = this.p();
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
   protected void a(evp $$0) {
      super.a($$0);
      bsv $$1 = $$0.a();
      int $$2 = $$1 instanceof cjn ? 3 : 0;
      $$1.a(this.dQ().b(this, this.s()), (float)$$2);
   }

   @Override
   protected void a(evq $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.dP().a(this, (byte)3);
         this.ao();
      }
   }
}
