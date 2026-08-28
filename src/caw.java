public class caw implements cax {
   private final bvc a;
   private static final int b = 15;
   private static final int c = 10;
   private static final int d = 10;
   private int e;
   private float f;

   public caw(bvc $$0) {
      this.a = $$0;
   }

   public void a() {
      if (this.f()) {
         this.a.aX = this.a.dN();
         this.c();
         this.f = this.a.aZ;
         this.e = 0;
      } else {
         if (this.e()) {
            if (Math.abs(this.a.aZ - this.f) > 15.0F) {
               this.e = 0;
               this.f = this.a.aZ;
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
      this.a.aX = azk.c(this.a.aX, this.a.aZ, (float)this.a.ae());
   }

   private void c() {
      this.a.aZ = azk.c(this.a.aZ, this.a.aX, (float)this.a.ae());
   }

   private void d() {
      int $$0 = this.e - 10;
      float $$1 = azk.a((float)$$0 / 10.0F, 0.0F, 1.0F);
      float $$2 = (float)this.a.ae() * (1.0F - $$1);
      this.a.aX = azk.c(this.a.aX, this.a.aZ, $$2);
   }

   private boolean e() {
      return !(this.a.db() instanceof bvc);
   }

   private boolean f() {
      double $$0 = this.a.dC() - this.a.L;
      double $$1 = this.a.dI() - this.a.N;
      return $$0 * $$0 + $$1 * $$1 > 2.5000003E-7F;
   }
}
