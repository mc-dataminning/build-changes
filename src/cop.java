public class cop {
   private int a = 20;
   private float b;
   private float c;
   private int d;
   private int e = 20;

   public cop() {
      this.b = 5.0F;
   }

   public void a(int $$0, float $$1) {
      this.a = Math.min($$0 + this.a, 20);
      this.b = Math.min(this.b + (float)$$0 * $$1 * 2.0F, (float)this.a);
   }

   public void a(cto $$0) {
      coq $$1 = $$0.a(kb.u);
      if ($$1 != null) {
         this.a($$1.b(), $$1.c());
      }
   }

   public void a(clw $$0) {
      bpr $$1 = $$0.dP().ak();
      this.e = this.a;
      if (this.c > 4.0F) {
         this.c -= 4.0F;
         if (this.b > 0.0F) {
            this.b = Math.max(this.b - 1.0F, 0.0F);
         } else if ($$1 != bpr.a) {
            this.a = Math.max(this.a - 1, 0);
         }
      }

      boolean $$2 = $$0.dP().aa().b(dat.k);
      if ($$2 && this.b > 0.0F && $$0.gn() && this.a >= 20) {
         this.d++;
         if (this.d >= 10) {
            float $$3 = Math.min(this.b, 6.0F);
            $$0.c($$3 / 6.0F);
            this.a($$3);
            this.d = 0;
         }
      } else if ($$2 && this.a >= 18 && $$0.gn()) {
         this.d++;
         if (this.d >= 80) {
            $$0.c(1.0F);
            this.a(6.0F);
            this.d = 0;
         }
      } else if (this.a <= 0) {
         this.d++;
         if (this.d >= 80) {
            if ($$0.eA() > 10.0F || $$1 == bpr.d || $$0.eA() > 1.0F && $$1 == bpr.c) {
               $$0.a($$0.dQ().i(), 1.0F);
            }

            this.d = 0;
         }
      } else {
         this.d = 0;
      }
   }

   public void a(ud $$0) {
      if ($$0.b("foodLevel", 99)) {
         this.a = $$0.h("foodLevel");
         this.d = $$0.h("foodTickTimer");
         this.b = $$0.j("foodSaturationLevel");
         this.c = $$0.j("foodExhaustionLevel");
      }
   }

   public void b(ud $$0) {
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
