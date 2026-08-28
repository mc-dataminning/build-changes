public class crg extends cri {
   public crg(bwb<? extends crg> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public crg(dhp $$0, bwr $$1, cxy $$2) {
      super(bwb.bj, $$1, $$0, $$2);
   }

   public crg(dhp $$0, double $$1, double $$2, double $$3, cxy $$4) {
      super(bwb.bj, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cxu g() {
      return cyc.rn;
   }

   private lt j() {
      cxy $$0 = this.f();
      return (lt)($$0.f() ? lv.Z : new lr(lv.U, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lt $$1 = this.j();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dV().a($$1, this.dA(), this.dC(), this.dG(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(fcr $$0) {
      super.a($$0);
      bvs $$1 = $$0.a();
      int $$2 = $$1 instanceof cms ? 3 : 0;
      $$1.a(this.dW().b(this, this.q()), (float)$$2);
   }

   @Override
   protected void a(fcs $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, (byte)3);
         this.at();
      }
   }
}
