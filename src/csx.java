public class csx extends csz {
   public csx(bxc<? extends csx> $$0, djx $$1) {
      super($$0, $$1);
   }

   public csx(djx $$0, bxu $$1, czy $$2) {
      super(bxc.bl, $$1, $$0, $$2);
   }

   public csx(djx $$0, double $$1, double $$2, double $$3, czy $$4) {
      super(bxc.bl, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected czu g() {
      return dac.rs;
   }

   private lw j() {
      czy $$0 = this.f();
      return (lw)($$0.f() ? ly.Z : new lu(ly.U, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lw $$1 = this.j();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dV().a($$1, this.dA(), this.dC(), this.dG(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ffn $$0) {
      super.a($$0);
      bwt $$1 = $$0.a();
      int $$2 = $$1 instanceof coh ? 3 : 0;
      $$1.a(this.dW().b(this, this.q()), (float)$$2);
   }

   @Override
   protected void a(ffo $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, (byte)3);
         this.aq();
      }
   }
}
