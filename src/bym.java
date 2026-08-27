public class bym implements byn {
   private final bss a;
   private static final int b = 15;
   private static final int c = 10;
   private static final int d = 10;
   private int e;
   private float f;

   public bym(bss $$0) {
      this.a = $$0;
   }

   public void a() {
      if (this.f()) {
         this.a.aY = this.a.dF();
         this.c();
         this.f = this.a.ba;
         this.e = 0;
      } else {
         if (this.e()) {
            if (Math.abs(this.a.ba - this.f) > 15.0F) {
               this.e = 0;
               this.f = this.a.ba;
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
      this.a.aY = ayf.c(this.a.aY, this.a.ba, (float)this.a.aa());
   }

   private void c() {
      this.a.ba = ayf.c(this.a.ba, this.a.aY, (float)this.a.aa());
   }

   private void d() {
      int $$0 = this.e - 10;
      float $$1 = ayf.a((float)$$0 / 10.0F, 0.0F, 1.0F);
      float $$2 = (float)this.a.aa() * (1.0F - $$1);
      this.a.aY = ayf.c(this.a.aY, this.a.ba, $$2);
   }

   private boolean e() {
      return !(this.a.cT() instanceof bss);
   }

   private boolean f() {
      double $$0 = this.a.du() - this.a.L;
      double $$1 = this.a.dA() - this.a.N;
      return $$0 * $$0 + $$1 * $$1 > 2.5000003E-7F;
   }
}
