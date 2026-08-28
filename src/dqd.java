public class dqd extends dpi implements dql {
   private final dpq a = new dpq();
   private final dpv b = new dpv() {
      @Override
      protected void a(dbz $$0, iz $$1, dsd $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awa.hZ, awb.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dbz $$0, iz $$1, dsd $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awa.hY, awb.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dbz $$0, iz $$1, dsd $$2, int $$3, int $$4) {
         $$0.a(dqd.this.o, dfc.fG, 1, $$4);
      }

      @Override
      protected boolean a(cmy $$0) {
         return $$0.gp().b(dqd.this);
      }
   };

   public dqd(iz $$0, dsd $$1) {
      super(dpk.d, $$0, $$1);
   }

   public static void a(dbz $$0, iz $$1, dsd $$2, dqd $$3) {
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

   public void a(cmy $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.a($$0, this.i(), this.ay_(), this.n());
      }
   }

   public void b(cmy $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.b($$0, this.i(), this.ay_(), this.n());
      }
   }

   public boolean c(cmy $$0) {
      return bqo.a(this, $$0);
   }

   public void b() {
      if (!this.p) {
         this.b.c(this.i(), this.ay_(), this.n());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
