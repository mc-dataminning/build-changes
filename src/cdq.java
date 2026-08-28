public class cdq implements cdr {
   private final bxy a;
   private static final int b = 15;
   private static final int c = 10;
   private static final int d = 10;
   private int e;
   private float f;

   public cdq(bxy $$0) {
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
      this.a.aV = azq.c(this.a.aV, this.a.aX, (float)this.a.af());
   }

   private void c() {
      this.a.aX = azq.c(this.a.aX, this.a.aV, (float)this.a.af());
   }

   private void d() {
      int $$0 = this.e - 10;
      float $$1 = azq.a((float)$$0 / 10.0F, 0.0F, 1.0F);
      float $$2 = (float)this.a.af() * (1.0F - $$1);
      this.a.aV = azq.c(this.a.aV, this.a.aX, $$2);
   }

   private boolean e() {
      return !(this.a.cZ() instanceof bxy);
   }

   private boolean f() {
      double $$0 = this.a.dA() - this.a.K;
      double $$1 = this.a.dG() - this.a.M;
      return $$0 * $$0 + $$1 * $$1 > 2.5000003E-7F;
   }
}
