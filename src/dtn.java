public class dtn extends dsr implements dtw {
   private final dsz a = new dsz();
   private final dte b = new dte() {
      @Override
      protected void a(dff $$0, jh $$1, dvo $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awo.ia, awp.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dff $$0, jh $$1, dvo $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awo.hZ, awp.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dff $$0, jh $$1, dvo $$2, int $$3, int $$4) {
         $$0.a(dtn.this.p, dil.fG, 1, $$4);
      }

      @Override
      protected boolean a(cor $$0) {
         return $$0.gz().b(dtn.this);
      }
   };

   public dtn(jh $$0, dvo $$1) {
      super(dst.d, $$0, $$1);
   }

   public static void a(dff $$0, jh $$1, dvo $$2, dtn $$3) {
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

   public void a(cor $$0) {
      if (!this.q && !$$0.R_()) {
         this.b.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   public void b(cor $$0) {
      if (!this.q && !$$0.R_()) {
         this.b.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   public boolean c(cor $$0) {
      return bsa.a(this, $$0);
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
