public class dqc extends dph implements dqk {
   private final dpp a = new dpp();
   private final dpu b = new dpu() {
      @Override
      protected void a(dby $$0, iz $$1, dsc $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awa.hZ, awb.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dby $$0, iz $$1, dsc $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awa.hY, awb.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dby $$0, iz $$1, dsc $$2, int $$3, int $$4) {
         $$0.a(dqc.this.o, dfb.fG, 1, $$4);
      }

      @Override
      protected boolean a(cmx $$0) {
         return $$0.gp().b(dqc.this);
      }
   };

   public dqc(iz $$0, dsc $$1) {
      super(dpj.d, $$0, $$1);
   }

   public static void a(dby $$0, iz $$1, dsc $$2, dqc $$3) {
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

   public void a(cmx $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.a($$0, this.i(), this.ay_(), this.n());
      }
   }

   public void b(cmx $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.b($$0, this.i(), this.ay_(), this.n());
      }
   }

   public boolean c(cmx $$0) {
      return bqn.a(this, $$0);
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
