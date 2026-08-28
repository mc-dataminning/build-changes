public class cam extends cak {
   private static final float l = 10.0F;
   private static final float m = 60.0F;
   private final int n;
   private final int o;
   private final float p;
   private final float q;
   private final boolean r;

   public cam(bum $$0, int $$1, int $$2, float $$3, float $$4, boolean $$5) {
      super($$0);
      this.n = $$1;
      this.o = $$2;
      this.p = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   @Override
   public void a() {
      if (this.r && this.d.bi()) {
         this.d.h(this.d.dv().b(0.0, 0.005, 0.0));
      }

      if (this.k == cak.a.b && !this.d.P().m()) {
         double $$0 = this.e - this.d.dx();
         double $$1 = this.f - this.d.dz();
         double $$2 = this.g - this.d.dD();
         double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
         if ($$3 < 2.5000003E-7F) {
            this.d.G(0.0F);
         } else {
            float $$4 = (float)(azd.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
            this.d.v(this.a(this.d.dI(), $$4, (float)this.o));
            this.d.aT = this.d.dI();
            this.d.aV = this.d.dI();
            float $$5 = (float)(this.h * this.d.h(bvr.v));
            if (this.d.bi()) {
               this.d.C($$5 * this.p);
               double $$6 = Math.sqrt($$0 * $$0 + $$2 * $$2);
               if (Math.abs($$1) > 1.0E-5F || Math.abs($$6) > 1.0E-5F) {
                  float $$7 = -((float)(azd.d($$1, $$6) * 180.0F / (float)Math.PI));
                  $$7 = azd.a(azd.g($$7), (float)(-this.n), (float)this.n);
                  this.d.w(this.a(this.d.dK(), $$7, 5.0F));
               }

               float $$8 = azd.b(this.d.dK() * (float) (Math.PI / 180.0));
               float $$9 = azd.a(this.d.dK() * (float) (Math.PI / 180.0));
               this.d.bm = $$8 * $$5;
               this.d.bl = -$$9 * $$5;
            } else {
               float $$10 = Math.abs(azd.g(this.d.dI() - $$4));
               float $$11 = a($$10);
               this.d.C($$5 * this.q * $$11);
            }
         }
      } else {
         this.d.C(0.0F);
         this.d.I(0.0F);
         this.d.H(0.0F);
         this.d.G(0.0F);
      }
   }

   private static float a(float $$0) {
      return 1.0F - azd.a(($$0 - 10.0F) / 50.0F, 0.0F, 1.0F);
   }
}
