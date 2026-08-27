public class cgd extends cgf {
   public cgd(bly<? extends cgd> $$0, cto $$1) {
      super($$0, $$1);
   }

   public cgd(cto $$0, bmk $$1) {
      super(bly.aQ, $$1, $$0);
   }

   public cgd(cto $$0, double $$1, double $$2, double $$3) {
      super(bly.aQ, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cms s() {
      return cna.qz;
   }

   private jv y() {
      cmx $$0 = this.u();
      return (jv)($$0.b() ? jx.T : new jt(jx.Q, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         jv $$1 = this.y();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dM().a($$1, this.dr(), this.dt(), this.dx(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(elp $$0) {
      super.a($$0);
      blu $$1 = $$0.a();
      int $$2 = $$1 instanceof cby ? 3 : 0;
      $$1.a(this.dN().b(this, this.w()), (float)$$2);
   }

   @Override
   protected void a(elq $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.dM().a(this, (byte)3);
         this.am();
      }
   }
}
