public class byy implements byz {
   private final bte a;
   private static final int b = 15;
   private static final int c = 10;
   private static final int d = 10;
   private int e;
   private float f;

   public byy(bte $$0) {
      this.a = $$0;
   }

   public void a() {
      if (this.f()) {
         this.a.aZ = this.a.dH();
         this.c();
         this.f = this.a.bb;
         this.e = 0;
      } else {
         if (this.e()) {
            if (Math.abs(this.a.bb - this.f) > 15.0F) {
               this.e = 0;
               this.f = this.a.bb;
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
      this.a.aZ = ayg.c(this.a.aZ, this.a.bb, (float)this.a.ab());
   }

   private void c() {
      this.a.bb = ayg.c(this.a.bb, this.a.aZ, (float)this.a.ab());
   }

   private void d() {
      int $$0 = this.e - 10;
      float $$1 = ayg.a((float)$$0 / 10.0F, 0.0F, 1.0F);
      float $$2 = (float)this.a.ab() * (1.0F - $$1);
      this.a.aZ = ayg.c(this.a.aZ, this.a.bb, $$2);
   }

   private boolean e() {
      return !(this.a.cV() instanceof bte);
   }

   private boolean f() {
      double $$0 = this.a.dw() - this.a.L;
      double $$1 = this.a.dC() - this.a.N;
      return $$0 * $$0 + $$1 * $$1 > 2.5000003E-7F;
   }
}
