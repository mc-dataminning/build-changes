public class csc extends cse {
   public csc(bwo<? extends csc> $$0, dja $$1) {
      super($$0, $$1);
   }

   public csc(dja $$0, bxe $$1, czd $$2) {
      super(bwo.bk, $$1, $$0, $$2);
   }

   public csc(dja $$0, double $$1, double $$2, double $$3, czd $$4) {
      super(bwo.bk, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cyz g() {
      return czh.rs;
   }

   private lv j() {
      czd $$0 = this.f();
      return (lv)($$0.f() ? lx.Z : new lt(lx.U, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lv $$1 = this.j();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dV().a($$1, this.dA(), this.dC(), this.dG(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(fen $$0) {
      super.a($$0);
      bwf $$1 = $$0.a();
      int $$2 = $$1 instanceof cnm ? 3 : 0;
      $$1.a(this.dW().b(this, this.q()), (float)$$2);
   }

   @Override
   protected void a(feo $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, (byte)3);
         this.at();
      }
   }
}
