public class bpf implements bpg {
   private final bjo a;
   private static final int b = 15;
   private static final int c = 10;
   private static final int d = 10;
   private int e;
   private float f;

   public bpf(bjo $$0) {
      this.a = $$0;
   }

   public void a() {
      if (this.f()) {
         this.a.aU = this.a.dB();
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
      this.a.aU = asb.c(this.a.aU, this.a.aW, (float)this.a.Z());
   }

   private void c() {
      this.a.aW = asb.c(this.a.aW, this.a.aU, (float)this.a.Z());
   }

   private void d() {
      int $$0 = this.e - 10;
      float $$1 = asb.a((float)$$0 / 10.0F, 0.0F, 1.0F);
      float $$2 = (float)this.a.Z() * (1.0F - $$1);
      this.a.aU = asb.c(this.a.aU, this.a.aW, $$2);
   }

   private boolean e() {
      return !(this.a.cQ() instanceof bjo);
   }

   private boolean f() {
      double $$0 = this.a.dq() - this.a.K;
      double $$1 = this.a.dw() - this.a.M;
      return $$0 * $$0 + $$1 * $$1 > 2.5000003E-7F;
   }
}
