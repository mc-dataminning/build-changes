public class dza extends dyc implements dzj {
   private final dyl a = new dyl();
   private final dyq b = new dyq() {
      @Override
      protected void a(djx $$0, iv $$1, ebe $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awp.ix, awq.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(djx $$0, iv $$1, ebe $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awp.iw, awq.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(djx $$0, iv $$1, ebe $$2, int $$3, int $$4) {
         $$0.a(dza.this.o, dne.gf, 1, $$4);
      }

      @Override
      protected boolean a(crx $$0) {
         return $$0.gx().b(dza.this);
      }
   };

   public dza(iv $$0, ebe $$1) {
      super(dye.d, $$0, $$1);
   }

   public static void a(djx $$0, iv $$1, ebe $$2, dza $$3) {
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

   public void a(crx $$0) {
      if (!this.p && !$$0.Z_()) {
         this.b.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   public void b(crx $$0) {
      if (!this.p && !$$0.Z_()) {
         this.b.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   public boolean c(crx $$0) {
      return buk.a(this, $$0);
   }

   public void a() {
      if (!this.p) {
         this.b.c(this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
