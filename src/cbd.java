public class cbd implements cbe {
   private final bvj a;
   private static final int b = 15;
   private static final int c = 10;
   private static final int d = 10;
   private int e;
   private float f;

   public cbd(bvj $$0) {
      this.a = $$0;
   }

   public void a() {
      if (this.f()) {
         this.a.aW = this.a.dL();
         this.c();
         this.f = this.a.aY;
         this.e = 0;
      } else {
         if (this.e()) {
            if (Math.abs(this.a.aY - this.f) > 15.0F) {
               this.e = 0;
               this.f = this.a.aY;
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
      this.a.aW = azm.c(this.a.aW, this.a.aY, (float)this.a.aa());
   }

   private void c() {
      this.a.aY = azm.c(this.a.aY, this.a.aW, (float)this.a.aa());
   }

   private void d() {
      int $$0 = this.e - 10;
      float $$1 = azm.a((float)$$0 / 10.0F, 0.0F, 1.0F);
      float $$2 = (float)this.a.aa() * (1.0F - $$1);
      this.a.aW = azm.c(this.a.aW, this.a.aY, $$2);
   }

   private boolean e() {
      return !(this.a.da() instanceof bvj);
   }

   private boolean f() {
      double $$0 = this.a.dA() - this.a.K;
      double $$1 = this.a.dG() - this.a.M;
      return $$0 * $$0 + $$1 * $$1 > 2.5000003E-7F;
   }
}
