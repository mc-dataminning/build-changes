public class fjz extends flw {
   private static final float a = 0.0025F;
   private static final int b = 300;
   private static final int F = 300;
   private static final float G = 0.25F;
   private static final float H = 2.0F;
   private float I;
   private final float J;
   private final float K;

   protected fjz(fie $$0, double $$1, double $$2, double $$3, flr $$4) {
      super($$0, $$1, $$2, $$3);
      this.a($$4.a(this.r.a(12), 12));
      this.I = (float)Math.toRadians(this.r.h() ? -30.0 : 30.0);
      this.J = this.r.i();
      this.K = (float)Math.toRadians(this.r.h() ? -5.0 : 5.0);
      this.t = 300;
      this.u = 7.5E-4F;
      float $$5 = this.r.h() ? 0.05F : 0.075F;
      this.D = $$5;
      this.b($$5, $$5);
      this.B = 1.0F;
   }

   @Override
   public fla b() {
      return fla.b;
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.t-- <= 0) {
         this.k();
      }

      if (!this.o) {
         float $$0 = (float)(300 - this.t);
         float $$1 = Math.min($$0 / 300.0F, 1.0F);
         double $$2 = Math.cos(Math.toRadians((double)(this.J * 60.0F))) * 2.0 * Math.pow((double)$$1, 1.25);
         double $$3 = Math.sin(Math.toRadians((double)(this.J * 60.0F))) * 2.0 * Math.pow((double)$$1, 1.25);
         this.j += $$2 * 0.0025F;
         this.l += $$3 * 0.0025F;
         this.k = this.k - (double)this.u;
         this.I = this.I + this.K / 20.0F;
         this.A = this.z;
         this.z = this.z + this.I / 20.0F;
         this.a(this.j, this.k, this.l);
         if (this.m || this.t < 299 && (this.j == 0.0 || this.l == 0.0)) {
            this.k();
         }

         if (!this.o) {
            this.j = this.j * (double)this.B;
            this.k = this.k * (double)this.B;
            this.l = this.l * (double)this.B;
         }
      }
   }
}
