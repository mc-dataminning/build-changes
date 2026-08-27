public class boy extends bow {
   private static final float l = 10.0F;
   private static final float m = 60.0F;
   private final int n;
   private final int o;
   private final float p;
   private final float q;
   private final boolean r;

   public boy(bja $$0, int $$1, int $$2, float $$3, float $$4, boolean $$5) {
      super($$0);
      this.n = $$1;
      this.o = $$2;
      this.p = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   @Override
   public void a() {
      if (this.r && this.d.aX()) {
         this.d.f(this.d.dn().b(0.0, 0.005, 0.0));
      }

      if (this.k == bow.a.b && !this.d.H().l()) {
         double $$0 = this.e - this.d.dp();
         double $$1 = this.f - this.d.dr();
         double $$2 = this.g - this.d.dv();
         double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
         if ($$3 < 2.5000003E-7F) {
            this.d.A(0.0F);
         } else {
            float $$4 = (float)(arp.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
            this.d.r(this.a(this.d.dA(), $$4, (float)this.o));
            this.d.aU = this.d.dA();
            this.d.aW = this.d.dA();
            float $$5 = (float)(this.h * this.d.b(bke.d));
            if (this.d.aX()) {
               this.d.w($$5 * this.p);
               double $$6 = Math.sqrt($$0 * $$0 + $$2 * $$2);
               if (Math.abs($$1) > 1.0E-5F || Math.abs($$6) > 1.0E-5F) {
                  float $$7 = -((float)(arp.d($$1, $$6) * 180.0F / (float)Math.PI));
                  $$7 = arp.a(arp.g($$7), (float)(-this.n), (float)this.n);
                  this.d.s(this.a(this.d.dC(), $$7, 5.0F));
               }

               float $$8 = arp.b(this.d.dC() * (float) (Math.PI / 180.0));
               float $$9 = arp.a(this.d.dC() * (float) (Math.PI / 180.0));
               this.d.bm = $$8 * $$5;
               this.d.bl = -$$9 * $$5;
            } else {
               float $$10 = Math.abs(arp.g(this.d.dA() - $$4));
               float $$11 = a($$10);
               this.d.w($$5 * this.q * $$11);
            }
         }
      } else {
         this.d.w(0.0F);
         this.d.C(0.0F);
         this.d.B(0.0F);
         this.d.A(0.0F);
      }
   }

   private static float a(float $$0) {
      return 1.0F - arp.a(($$0 - 10.0F) / 50.0F, 0.0F, 1.0F);
   }
}
