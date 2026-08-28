public class dti extends dsm implements dtr {
   private final dsu a = new dsu();
   private final dsz b = new dsz() {
      @Override
      protected void a(dfb $$0, jh $$1, dvj $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awl.ia, awm.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dfb $$0, jh $$1, dvj $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awl.hZ, awm.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dfb $$0, jh $$1, dvj $$2, int $$3, int $$4) {
         $$0.a(dti.this.p, dig.fG, 1, $$4);
      }

      @Override
      protected boolean a(com $$0) {
         return $$0.gx().b(dti.this);
      }
   };

   public dti(jh $$0, dvj $$1) {
      super(dso.d, $$0, $$1);
   }

   public static void a(dfb $$0, jh $$1, dvj $$2, dti $$3) {
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

   public void a(com $$0) {
      if (!this.q && !$$0.R_()) {
         this.b.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   public void b(com $$0) {
      if (!this.q && !$$0.R_()) {
         this.b.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   public boolean c(com $$0) {
      return brw.a(this, $$0);
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
