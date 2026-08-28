public class csz extends ctb {
   public csz(bxe<? extends csz> $$0, djz $$1) {
      super($$0, $$1);
   }

   public csz(djz $$0, bxw $$1, daa $$2) {
      super(bxe.bl, $$1, $$0, $$2);
   }

   public csz(djz $$0, double $$1, double $$2, double $$3, daa $$4) {
      super(bxe.bl, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected czw g() {
      return dae.rs;
   }

   private lx j() {
      daa $$0 = this.f();
      return (lx)($$0.f() ? lz.Z : new lv(lz.U, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lx $$1 = this.j();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dV().a($$1, this.dA(), this.dC(), this.dG(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ffp $$0) {
      super.a($$0);
      bwv $$1 = $$0.a();
      int $$2 = $$1 instanceof coj ? 3 : 0;
      $$1.a(this.dW().b(this, this.q()), (float)$$2);
   }

   @Override
   protected void a(ffq $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, (byte)3);
         this.aq();
      }
   }
}
