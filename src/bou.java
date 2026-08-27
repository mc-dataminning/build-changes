public class bou extends box {
   private final int l;
   private final boolean m;

   public bou(bja $$0, int $$1, boolean $$2) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
   }

   @Override
   public void a() {
      if (this.k == box.a.b) {
         this.k = box.a.a;
         this.d.e(true);
         double $$0 = this.e - this.d.dp();
         double $$1 = this.f - this.d.dr();
         double $$2 = this.g - this.d.dv();
         double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
         if ($$3 < 2.5000003E-7F) {
            this.d.B(0.0F);
            this.d.A(0.0F);
            return;
         }

         float $$4 = (float)(arp.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.r(this.a(this.d.dA(), $$4, 90.0F));
         float $$5;
         if (this.d.aA()) {
            $$5 = (float)(this.h * this.d.b(bkf.d));
         } else {
            $$5 = (float)(this.h * this.d.b(bkf.e));
         }

         this.d.w($$5);
         double $$7 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$1) > 1.0E-5F || Math.abs($$7) > 1.0E-5F) {
            float $$8 = (float)(-(arp.d($$1, $$7) * 180.0F / (float)Math.PI));
            this.d.s(this.a(this.d.dC(), $$8, (float)this.l));
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
