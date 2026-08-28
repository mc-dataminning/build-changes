public class duw extends dtz implements dvf {
   private final duh a = new duh();
   private final dum b = new dum() {
      @Override
      protected void a(dgi $$0, ji $$1, dwx $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awa.iu, awb.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dgi $$0, ji $$1, dwx $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awa.it, awb.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dgi $$0, ji $$1, dwx $$2, int $$3, int $$4) {
         $$0.a(duw.this.p, djo.gb, 1, $$4);
      }

      @Override
      protected boolean a(cox $$0) {
         return $$0.gw().b(duw.this);
      }
   };

   public duw(ji $$0, dwx $$1) {
      super(dub.d, $$0, $$1);
   }

   public static void a(dgi $$0, ji $$1, dwx $$2, duw $$3) {
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

   public void a(cox $$0) {
      if (!this.q && !$$0.Z_()) {
         this.b.a($$0, this.i(), this.aA_(), this.m());
      }
   }

   public void b(cox $$0) {
      if (!this.q && !$$0.Z_()) {
         this.b.b($$0, this.i(), this.aA_(), this.m());
      }
   }

   public boolean c(cox $$0) {
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
