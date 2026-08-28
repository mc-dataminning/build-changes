public class byz extends bzc {
   private final int l;
   private final boolean m;

   public byz(btd $$0, int $$1, boolean $$2) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
   }

   @Override
   public void a() {
      if (this.k == bzc.a.b) {
         this.k = bzc.a.a;
         this.d.f(true);
         double $$0 = this.e - this.d.dv();
         double $$1 = this.f - this.d.dx();
         double $$2 = this.g - this.d.dB();
         double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
         if ($$3 < 2.5000003E-7F) {
            this.d.E(0.0F);
            this.d.D(0.0F);
            return;
         }

         float $$4 = (float)(ayg.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.s(this.a(this.d.dG(), $$4, 90.0F));
         float $$5;
         if (this.d.aF()) {
            $$5 = (float)(this.h * this.d.g(buj.v));
         } else {
            $$5 = (float)(this.h * this.d.g(buj.l));
         }

         this.d.z($$5);
         double $$7 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$1) > 1.0E-5F || Math.abs($$7) > 1.0E-5F) {
            float $$8 = (float)(-(ayg.d($$1, $$7) * 180.0F / (float)Math.PI));
            this.d.t(this.a(this.d.dI(), $$8, (float)this.l));
            this.d.E($$1 > 0.0 ? $$5 : -$$5);
         }
      } else {
         if (!this.m) {
            this.d.f(false);
         }

         this.d.E(0.0F);
         this.d.D(0.0F);
      }
   }
}
