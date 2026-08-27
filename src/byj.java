public class byj implements byk {
   private final bsq a;
   private static final int b = 15;
   private static final int c = 10;
   private static final int d = 10;
   private int e;
   private float f;

   public byj(bsq $$0) {
      this.a = $$0;
   }

   public void a() {
      if (this.f()) {
         this.a.bj = this.a.dK();
         this.c();
         this.f = this.a.bl;
         this.e = 0;
      } else {
         if (this.e()) {
            if (Math.abs(this.a.bl - this.f) > 15.0F) {
               this.e = 0;
               this.f = this.a.bl;
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
      this.a.bj = aym.c(this.a.bj, this.a.bl, (float)this.a.aa());
   }

   private void c() {
      this.a.bl = aym.c(this.a.bl, this.a.bj, (float)this.a.aa());
   }

   private void d() {
      int $$0 = this.e - 10;
      float $$1 = aym.a((float)$$0 / 10.0F, 0.0F, 1.0F);
      float $$2 = (float)this.a.aa() * (1.0F - $$1);
      this.a.bj = aym.c(this.a.bj, this.a.bl, $$2);
   }

   private boolean e() {
      return !(this.a.cY() instanceof bsq);
   }

   private boolean f() {
      double $$0 = this.a.dz() - this.a.M;
      double $$1 = this.a.dF() - this.a.O;
      return $$0 * $$0 + $$1 * $$1 > 2.5000003E-7F;
   }
}
