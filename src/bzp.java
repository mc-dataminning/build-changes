public class bzp extends bzs {
   private final int l;
   private final boolean m;

   public bzp(btt $$0, int $$1, boolean $$2) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
   }

   @Override
   public void a() {
      if (this.k == bzs.a.b) {
         this.k = bzs.a.a;
         this.d.f(true);
         double $$0 = this.e - this.d.du();
         double $$1 = this.f - this.d.dw();
         double $$2 = this.g - this.d.dA();
         double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
         if ($$3 < 2.5000003E-7F) {
            this.d.D(0.0F);
            this.d.C(0.0F);
            return;
         }

         float $$4 = (float)(ayz.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.r(this.a(this.d.dF(), $$4, 90.0F));
         float $$5;
         if (this.d.aE()) {
            $$5 = (float)(this.h * this.d.g(buz.r));
         } else {
            $$5 = (float)(this.h * this.d.g(buz.j));
         }

         this.d.y($$5);
         double $$7 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$1) > 1.0E-5F || Math.abs($$7) > 1.0E-5F) {
            float $$8 = (float)(-(ayz.d($$1, $$7) * 180.0F / (float)Math.PI));
            this.d.s(this.a(this.d.dH(), $$8, (float)this.l));
            this.d.D($$1 > 0.0 ? $$5 : -$$5);
         }
      } else {
         if (!this.m) {
            this.d.f(false);
         }

         this.d.D(0.0F);
         this.d.C(0.0F);
      }
   }
}
