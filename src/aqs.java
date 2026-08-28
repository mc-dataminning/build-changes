public class aqs extends ard {
   public static final int a = 5;
   public static final int b = 120500;
   private boolean e;
   private boolean f;
   private int g;
   private int h;

   public aqs(arc $$0) {
      super($$0);
   }

   @Override
   public void a() {
      super.a();
      this.h++;
      long $$0 = this.c.Z();
      long $$1 = $$0 / 24000L + 1L;
      if (!this.e && this.h > 20) {
         this.e = true;
         this.d.c.b(new adl(adl.g, 0.0F));
      }

      this.f = $$0 > 120500L;
      if (this.f) {
         this.g++;
      }

      if ($$0 % 24000L == 500L) {
         if ($$1 <= 6L) {
            if ($$1 == 6L) {
               this.d.c.b(new adl(adl.g, 104.0F));
            } else {
               this.d.a(xl.c("demo.day." + $$1));
            }
         }
      } else if ($$1 == 1L) {
         if ($$0 == 100L) {
            this.d.c.b(new adl(adl.g, 101.0F));
         } else if ($$0 == 175L) {
            this.d.c.b(new adl(adl.g, 102.0F));
         } else if ($$0 == 250L) {
            this.d.c.b(new adl(adl.g, 103.0F));
         }
      } else if ($$1 == 5L && $$0 % 24000L == 22000L) {
         this.d.a(xl.c("demo.day.warning"));
      }
   }

   private void f() {
      if (this.g > 100) {
         this.d.a(xl.c("demo.reminder"));
         this.g = 0;
      }
   }

   @Override
   public void a(iz $$0, ahw.a $$1, je $$2, int $$3, int $$4) {
      if (this.f) {
         this.f();
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public bqp a(arc $$0, dbt $$1, cuk $$2, bqo $$3) {
      if (this.f) {
         this.f();
         return bqp.e;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public bqp a(arc $$0, dbt $$1, cuk $$2, bqo $$3, evi $$4) {
      if (this.f) {
         this.f();
         return bqp.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
