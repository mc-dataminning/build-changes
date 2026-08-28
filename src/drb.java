public class drb extends dqf implements drj {
   private final dqn a = new dqn();
   private final dqs b = new dqs() {
      @Override
      protected void a(dcu $$0, jd $$1, dta $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avo.hZ, avp.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dcu $$0, jd $$1, dta $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avo.hY, avp.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dcu $$0, jd $$1, dta $$2, int $$3, int $$4) {
         $$0.a(drb.this.o, dfy.fG, 1, $$4);
      }

      @Override
      protected boolean a(cmv $$0) {
         return $$0.gm().b(drb.this);
      }
   };

   public drb(jd $$0, dta $$1) {
      super(dqh.d, $$0, $$1);
   }

   public static void a(dcu $$0, jd $$1, dta $$2, drb $$3) {
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

   public void a(cmv $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.a($$0, this.i(), this.az_(), this.n());
      }
   }

   public void b(cmv $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.b($$0, this.i(), this.az_(), this.n());
      }
   }

   public boolean c(cmv $$0) {
      return bqj.a(this, $$0);
   }

   public void b() {
      if (!this.p) {
         this.b.c(this.i(), this.az_(), this.n());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
