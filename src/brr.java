public class brr extends bru {
   private final int l;
   private final boolean m;

   public brr(blx $$0, int $$1, boolean $$2) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
   }

   @Override
   public void a() {
      if (this.k == bru.a.b) {
         this.k = bru.a.a;
         this.d.e(true);
         double $$0 = this.e - this.d.dr();
         double $$1 = this.f - this.d.dt();
         double $$2 = this.g - this.d.dx();
         double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
         if ($$3 < 2.5000003E-7F) {
            this.d.B(0.0F);
            this.d.A(0.0F);
            return;
         }

         float $$4 = (float)(aty.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.r(this.a(this.d.dC(), $$4, 90.0F));
         float $$5;
         if (this.d.aC()) {
            $$5 = (float)(this.h * this.d.b(bnb.m));
         } else {
            $$5 = (float)(this.h * this.d.b(bnb.f));
         }

         this.d.w($$5);
         double $$7 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$1) > 1.0E-5F || Math.abs($$7) > 1.0E-5F) {
            float $$8 = (float)(-(aty.d($$1, $$7) * 180.0F / (float)Math.PI));
            this.d.s(this.a(this.d.dE(), $$8, (float)this.l));
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
