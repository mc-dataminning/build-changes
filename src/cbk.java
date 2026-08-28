public class cbk extends cbi {
   private static final float l = 10.0F;
   private static final float m = 60.0F;
   private final int n;
   private final int o;
   private final float p;
   private final float q;
   private final boolean r;

   public cbk(bvj $$0, int $$1, int $$2, float $$3, float $$4, boolean $$5) {
      super($$0);
      this.n = $$1;
      this.o = $$2;
      this.p = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   @Override
   public void a() {
      if (this.r && this.d.bj()) {
         this.d.h(this.d.dy().b(0.0, 0.005, 0.0));
      }

      if (this.k == cbi.a.b && !this.d.L().m()) {
         double $$0 = this.e - this.d.dA();
         double $$1 = this.f - this.d.dC();
         double $$2 = this.g - this.d.dG();
         double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
         if ($$3 < 2.5000003E-7F) {
            this.d.G(0.0F);
         } else {
            float $$4 = (float)(azm.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
            this.d.v(this.b(this.d.dL(), $$4, (float)this.o));
            this.d.aW = this.d.dL();
            this.d.aY = this.d.dL();
            float $$5 = (float)(this.h * this.d.h(bwp.v));
            if (this.d.bj()) {
               this.d.C($$5 * this.p);
               double $$6 = Math.sqrt($$0 * $$0 + $$2 * $$2);
               if (Math.abs($$1) > 1.0E-5F || Math.abs($$6) > 1.0E-5F) {
                  float $$7 = -((float)(azm.d($$1, $$6) * 180.0F / (float)Math.PI));
                  $$7 = azm.a(azm.h($$7), (float)(-this.n), (float)this.n);
                  this.d.w(this.a(this.d.dN(), $$7, 5.0F));
               }

               float $$8 = azm.b(this.d.dN() * (float) (Math.PI / 180.0));
               float $$9 = azm.a(this.d.dN() * (float) (Math.PI / 180.0));
               this.d.bp = $$8 * $$5;
               this.d.bo = -$$9 * $$5;
            } else {
               float $$10 = Math.abs(azm.h(this.d.dL() - $$4));
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
      return 1.0F - azm.a(($$0 - 10.0F) / 50.0F, 0.0F, 1.0F);
   }
}
