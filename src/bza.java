public class bza extends bzd {
   private final int l;
   private final boolean m;

   public bza(bte $$0, int $$1, boolean $$2) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
   }

   @Override
   public void a() {
      if (this.k == bzd.a.b) {
         this.k = bzd.a.a;
         this.d.g(true);
         double $$0 = this.e - this.d.dw();
         double $$1 = this.f - this.d.dy();
         double $$2 = this.g - this.d.dC();
         double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
         if ($$3 < 2.5000003E-7F) {
            this.d.E(0.0F);
            this.d.D(0.0F);
            return;
         }

         float $$4 = (float)(ayg.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.s(this.a(this.d.dH(), $$4, 90.0F));
         float $$5;
         if (this.d.aG()) {
            $$5 = (float)(this.h * this.d.g(buk.v));
         } else {
            $$5 = (float)(this.h * this.d.g(buk.l));
         }

         this.d.z($$5);
         double $$7 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$1) > 1.0E-5F || Math.abs($$7) > 1.0E-5F) {
            float $$8 = (float)(-(ayg.d($$1, $$7) * 180.0F / (float)Math.PI));
            this.d.t(this.a(this.d.dJ(), $$8, (float)this.l));
            this.d.E($$1 > 0.0 ? $$5 : -$$5);
         }
      } else {
         if (!this.m) {
            this.d.g(false);
         }

         this.d.E(0.0F);
         this.d.D(0.0F);
      }
   }
}
