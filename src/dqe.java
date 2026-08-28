public class dqe extends dpj implements dqm {
   private final dpr a = new dpr();
   private final dpw b = new dpw() {
      @Override
      protected void a(dca $$0, iz $$1, dse $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awa.hZ, awb.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dca $$0, iz $$1, dse $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awa.hY, awb.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dca $$0, iz $$1, dse $$2, int $$3, int $$4) {
         $$0.a(dqe.this.o, dfd.fG, 1, $$4);
      }

      @Override
      protected boolean a(cmz $$0) {
         return $$0.gp().b(dqe.this);
      }
   };

   public dqe(iz $$0, dse $$1) {
      super(dpl.d, $$0, $$1);
   }

   public static void a(dca $$0, iz $$1, dse $$2, dqe $$3) {
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

   public void a(cmz $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.a($$0, this.i(), this.ay_(), this.n());
      }
   }

   public void b(cmz $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.b($$0, this.i(), this.ay_(), this.n());
      }
   }

   public boolean c(cmz $$0) {
      return bqp.a(this, $$0);
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
