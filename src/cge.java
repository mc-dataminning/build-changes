public class cge extends cgg {
   public cge(blz<? extends cge> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public cge(ctp $$0, bml $$1) {
      super(blz.aQ, $$1, $$0);
   }

   public cge(ctp $$0, double $$1, double $$2, double $$3) {
      super(blz.aQ, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cmt s() {
      return cnb.qz;
   }

   private jv y() {
      cmy $$0 = this.u();
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
   protected void a(elq $$0) {
      super.a($$0);
      blv $$1 = $$0.a();
      int $$2 = $$1 instanceof cbz ? 3 : 0;
      $$1.a(this.dN().b(this, this.w()), (float)$$2);
   }

   @Override
   protected void a(elr $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.dM().a(this, (byte)3);
         this.am();
      }
   }
}
