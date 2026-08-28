public class dux extends dua implements dvg {
   private final dui a = new dui();
   private final dun b = new dun() {
      @Override
      protected void a(dgj $$0, ji $$1, dwy $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awa.iu, awb.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dgj $$0, ji $$1, dwy $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awa.it, awb.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dgj $$0, ji $$1, dwy $$2, int $$3, int $$4) {
         $$0.a(dux.this.o, djp.gb, 1, $$4);
      }

      @Override
      protected boolean a(coy $$0) {
         return $$0.gw().b(dux.this);
      }
   };

   public dux(ji $$0, dwy $$1) {
      super(duc.d, $$0, $$1);
   }

   public static void a(dgj $$0, ji $$1, dwy $$2, dux $$3) {
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

   public void a(coy $$0) {
      if (!this.p && !$$0.Z_()) {
         this.b.a($$0, this.i(), this.aA_(), this.m());
      }
   }

   public void b(coy $$0) {
      if (!this.p && !$$0.Z_()) {
         this.b.b($$0, this.i(), this.aA_(), this.m());
      }
   }

   public boolean c(coy $$0) {
      return bse.a(this, $$0);
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
