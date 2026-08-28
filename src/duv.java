public class duv extends dty implements dve {
   private final dug a = new dug();
   private final dul b = new dul() {
      @Override
      protected void a(dgh $$0, ji $$1, dww $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awa.iu, awb.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dgh $$0, ji $$1, dww $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awa.it, awb.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dgh $$0, ji $$1, dww $$2, int $$3, int $$4) {
         $$0.a(duv.this.p, djn.gb, 1, $$4);
      }

      @Override
      protected boolean a(cow $$0) {
         return $$0.gw().b(duv.this);
      }
   };

   public duv(ji $$0, dww $$1) {
      super(dua.d, $$0, $$1);
   }

   public static void a(dgh $$0, ji $$1, dww $$2, duv $$3) {
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

   public void a(cow $$0) {
      if (!this.q && !$$0.Z_()) {
         this.b.a($$0, this.i(), this.aA_(), this.m());
      }
   }

   public void b(cow $$0) {
      if (!this.q && !$$0.Z_()) {
         this.b.b($$0, this.i(), this.aA_(), this.m());
      }
   }

   public boolean c(cow $$0) {
      return bsc.a(this, $$0);
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
