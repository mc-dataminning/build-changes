public class car implements cas {
   private final bux a;
   private static final int b = 15;
   private static final int c = 10;
   private static final int d = 10;
   private int e;
   private float f;

   public car(bux $$0) {
      this.a = $$0;
   }

   public void a() {
      if (this.f()) {
         this.a.aU = this.a.dN();
         this.c();
         this.f = this.a.aW;
         this.e = 0;
      } else {
         if (this.e()) {
            if (Math.abs(this.a.aW - this.f) > 15.0F) {
               this.e = 0;
               this.f = this.a.aW;
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
      this.a.aU = azj.c(this.a.aU, this.a.aW, (float)this.a.ae());
   }

   private void c() {
      this.a.aW = azj.c(this.a.aW, this.a.aU, (float)this.a.ae());
   }

   private void d() {
      int $$0 = this.e - 10;
      float $$1 = azj.a((float)$$0 / 10.0F, 0.0F, 1.0F);
      float $$2 = (float)this.a.ae() * (1.0F - $$1);
      this.a.aU = azj.c(this.a.aU, this.a.aW, $$2);
   }

   private boolean e() {
      return !(this.a.db() instanceof bux);
   }

   private boolean f() {
      double $$0 = this.a.dC() - this.a.L;
      double $$1 = this.a.dI() - this.a.N;
      return $$0 * $$0 + $$1 * $$1 > 2.5000003E-7F;
   }
}
