public class csj extends csl {
   public csj(bwr<? extends csj> $$0, djh $$1) {
      super($$0, $$1);
   }

   public csj(djh $$0, bxj $$1, czk $$2) {
      super(bwr.bk, $$1, $$0, $$2);
   }

   public csj(djh $$0, double $$1, double $$2, double $$3, czk $$4) {
      super(bwr.bk, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected czg g() {
      return czo.rs;
   }

   private lw j() {
      czk $$0 = this.f();
      return (lw)($$0.f() ? ly.Z : new lu(ly.U, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lw $$1 = this.j();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dU().a($$1, this.dz(), this.dB(), this.dF(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(feu $$0) {
      super.a($$0);
      bwi $$1 = $$0.a();
      int $$2 = $$1 instanceof cnt ? 3 : 0;
      $$1.a(this.dV().b(this, this.q()), (float)$$2);
   }

   @Override
   protected void a(fev $$0) {
      super.a($$0);
      if (!this.dU().C) {
         this.dU().a(this, (byte)3);
         this.aq();
      }
   }
}
