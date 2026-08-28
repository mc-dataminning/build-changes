public class dsa extends dre implements dsj {
   private final drm a = new drm();
   private final drr b = new drr() {
      @Override
      protected void a(dds $$0, je $$1, dua $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awd.ia, awe.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dds $$0, je $$1, dua $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awd.hZ, awe.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dds $$0, je $$1, dua $$2, int $$3, int $$4) {
         $$0.a(dsa.this.p, dgx.fG, 1, $$4);
      }

      @Override
      protected boolean a(cnp $$0) {
         return $$0.gp().b(dsa.this);
      }
   };

   public dsa(je $$0, dua $$1) {
      super(drg.d, $$0, $$1);
   }

   public static void a(dds $$0, je $$1, dua $$2, dsa $$3) {
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

   public void a(cnp $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.a($$0, this.i(), this.aD_(), this.m());
      }
   }

   public void b(cnp $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.b($$0, this.i(), this.aD_(), this.m());
      }
   }

   public boolean c(cnp $$0) {
      return brd.a(this, $$0);
   }

   public void b() {
      if (!this.q) {
         this.b.c(this.i(), this.aD_(), this.m());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
