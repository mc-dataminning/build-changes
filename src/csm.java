public class csm extends cso {
   public csm(bwr<? extends csm> $$0, djm $$1) {
      super($$0, $$1);
   }

   public csm(djm $$0, bxj $$1, czn $$2) {
      super(bwr.bk, $$1, $$0, $$2);
   }

   public csm(djm $$0, double $$1, double $$2, double $$3, czn $$4) {
      super(bwr.bk, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected czj g() {
      return czr.rs;
   }

   private lw j() {
      czn $$0 = this.f();
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
   protected void a(fez $$0) {
      super.a($$0);
      bwi $$1 = $$0.a();
      int $$2 = $$1 instanceof cnw ? 3 : 0;
      $$1.a(this.dV().b(this, this.q()), (float)$$2);
   }

   @Override
   protected void a(ffa $$0) {
      super.a($$0);
      if (!this.dU().C) {
         this.dU().a(this, (byte)3);
         this.aq();
      }
   }
}
