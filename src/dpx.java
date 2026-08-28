public class dpx extends dpc implements dqf {
   private final dpk a = new dpk();
   private final dpp b = new dpp() {
      @Override
      protected void a(dbt $$0, iz $$1, drx $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avw.hZ, avx.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dbt $$0, iz $$1, drx $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avw.hY, avx.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dbt $$0, iz $$1, drx $$2, int $$3, int $$4) {
         $$0.a(dpx.this.o, dew.fG, 1, $$4);
      }

      @Override
      protected boolean a(cms $$0) {
         return $$0.gp().b(dpx.this);
      }
   };

   public dpx(iz $$0, drx $$1) {
      super(dpe.d, $$0, $$1);
   }

   public static void a(dbt $$0, iz $$1, drx $$2, dpx $$3) {
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

   public void a(cms $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.a($$0, this.i(), this.aA_(), this.n());
      }
   }

   public void b(cms $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.b($$0, this.i(), this.aA_(), this.n());
      }
   }

   public boolean c(cms $$0) {
      return bqi.a(this, $$0);
   }

   public void b() {
      if (!this.p) {
         this.b.c(this.i(), this.aA_(), this.n());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
