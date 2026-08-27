public class dgd extends dfi implements dgl {
   private final dfq a = new dfq();
   private final dfv b = new dfv() {
      @Override
      protected void a(csf $$0, hx $$1, dhn $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aqv.hm, aqw.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(csf $$0, hx $$1, dhn $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aqv.hl, aqw.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(csf $$0, hx $$1, dhn $$2, int $$3, int $$4) {
         $$0.a(dgd.this.p, cvh.fG, 1, $$4);
      }

      @Override
      protected boolean a(cdz $$0) {
         return $$0.gg().b(dgd.this);
      }
   };

   public dgd(hx $$0, dhn $$1) {
      super(dfk.d, $$0, $$1);
   }

   public static void a(csf $$0, hx $$1, dhn $$2, dgd $$3) {
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

   public void a(cdz $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.a($$0, this.i(), this.aC_(), this.r());
      }
   }

   public void b(cdz $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.b($$0, this.i(), this.aC_(), this.r());
      }
   }

   public boolean c(cdz $$0) {
      return biu.a(this, $$0);
   }

   public void c() {
      if (!this.q) {
         this.b.c(this.i(), this.aC_(), this.r());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
