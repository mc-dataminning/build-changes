public class ckq extends cks {
   public ckq(bqb<? extends ckq> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public ckq(cyx $$0, bqo $$1) {
      super(bqb.aS, $$1, $$0);
   }

   public ckq(cyx $$0, double $$1, double $$2, double $$3) {
      super(bqb.aS, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cre r() {
      return crm.qB;
   }

   private kj v() {
      crj $$0 = this.p();
      return (kj)(!$$0.d() && !$$0.a(this.r()) ? new kh(kl.R, $$0) : kl.U);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         kj $$1 = this.v();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dM().a($$1, this.dr(), this.dt(), this.dx(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(erx $$0) {
      super.a($$0);
      bpv $$1 = $$0.a();
      int $$2 = $$1 instanceof cgi ? 3 : 0;
      $$1.a(this.dN().b(this, this.u()), (float)$$2);
   }

   @Override
   protected void a(ery $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.dM().a(this, (byte)3);
         this.am();
      }
   }
}
