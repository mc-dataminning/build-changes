public class cfn extends cfp {
   public cfn(blj<? extends cfn> $$0, csy $$1) {
      super($$0, $$1);
   }

   public cfn(csy $$0, blv $$1) {
      super(blj.aQ, $$1, $$0);
   }

   public cfn(csy $$0, double $$1, double $$2, double $$3) {
      super(blj.aQ, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cmc s() {
      return cmk.qz;
   }

   private jt y() {
      cmh $$0 = this.u();
      return (jt)($$0.b() ? jv.T : new jr(jv.Q, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         jt $$1 = this.y();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dM().a($$1, this.dr(), this.dt(), this.dx(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(eky $$0) {
      super.a($$0);
      blf $$1 = $$0.a();
      int $$2 = $$1 instanceof cbj ? 3 : 0;
      $$1.a(this.dN().b(this, this.w()), (float)$$2);
   }

   @Override
   protected void a(ekz $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.dM().a(this, (byte)3);
         this.am();
      }
   }
}
