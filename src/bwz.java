public class bwz implements bxa {
   private final brg a;
   private static final int b = 15;
   private static final int c = 10;
   private static final int d = 10;
   private int e;
   private float f;

   public bwz(brg $$0) {
      this.a = $$0;
   }

   public void a() {
      if (this.f()) {
         this.a.aZ = this.a.dD();
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
      this.a.aZ = axw.c(this.a.aZ, this.a.bb, (float)this.a.aa());
   }

   private void c() {
      this.a.bb = axw.c(this.a.bb, this.a.aZ, (float)this.a.aa());
   }

   private void d() {
      int $$0 = this.e - 10;
      float $$1 = axw.a((float)$$0 / 10.0F, 0.0F, 1.0F);
      float $$2 = (float)this.a.aa() * (1.0F - $$1);
      this.a.aZ = axw.c(this.a.aZ, this.a.bb, $$2);
   }

   private boolean e() {
      return !(this.a.cR() instanceof brg);
   }

   private boolean f() {
      double $$0 = this.a.ds() - this.a.L;
      double $$1 = this.a.dy() - this.a.N;
      return $$0 * $$0 + $$1 * $$1 > 2.5000003E-7F;
   }
}
