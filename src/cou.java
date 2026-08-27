public class cou {
   private int a = 20;
   private float b;
   private float c;
   private int d;
   private int e = 20;

   public cou() {
      this.b = 5.0F;
   }

   public void a(int $$0, float $$1) {
      this.a = Math.min($$0 + this.a, 20);
      this.b = Math.min(this.b + (float)$$0 * $$1 * 2.0F, (float)this.a);
   }

   public void a(cuh $$0) {
      cov $$1 = $$0.a(ke.t);
      if ($$1 != null) {
         this.a($$1.b(), $$1.c());
      }
   }

   public void a(cly $$0) {
      bpx $$1 = $$0.dU().al();
      this.e = this.a;
      if (this.c > 4.0F) {
         this.c -= 4.0F;
         if (this.b > 0.0F) {
            this.b = Math.max(this.b - 1.0F, 0.0F);
         } else if ($$1 != bpx.a) {
            boolean $$2 = $$0.eS();
            if (!$$2) {
               this.a = Math.max(this.a - 1, 0);
            }
         }
      }

      boolean $$3 = $$0.dU().ab().b(dbw.k);
      if ($$3 && this.b > 0.0F && $$0.gy() && this.a >= 20) {
         this.d++;
         if (this.d >= 10) {
            float $$4 = Math.min(this.b, 6.0F);
            $$0.c($$4 / 6.0F);
            this.a($$4);
            this.d = 0;
         }
      } else if ($$3 && this.a >= 18 && $$0.gy()) {
         this.d++;
         if (this.d >= 80) {
            $$0.c(1.0F);
            this.a(6.0F);
            this.d = 0;
         }
      } else if (this.a <= 0) {
         this.d++;
         if (this.d >= 80) {
            if ($$0.eI() > 10.0F || $$1 == bpx.d || $$0.eI() > 1.0F && $$1 == bpx.c) {
               $$0.a($$0.dX().j(), 1.0F);
            }

            this.d = 0;
         }
      } else {
         this.d = 0;
      }
   }

   public void a(uk $$0) {
      if ($$0.b("foodLevel", 99)) {
         this.a = $$0.h("foodLevel");
         this.d = $$0.h("foodTickTimer");
         this.b = $$0.j("foodSaturationLevel");
         this.c = $$0.j("foodExhaustionLevel");
      }
   }

   public void b(uk $$0) {
      $$0.a("foodLevel", this.a);
      $$0.a("foodTickTimer", this.d);
      $$0.a("foodSaturationLevel", this.b);
      $$0.a("foodExhaustionLevel", this.c);
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.e;
   }

   public boolean c() {
      return this.a < 20;
   }

   public void a(float $$0) {
      this.c = Math.min(this.c + $$0, 40.0F);
   }

   public float d() {
      return this.c;
   }

   public float e() {
      return this.b;
   }

   public void a(int $$0) {
      this.a = $$0;
   }

   public void b(float $$0) {
      this.b = $$0;
   }

   public void c(float $$0) {
      this.c = $$0;
   }
}
