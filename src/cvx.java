public class cvx {
   private static final int a = 0;
   private static final float b = 0.0F;
   private int c = 20;
   private float d = 5.0F;
   private float e;
   private int f;

   private void b(int $$0, float $$1) {
      this.c = azz.a($$0 + this.c, 0, 20);
      this.d = azz.a($$1 + this.d, 0.0F, (float)this.c);
   }

   public void a(int $$0, float $$1) {
      this.b($$0, cvw.a($$0, $$1));
   }

   public void a(cvy $$0) {
      this.b($$0.a(), $$0.b());
   }

   public void a(asc $$0) {
      asb $$1 = $$0.y();
      buz $$2 = $$1.an();
      if (this.e > 4.0F) {
         this.e -= 4.0F;
         if (this.d > 0.0F) {
            this.d = Math.max(this.d - 1.0F, 0.0F);
         } else if ($$2 != buz.a) {
            this.c = Math.max(this.c - 1, 0);
         }
      }

      boolean $$3 = $$1.O().c(dkf.l);
      if ($$3 && this.d > 0.0F && $$0.gv() && this.c >= 20) {
         this.f++;
         if (this.f >= 10) {
            float $$4 = Math.min(this.d, 6.0F);
            $$0.c($$4 / 6.0F);
            this.a($$4);
            this.f = 0;
         }
      } else if ($$3 && this.c >= 18 && $$0.gv()) {
         this.f++;
         if (this.f >= 80) {
            $$0.c(1.0F);
            this.a(6.0F);
            this.f = 0;
         }
      } else if (this.c <= 0) {
         this.f++;
         if (this.f >= 80) {
            if ($$0.eG() > 10.0F || $$2 == buz.d || $$0.eG() > 1.0F && $$2 == buz.c) {
               $$0.a($$1, $$0.dW().j(), 1.0F);
            }

            this.f = 0;
         }
      } else {
         this.f = 0;
      }
   }

   public void a(ua $$0) {
      this.c = $$0.b("foodLevel", 20);
      this.f = $$0.b("foodTickTimer", 0);
      this.d = $$0.b("foodSaturationLevel", 5.0F);
      this.e = $$0.b("foodExhaustionLevel", 0.0F);
   }

   public void b(ua $$0) {
      $$0.a("foodLevel", this.c);
      $$0.a("foodTickTimer", this.f);
      $$0.a("foodSaturationLevel", this.d);
      $$0.a("foodExhaustionLevel", this.e);
   }

   public int a() {
      return this.c;
   }

   public boolean b() {
      return this.c < 20;
   }

   public void a(float $$0) {
      this.e = Math.min(this.e + $$0, 40.0F);
   }

   public float c() {
      return this.d;
   }

   public void a(int $$0) {
      this.c = $$0;
   }

   public void b(float $$0) {
      this.d = $$0;
   }
}
