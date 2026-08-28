public class dvp extends dus implements dvy {
   private final dva a = new dva();
   private final dvf b = new dvf() {
      @Override
      protected void a(dgz $$0, ji $$1, dxq $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awa.iu, awb.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dgz $$0, ji $$1, dxq $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awa.it, awb.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dgz $$0, ji $$1, dxq $$2, int $$3, int $$4) {
         $$0.a(dvp.this.o, dkg.gb, 1, $$4);
      }

      @Override
      protected boolean a(cpr $$0) {
         return $$0.gz().b(dvp.this);
      }
   };

   public dvp(ji $$0, dxq $$1) {
      super(duu.d, $$0, $$1);
   }

   public static void a(dgz $$0, ji $$1, dxq $$2, dvp $$3) {
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

   public void a(cpr $$0) {
      if (!this.p && !$$0.U_()) {
         this.b.a($$0, this.i(), this.aA_(), this.m());
      }
   }

   public void b(cpr $$0) {
      if (!this.p && !$$0.U_()) {
         this.b.b($$0, this.i(), this.aA_(), this.m());
      }
   }

   public boolean c(cpr $$0) {
      return bsr.a(this, $$0);
   }

   public void b() {
      if (!this.p) {
         this.b.c(this.i(), this.aA_(), this.m());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
