public class bus implements but {
   private final boz a;
   private static final int b = 15;
   private static final int c = 10;
   private static final int d = 10;
   private int e;
   private float f;

   public bus(boz $$0) {
      this.a = $$0;
   }

   public void a() {
      if (this.f()) {
         this.a.aV = this.a.dz();
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
      this.a.aV = awm.c(this.a.aV, this.a.aX, (float)this.a.fJ());
   }

   private void c() {
      this.a.aX = awm.c(this.a.aX, this.a.aV, (float)this.a.fJ());
   }

   private void d() {
      int $$0 = this.e - 10;
      float $$1 = awm.a((float)$$0 / 10.0F, 0.0F, 1.0F);
      float $$2 = (float)this.a.fJ() * (1.0F - $$1);
      this.a.aV = awm.c(this.a.aV, this.a.aX, $$2);
   }

   private boolean e() {
      return !(this.a.cN() instanceof boz);
   }

   private boolean f() {
      double $$0 = this.a.do() - this.a.J;
      double $$1 = this.a.du() - this.a.L;
      return $$0 * $$0 + $$1 * $$1 > 2.5000003E-7F;
   }
}
