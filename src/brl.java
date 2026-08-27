public class brl extends brj {
   private static final float l = 10.0F;
   private static final float m = 60.0F;
   private final int n;
   private final int o;
   private final float p;
   private final float q;
   private final boolean r;

   public brl(bln $$0, int $$1, int $$2, float $$3, float $$4, boolean $$5) {
      super($$0);
      this.n = $$1;
      this.o = $$2;
      this.p = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   @Override
   public void a() {
      if (this.r && this.d.aZ()) {
         this.d.g(this.d.dq().b(0.0, 0.005, 0.0));
      }

      if (this.k == brj.a.b && !this.d.N().l()) {
         double $$0 = this.e - this.d.ds();
         double $$1 = this.f - this.d.du();
         double $$2 = this.g - this.d.dy();
         double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
         if ($$3 < 2.5000003E-7F) {
            this.d.A(0.0F);
         } else {
            float $$4 = (float)(atq.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
            this.d.r(this.a(this.d.dD(), $$4, (float)this.o));
            this.d.aU = this.d.dD();
            this.d.aW = this.d.dD();
            float $$5 = (float)(this.h * this.d.b(bmr.m));
            if (this.d.aZ()) {
               this.d.w($$5 * this.p);
               double $$6 = Math.sqrt($$0 * $$0 + $$2 * $$2);
               if (Math.abs($$1) > 1.0E-5F || Math.abs($$6) > 1.0E-5F) {
                  float $$7 = -((float)(atq.d($$1, $$6) * 180.0F / (float)Math.PI));
                  $$7 = atq.a(atq.g($$7), (float)(-this.n), (float)this.n);
                  this.d.s(this.a(this.d.dF(), $$7, 5.0F));
               }

               float $$8 = atq.b(this.d.dF() * (float) (Math.PI / 180.0));
               float $$9 = atq.a(this.d.dF() * (float) (Math.PI / 180.0));
               this.d.bm = $$8 * $$5;
               this.d.bl = -$$9 * $$5;
            } else {
               float $$10 = Math.abs(atq.g(this.d.dD() - $$4));
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
      return 1.0F - atq.a(($$0 - 10.0F) / 50.0F, 0.0F, 1.0F);
   }
}
