public class arn extends asd {
   public static final int a = 5;
   public static final int b = 120500;
   private boolean e;
   private boolean f;
   private int g;
   private int h;

   public arn(asc $$0) {
      super($$0);
   }

   @Override
   public void a() {
      super.a();
      this.h++;
      long $$0 = this.c.ae();
      long $$1 = $$0 / 24000L + 1L;
      if (!this.e && this.h > 20) {
         this.e = true;
         this.d.f.b(new adm(adm.g, 0.0F));
      }

      this.f = $$0 > 120500L;
      if (this.f) {
         this.g++;
      }

      if ($$0 % 24000L == 500L) {
         if ($$1 <= 6L) {
            if ($$1 == 6L) {
               this.d.f.b(new adm(adm.g, 104.0F));
            } else {
               this.d.a(xg.c("demo.day." + $$1));
            }
         }
      } else if ($$1 == 1L) {
         if ($$0 == 100L) {
            this.d.f.b(new adm(adm.g, 101.0F));
         } else if ($$0 == 175L) {
            this.d.f.b(new adm(adm.g, 102.0F));
         } else if ($$0 == 250L) {
            this.d.f.b(new adm(adm.g, 103.0F));
         }
      } else if ($$1 == 5L && $$0 % 24000L == 22000L) {
         this.d.a(xg.c("demo.day.warning"));
      }
   }

   private void f() {
      if (this.g > 100) {
         this.d.a(xg.c("demo.reminder"));
         this.g = 0;
      }
   }

   @Override
   public void a(iw $$0, aig.a $$1, jc $$2, int $$3, int $$4) {
      if (this.f) {
         this.f();
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public bvc a(asc $$0, dkj $$1, dak $$2, bvb $$3) {
      if (this.f) {
         this.f();
         return bvc.e;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public bvc a(asc $$0, dkj $$1, dak $$2, bvb $$3, ffy $$4) {
      if (this.f) {
         this.f();
         return bvc.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
