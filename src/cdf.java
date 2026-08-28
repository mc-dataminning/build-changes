public class cdf extends cdi {
   private final int l;
   private final boolean m;

   public cdf(bxl $$0, int $$1, boolean $$2) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
   }

   @Override
   public void a() {
      if (this.k == cdi.a.b) {
         this.k = cdi.a.a;
         this.d.f(true);
         double $$0 = this.e - this.d.dz();
         double $$1 = this.f - this.d.dB();
         double $$2 = this.g - this.d.dF();
         double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
         if ($$3 < 2.5000003E-7F) {
            this.d.H(0.0F);
            this.d.G(0.0F);
            return;
         }

         float $$4 = (float)(azm.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.w(this.b(this.d.dK(), $$4, 90.0F));
         float $$5;
         if (this.d.aH()) {
            $$5 = (float)(this.h * this.d.h(byp.v));
         } else {
            $$5 = (float)(this.h * this.d.h(byp.l));
         }

         this.d.B($$5);
         double $$7 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$1) > 1.0E-5F || Math.abs($$7) > 1.0E-5F) {
            float $$8 = (float)(-(azm.d($$1, $$7) * 180.0F / (float)Math.PI));
            this.d.x(this.b(this.d.dM(), $$8, (float)this.l));
            this.d.H($$1 > 0.0 ? $$5 : -$$5);
         }
      } else {
         if (!this.m) {
            this.d.f(false);
         }

         this.d.H(0.0F);
         this.d.G(0.0F);
      }
   }
}
