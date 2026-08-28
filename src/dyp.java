public class dyp extends dxr implements dyy {
   private final dya a = new dya();
   private final dyf b = new dyf() {
      @Override
      protected void a(djm $$0, iv $$1, eat $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awn.ix, awo.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(djm $$0, iv $$1, eat $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awn.iw, awo.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(djm $$0, iv $$1, eat $$2, int $$3, int $$4) {
         $$0.a(dyp.this.o, dmt.gf, 1, $$4);
      }

      @Override
      protected boolean a(crm $$0) {
         return $$0.gw().b(dyp.this);
      }
   };

   public dyp(iv $$0, eat $$1) {
      super(dxt.d, $$0, $$1);
   }

   public static void a(djm $$0, iv $$1, eat $$2, dyp $$3) {
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

   public void a(crm $$0) {
      if (!this.p && !$$0.V_()) {
         this.b.a($$0, this.i(), this.ax_(), this.m());
      }
   }

   public void b(crm $$0) {
      if (!this.p && !$$0.V_()) {
         this.b.b($$0, this.i(), this.ax_(), this.m());
      }
   }

   public boolean c(crm $$0) {
      return btz.a(this, $$0);
   }

   public void a() {
      if (!this.p) {
         this.b.c(this.i(), this.ax_(), this.m());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
