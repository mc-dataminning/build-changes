public class dso extends drs implements dsx {
   private final dsa a = new dsa();
   private final dsf b = new dsf() {
      @Override
      protected void a(deg $$0, je $$1, duo $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awe.ia, awf.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(deg $$0, je $$1, duo $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awe.hZ, awf.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(deg $$0, je $$1, duo $$2, int $$3, int $$4) {
         $$0.a(dso.this.p, dhl.fG, 1, $$4);
      }

      @Override
      protected boolean a(cnu $$0) {
         return $$0.gp().b(dso.this);
      }
   };

   public dso(je $$0, duo $$1) {
      super(dru.d, $$0, $$1);
   }

   public static void a(deg $$0, je $$1, duo $$2, dso $$3) {
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

   public void a(cnu $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   public void b(cnu $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   public boolean c(cnu $$0) {
      return bri.a(this, $$0);
   }

   public void b() {
      if (!this.q) {
         this.b.c(this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
