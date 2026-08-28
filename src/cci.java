public class cci extends ccg {
   private static final float l = 10.0F;
   private static final float m = 60.0F;
   private final int n;
   private final int o;
   private final float p;
   private final float q;
   private final boolean r;

   public cci(bwh $$0, int $$1, int $$2, float $$3, float $$4, boolean $$5) {
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
         this.d.h(this.d.dz().b(0.0, 0.005, 0.0));
      }

      if (this.k == ccg.a.b && !this.d.L().m()) {
         double $$0 = this.e - this.d.dB();
         double $$1 = this.f - this.d.dD();
         double $$2 = this.g - this.d.dH();
         double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
         if ($$3 < 2.5000003E-7F) {
            this.d.G(0.0F);
         } else {
            float $$4 = (float)(bae.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
            this.d.v(this.b(this.d.dM(), $$4, (float)this.o));
            this.d.aX = this.d.dM();
            this.d.aZ = this.d.dM();
            float $$5 = (float)(this.h * this.d.h(bxn.v));
            if (this.d.bj()) {
               this.d.C($$5 * this.p);
               double $$6 = Math.sqrt($$0 * $$0 + $$2 * $$2);
               if (Math.abs($$1) > 1.0E-5F || Math.abs($$6) > 1.0E-5F) {
                  float $$7 = -((float)(bae.d($$1, $$6) * 180.0F / (float)Math.PI));
                  $$7 = bae.a(bae.h($$7), (float)(-this.n), (float)this.n);
                  this.d.w(this.a(this.d.dO(), $$7, 5.0F));
               }

               float $$8 = bae.b(this.d.dO() * (float) (Math.PI / 180.0));
               float $$9 = bae.a(this.d.dO() * (float) (Math.PI / 180.0));
               this.d.bq = $$8 * $$5;
               this.d.bp = -$$9 * $$5;
            } else {
               float $$10 = Math.abs(bae.h(this.d.dM() - $$4));
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
      return 1.0F - bae.a(($$0 - 10.0F) / 50.0F, 0.0F, 1.0F);
   }
}
