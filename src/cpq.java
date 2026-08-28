public class cpq {
   private int a = 20;
   private float b;
   private float c;
   private int d;
   private int e = 20;

   public cpq() {
      this.b = 5.0F;
   }

   private void b(int $$0, float $$1) {
      this.a = ayo.a($$0 + this.a, 0, 20);
      this.b = ayo.a($$1 + this.b, 0.0F, (float)this.a);
   }

   public void a(int $$0, float $$1) {
      this.b($$0, cpp.a($$0, $$1));
   }

   public void a(cpr $$0) {
      this.b($$0.b(), $$0.c());
   }

   public void a(cmx $$0) {
      bqo $$1 = $$0.dO().al();
      this.e = this.a;
      if (this.c > 4.0F) {
         this.c -= 4.0F;
         if (this.b > 0.0F) {
            this.b = Math.max(this.b - 1.0F, 0.0F);
         } else if ($$1 != bqo.a) {
            this.a = Math.max(this.a - 1, 0);
         }
      }

      boolean $$2 = $$0.dO().ab().b(dcs.k);
      if ($$2 && this.b > 0.0F && $$0.gj() && this.a >= 20) {
         this.d++;
         if (this.d >= 10) {
            float $$3 = Math.min(this.b, 6.0F);
            $$0.c($$3 / 6.0F);
            this.a($$3);
            this.d = 0;
         }
      } else if ($$2 && this.a >= 18 && $$0.gj()) {
         this.d++;
         if (this.d >= 80) {
            $$0.c(1.0F);
            this.a(6.0F);
            this.d = 0;
         }
      } else if (this.a <= 0) {
         this.d++;
         if (this.d >= 80) {
            if ($$0.ew() > 10.0F || $$1 == bqo.d || $$0.ew() > 1.0F && $$1 == bqo.c) {
               $$0.a($$0.dP().j(), 1.0F);
            }

            this.d = 0;
         }
      } else {
         this.d = 0;
      }
   }

   public void a(ub $$0) {
      if ($$0.b("foodLevel", 99)) {
         this.a = $$0.h("foodLevel");
         this.d = $$0.h("foodTickTimer");
         this.b = $$0.j("foodSaturationLevel");
         this.c = $$0.j("foodExhaustionLevel");
      }
   }

   public void b(ub $$0) {
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
