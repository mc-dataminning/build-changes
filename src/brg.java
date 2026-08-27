public class brg extends brj {
   private final int l;
   private final boolean m;

   public brg(bln $$0, int $$1, boolean $$2) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
   }

   @Override
   public void a() {
      if (this.k == brj.a.b) {
         this.k = brj.a.a;
         this.d.e(true);
         double $$0 = this.e - this.d.ds();
         double $$1 = this.f - this.d.du();
         double $$2 = this.g - this.d.dy();
         double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
         if ($$3 < 2.5000003E-7F) {
            this.d.B(0.0F);
            this.d.A(0.0F);
            return;
         }

         float $$4 = (float)(atq.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.r(this.a(this.d.dD(), $$4, 90.0F));
         float $$5;
         if (this.d.aC()) {
            $$5 = (float)(this.h * this.d.b(bmr.m));
         } else {
            $$5 = (float)(this.h * this.d.b(bmr.f));
         }

         this.d.w($$5);
         double $$7 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$1) > 1.0E-5F || Math.abs($$7) > 1.0E-5F) {
            float $$8 = (float)(-(atq.d($$1, $$7) * 180.0F / (float)Math.PI));
            this.d.s(this.a(this.d.dF(), $$8, (float)this.l));
            this.d.B($$1 > 0.0 ? $$5 : -$$5);
         }
      } else {
         if (!this.m) {
            this.d.e(false);
         }

         this.d.B(0.0F);
         this.d.A(0.0F);
      }
   }
}
