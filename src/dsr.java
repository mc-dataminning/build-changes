public class dsr extends drv implements dta {
   private final dsd a = new dsd();
   private final dsi b = new dsi() {
      @Override
      protected void a(dej $$0, jf $$1, dus $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awg.ia, awh.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dej $$0, jf $$1, dus $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awg.hZ, awh.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dej $$0, jf $$1, dus $$2, int $$3, int $$4) {
         $$0.a(dsr.this.p, dho.fG, 1, $$4);
      }

      @Override
      protected boolean a(cnx $$0) {
         return $$0.gq().b(dsr.this);
      }
   };

   public dsr(jf $$0, dus $$1) {
      super(drx.d, $$0, $$1);
   }

   public static void a(dej $$0, jf $$1, dus $$2, dsr $$3) {
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

   public void a(cnx $$0) {
      if (!this.q && !$$0.Q_()) {
         this.b.a($$0, this.i(), this.aC_(), this.m());
      }
   }

   public void b(cnx $$0) {
      if (!this.q && !$$0.Q_()) {
         this.b.b($$0, this.i(), this.aC_(), this.m());
      }
   }

   public boolean c(cnx $$0) {
      return brl.a(this, $$0);
   }

   public void b() {
      if (!this.q) {
         this.b.c(this.i(), this.aC_(), this.m());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
