public class duu extends dtx implements dvd {
   private final duf a = new duf();
   private final duk b = new duk() {
      @Override
      protected void a(dgg $$0, ji $$1, dwv $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avz.iu, awa.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dgg $$0, ji $$1, dwv $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avz.it, awa.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dgg $$0, ji $$1, dwv $$2, int $$3, int $$4) {
         $$0.a(duu.this.p, djm.gb, 1, $$4);
      }

      @Override
      protected boolean a(cov $$0) {
         return $$0.gw().b(duu.this);
      }
   };

   public duu(ji $$0, dwv $$1) {
      super(dtz.d, $$0, $$1);
   }

   public static void a(dgg $$0, ji $$1, dwv $$2, duu $$3) {
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

   public void a(cov $$0) {
      if (!this.q && !$$0.Z_()) {
         this.b.a($$0, this.i(), this.aA_(), this.m());
      }
   }

   public void b(cov $$0) {
      if (!this.q && !$$0.Z_()) {
         this.b.b($$0, this.i(), this.aA_(), this.m());
      }
   }

   public boolean c(cov $$0) {
      return bsb.a(this, $$0);
   }

   public void b() {
      if (!this.q) {
         this.b.c(this.i(), this.aA_(), this.m());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
