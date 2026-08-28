public class aqb extends aqo {
   public static final int a = 5;
   public static final int b = 120500;
   private boolean e;
   private boolean f;
   private int g;
   private int h;

   public aqb(aqn $$0) {
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
         this.d.c.b(new acu(acu.g, 0.0F));
      }

      this.f = $$0 > 120500L;
      if (this.f) {
         this.g++;
      }

      if ($$0 % 24000L == 500L) {
         if ($$1 <= 6L) {
            if ($$1 == 6L) {
               this.d.c.b(new acu(acu.g, 104.0F));
            } else {
               this.d.a(wu.c("demo.day." + $$1));
            }
         }
      } else if ($$1 == 1L) {
         if ($$0 == 100L) {
            this.d.c.b(new acu(acu.g, 101.0F));
         } else if ($$0 == 175L) {
            this.d.c.b(new acu(acu.g, 102.0F));
         } else if ($$0 == 250L) {
            this.d.c.b(new acu(acu.g, 103.0F));
         }
      } else if ($$1 == 5L && $$0 % 24000L == 22000L) {
         this.d.a(wu.c("demo.day.warning"));
      }
   }

   private void f() {
      if (this.g > 100) {
         this.d.a(wu.c("demo.reminder"));
         this.g = 0;
      }
   }

   @Override
   public void a(ja $$0, ahf.a $$1, jf $$2, int $$3, int $$4) {
      if (this.f) {
         this.f();
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public bqg a(aqn $$0, dcf $$1, cuc $$2, bqf $$3) {
      if (this.f) {
         this.f();
         return bqg.e;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public bqg a(aqn $$0, dcf $$1, cuc $$2, bqf $$3, ewb $$4) {
      if (this.f) {
         this.f();
         return bqg.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
