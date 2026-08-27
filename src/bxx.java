public class bxx extends bya {
   private final int l;
   private final boolean m;

   public bxx(bsc $$0, int $$1, boolean $$2) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
   }

   @Override
   public void a() {
      if (this.k == bya.a.b) {
         this.k = bya.a.a;
         this.d.f(true);
         double $$0 = this.e - this.d.ds();
         double $$1 = this.f - this.d.du();
         double $$2 = this.g - this.d.dy();
         double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
         if ($$3 < 2.5000003E-7F) {
            this.d.D(0.0F);
            this.d.C(0.0F);
            return;
         }

         float $$4 = (float)(axz.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.r(this.a(this.d.dD(), $$4, 90.0F));
         float $$5;
         if (this.d.aC()) {
            $$5 = (float)(this.h * this.d.g(bth.r));
         } else {
            $$5 = (float)(this.h * this.d.g(bth.j));
         }

         this.d.y($$5);
         double $$7 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$1) > 1.0E-5F || Math.abs($$7) > 1.0E-5F) {
            float $$8 = (float)(-(axz.d($$1, $$7) * 180.0F / (float)Math.PI));
            this.d.s(this.a(this.d.dF(), $$8, (float)this.l));
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
