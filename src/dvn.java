public class dvn extends duq implements dvw {
   private final duy a = new duy();
   private final dvd b = new dvd() {
      @Override
      protected void a(dgz $$0, jh $$1, dxo $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awv.iu, aww.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dgz $$0, jh $$1, dxo $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awv.it, aww.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dgz $$0, jh $$1, dxo $$2, int $$3, int $$4) {
         $$0.a(dvn.this.p, dkf.gb, 1, $$4);
      }

      @Override
      protected boolean a(cpo $$0) {
         return $$0.gw().b(dvn.this);
      }
   };

   public dvn(jh $$0, dxo $$1) {
      super(dus.d, $$0, $$1);
   }

   public static void a(dgz $$0, jh $$1, dxo $$2, dvn $$3) {
      $$3.a.a();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.a.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public void a(cpo $$0) {
      if (!this.q && !$$0.aa_()) {
         this.b.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   public void b(cpo $$0) {
      if (!this.q && !$$0.aa_()) {
         this.b.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   public boolean c(cpo $$0) {
      return bst.a(this, $$0);
   }

   public void b() {
      if (!this.q) {
         this.b.c(this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
