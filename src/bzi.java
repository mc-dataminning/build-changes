public class bzi implements bzj {
   private final btn a;
   private static final int b = 15;
   private static final int c = 10;
   private static final int d = 10;
   private int e;
   private float f;

   public bzi(btn $$0) {
      this.a = $$0;
   }

   public void a() {
      if (this.f()) {
         this.a.aY = this.a.dG();
         this.c();
         this.f = this.a.ba;
         this.e = 0;
      } else {
         if (this.e()) {
            if (Math.abs(this.a.ba - this.f) > 15.0F) {
               this.e = 0;
               this.f = this.a.ba;
               this.b();
            } else {
               this.e++;
               if (this.e > 10) {
                  this.d();
               }
            }
         }
      }
   }

   private void b() {
      this.a.aY = ayn.c(this.a.aY, this.a.ba, (float)this.a.ab());
   }

   private void c() {
      this.a.ba = ayn.c(this.a.ba, this.a.aY, (float)this.a.ab());
   }

   private void d() {
      int $$0 = this.e - 10;
      float $$1 = ayn.a((float)$$0 / 10.0F, 0.0F, 1.0F);
      float $$2 = (float)this.a.ab() * (1.0F - $$1);
      this.a.aY = ayn.c(this.a.aY, this.a.ba, $$2);
   }

   private boolean e() {
      return !(this.a.cU() instanceof btn);
   }

   private boolean f() {
      double $$0 = this.a.dv() - this.a.L;
      double $$1 = this.a.dB() - this.a.N;
      return $$0 * $$0 + $$1 * $$1 > 2.5000003E-7F;
   }
}
