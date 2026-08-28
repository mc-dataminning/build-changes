public class cbf extends cbi {
   private final int l;
   private final boolean m;

   public cbf(bvj $$0, int $$1, boolean $$2) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
   }

   @Override
   public void a() {
      if (this.k == cbi.a.b) {
         this.k = cbi.a.a;
         this.d.f(true);
         double $$0 = this.e - this.d.dA();
         double $$1 = this.f - this.d.dC();
         double $$2 = this.g - this.d.dG();
         double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
         if ($$3 < 2.5000003E-7F) {
            this.d.H(0.0F);
            this.d.G(0.0F);
            return;
         }

         float $$4 = (float)(ayz.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.v(this.b(this.d.dL(), $$4, 90.0F));
         float $$5;
         if (this.d.aJ()) {
            $$5 = (float)(this.h * this.d.h(bwp.v));
         } else {
            $$5 = (float)(this.h * this.d.h(bwp.l));
         }

         this.d.C($$5);
         double $$7 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$1) > 1.0E-5F || Math.abs($$7) > 1.0E-5F) {
            float $$8 = (float)(-(ayz.d($$1, $$7) * 180.0F / (float)Math.PI));
            this.d.w(this.b(this.d.dN(), $$8, (float)this.l));
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
