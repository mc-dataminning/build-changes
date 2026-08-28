public class cct implements ccu {
   private final bxb a;
   private static final int b = 15;
   private static final int c = 10;
   private static final int d = 10;
   private int e;
   private float f;

   public cct(bxb $$0) {
      this.a = $$0;
   }

   public void a() {
      if (this.f()) {
         this.a.aV = this.a.dL();
         this.c();
         this.f = this.a.aX;
         this.e = 0;
      } else {
         if (this.e()) {
            if (Math.abs(this.a.aX - this.f) > 15.0F) {
               this.e = 0;
               this.f = this.a.aX;
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
      this.a.aV = azk.c(this.a.aV, this.a.aX, (float)this.a.ad());
   }

   private void c() {
      this.a.aX = azk.c(this.a.aX, this.a.aV, (float)this.a.ad());
   }

   private void d() {
      int $$0 = this.e - 10;
      float $$1 = azk.a((float)$$0 / 10.0F, 0.0F, 1.0F);
      float $$2 = (float)this.a.ad() * (1.0F - $$1);
      this.a.aV = azk.c(this.a.aV, this.a.aX, $$2);
   }

   private boolean e() {
      return !(this.a.cZ() instanceof bxb);
   }

   private boolean f() {
      double $$0 = this.a.dA() - this.a.K;
      double $$1 = this.a.dG() - this.a.M;
      return $$0 * $$0 + $$1 * $$1 > 2.5000003E-7F;
   }
}
