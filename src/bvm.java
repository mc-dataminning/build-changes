public class bvm extends bvp {
   private final int l;
   private final boolean m;

   public bvm(bpr $$0, int $$1, boolean $$2) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
   }

   @Override
   public void a() {
      if (this.k == bvp.a.b) {
         this.k = bvp.a.a;
         this.d.e(true);
         double $$0 = this.e - this.d.dr();
         double $$1 = this.f - this.d.dt();
         double $$2 = this.g - this.d.dx();
         double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
         if ($$3 < 2.5000003E-7F) {
            this.d.D(0.0F);
            this.d.C(0.0F);
            return;
         }

         float $$4 = (float)(aww.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.r(this.a(this.d.dC(), $$4, 90.0F));
         float $$5;
         if (this.d.aC()) {
            $$5 = (float)(this.h * this.d.g(bqw.r));
         } else {
            $$5 = (float)(this.h * this.d.g(bqw.j));
         }

         this.d.y($$5);
         double $$7 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$1) > 1.0E-5F || Math.abs($$7) > 1.0E-5F) {
            float $$8 = (float)(-(aww.d($$1, $$7) * 180.0F / (float)Math.PI));
            this.d.s(this.a(this.d.dE(), $$8, (float)this.l));
            this.d.D($$1 > 0.0 ? $$5 : -$$5);
         }
      } else {
         if (!this.m) {
            this.d.e(false);
         }

         this.d.D(0.0F);
         this.d.C(0.0F);
      }
   }
}
