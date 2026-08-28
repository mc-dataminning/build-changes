public class cai implements caj {
   private final bup a;
   private static final int b = 15;
   private static final int c = 10;
   private static final int d = 10;
   private int e;
   private float f;

   public cai(bup $$0) {
      this.a = $$0;
   }

   public void a() {
      if (this.f()) {
         this.a.aT = this.a.dI();
         this.c();
         this.f = this.a.aV;
         this.e = 0;
      } else {
         if (this.e()) {
            if (Math.abs(this.a.aV - this.f) > 15.0F) {
               this.e = 0;
               this.f = this.a.aV;
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
      this.a.aT = azf.c(this.a.aT, this.a.aV, (float)this.a.ae());
   }

   private void c() {
      this.a.aV = azf.c(this.a.aV, this.a.aT, (float)this.a.ae());
   }

   private void d() {
      int $$0 = this.e - 10;
      float $$1 = azf.a((float)$$0 / 10.0F, 0.0F, 1.0F);
      float $$2 = (float)this.a.ae() * (1.0F - $$1);
      this.a.aT = azf.c(this.a.aT, this.a.aV, $$2);
   }

   private boolean e() {
      return !(this.a.cX() instanceof bup);
   }

   private boolean f() {
      double $$0 = this.a.dx() - this.a.L;
      double $$1 = this.a.dD() - this.a.N;
      return $$0 * $$0 + $$1 * $$1 > 2.5000003E-7F;
   }
}
