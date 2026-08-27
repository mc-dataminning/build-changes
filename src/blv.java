public class blv extends bly {
   private final int l;
   private final boolean m;

   public blv(bgb $$0, int $$1, boolean $$2) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
   }

   @Override
   public void a() {
      if (this.k == bly.a.b) {
         this.k = bly.a.a;
         this.d.e(true);
         double $$0 = this.e - this.d.dn();
         double $$1 = this.f - this.d.dp();
         double $$2 = this.g - this.d.dt();
         double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
         if ($$3 < 2.5000003E-7F) {
            this.d.A(0.0F);
            this.d.z(0.0F);
            return;
         }

         float $$4 = (float)(apa.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.a_(this.a(this.d.dy(), $$4, 90.0F));
         float $$5;
         if (this.d.ay()) {
            $$5 = (float)(this.h * this.d.b(bhg.d));
         } else {
            $$5 = (float)(this.h * this.d.b(bhg.e));
         }

         this.d.w($$5);
         double $$7 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$1) > 1.0E-5F || Math.abs($$7) > 1.0E-5F) {
            float $$8 = (float)(-(apa.d($$1, $$7) * 180.0F / (float)Math.PI));
            this.d.b_(this.a(this.d.dA(), $$8, (float)this.l));
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
