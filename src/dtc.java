public class dtc extends dsg implements dtl {
   private final dso a = new dso();
   private final dst b = new dst() {
      @Override
      protected void a(dev $$0, jg $$1, dvd $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awk.ia, awl.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dev $$0, jg $$1, dvd $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awk.hZ, awl.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dev $$0, jg $$1, dvd $$2, int $$3, int $$4) {
         $$0.a(dtc.this.p, dia.fG, 1, $$4);
      }

      @Override
      protected boolean a(coh $$0) {
         return $$0.gx().b(dtc.this);
      }
   };

   public dtc(jg $$0, dvd $$1) {
      super(dsi.d, $$0, $$1);
   }

   public static void a(dev $$0, jg $$1, dvd $$2, dtc $$3) {
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

   public void a(coh $$0) {
      if (!this.q && !$$0.R_()) {
         this.b.a($$0, this.i(), this.aC_(), this.m());
      }
   }

   public void b(coh $$0) {
      if (!this.q && !$$0.R_()) {
         this.b.b($$0, this.i(), this.aC_(), this.m());
      }
   }

   public boolean c(coh $$0) {
      return brr.a(this, $$0);
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
