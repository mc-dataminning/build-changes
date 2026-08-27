public class bsk extends bsn {
   private final int l;
   private final boolean m;

   public bsk(bmq $$0, int $$1, boolean $$2) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
   }

   @Override
   public void a() {
      if (this.k == bsn.a.b) {
         this.k = bsn.a.a;
         this.d.e(true);
         double $$0 = this.e - this.d.dq();
         double $$1 = this.f - this.d.ds();
         double $$2 = this.g - this.d.dw();
         double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
         if ($$3 < 2.5000003E-7F) {
            this.d.A(0.0F);
            this.d.z(0.0F);
            return;
         }

         float $$4 = (float)(aup.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.r(this.a(this.d.dB(), $$4, 90.0F));
         float $$5;
         if (this.d.aC()) {
            $$5 = (float)(this.h * this.d.g(bnu.o));
         } else {
            $$5 = (float)(this.h * this.d.g(bnu.h));
         }

         this.d.v($$5);
         double $$7 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$1) > 1.0E-5F || Math.abs($$7) > 1.0E-5F) {
            float $$8 = (float)(-(aup.d($$1, $$7) * 180.0F / (float)Math.PI));
            this.d.s(this.a(this.d.dD(), $$8, (float)this.l));
            this.d.A($$1 > 0.0 ? $$5 : -$$5);
         }
      } else {
         if (!this.m) {
            this.d.e(false);
         }

         this.d.A(0.0F);
         this.d.z(0.0F);
      }
   }
}
