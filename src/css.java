public class css {
   private int a = 20;
   private float b = 5.0F;
   private float c;
   private int d;

   private void b(int $$0, float $$1) {
      this.a = ayz.a($$0 + this.a, 0, 20);
      this.b = ayz.a($$1 + this.b, 0.0F, (float)this.a);
   }

   public void a(int $$0, float $$1) {
      this.b($$0, csr.a($$0, $$1));
   }

   public void a(cst $$0) {
      this.b($$0.a(), $$0.b());
   }

   public void a(are $$0) {
      ard $$1 = $$0.y();
      bsv $$2 = $$1.an();
      if (this.c > 4.0F) {
         this.c -= 4.0F;
         if (this.b > 0.0F) {
            this.b = Math.max(this.b - 1.0F, 0.0F);
         } else if ($$2 != bsv.a) {
            this.a = Math.max(this.a - 1, 0);
         }
      }

      boolean $$3 = $$1.O().b(dgv.k);
      if ($$3 && this.b > 0.0F && $$0.gx() && this.a >= 20) {
         this.d++;
         if (this.d >= 10) {
            float $$4 = Math.min(this.b, 6.0F);
            $$0.c($$4 / 6.0F);
            this.a($$4);
            this.d = 0;
         }
      } else if ($$3 && this.a >= 18 && $$0.gx()) {
         this.d++;
         if (this.d >= 80) {
            $$0.c(1.0F);
            this.a(6.0F);
            this.d = 0;
         }
      } else if (this.a <= 0) {
         this.d++;
         if (this.d >= 80) {
            if ($$0.eE() > 10.0F || $$2 == bsv.d || $$0.eE() > 1.0F && $$2 == bsv.c) {
               $$0.a($$1, $$0.dV().j(), 1.0F);
            }

            this.d = 0;
         }
      } else {
         this.d = 0;
      }
   }

   public void a(tq $$0) {
      if ($$0.b("foodLevel", 99)) {
         this.a = $$0.h("foodLevel");
         this.d = $$0.h("foodTickTimer");
         this.b = $$0.j("foodSaturationLevel");
         this.c = $$0.j("foodExhaustionLevel");
      }
   }

   public void b(tq $$0) {
      $$0.a("foodLevel", this.a);
      $$0.a("foodTickTimer", this.d);
      $$0.a("foodSaturationLevel", this.b);
      $$0.a("foodExhaustionLevel", this.c);
   }

   public int a() {
      return this.a;
   }

   public boolean b() {
      return this.a < 20;
   }

   public void a(float $$0) {
      this.c = Math.min(this.c + $$0, 40.0F);
   }

   public float c() {
      return this.b;
   }

   public void a(int $$0) {
      this.a = $$0;
   }

   public void b(float $$0) {
      this.b = $$0;
   }
}
