public class akb extends akm {
   public static final int a = 5;
   public static final int b = 120500;
   private boolean e;
   private boolean f;
   private int g;
   private int h;

   public akb(akl $$0) {
      super($$0);
   }

   @Override
   public void a() {
      super.a();
      this.h++;
      long $$0 = this.c.V();
      long $$1 = $$0 / 24000L + 1L;
      if (!this.e && this.h > 20) {
         this.e = true;
         this.d.c.b(new xv(xv.f, 0.0F));
      }

      this.f = $$0 > 120500L;
      if (this.f) {
         this.g++;
      }

      if ($$0 % 24000L == 500L) {
         if ($$1 <= 6L) {
            if ($$1 == 6L) {
               this.d.c.b(new xv(xv.f, 104.0F));
            } else {
               this.d.a(tf.c("demo.day." + $$1));
            }
         }
      } else if ($$1 == 1L) {
         if ($$0 == 100L) {
            this.d.c.b(new xv(xv.f, 101.0F));
         } else if ($$0 == 175L) {
            this.d.c.b(new xv(xv.f, 102.0F));
         } else if ($$0 == 250L) {
            this.d.c.b(new xv(xv.f, 103.0F));
         }
      } else if ($$1 == 5L && $$0 % 24000L == 22000L) {
         this.d.a(tf.c("demo.day.warning"));
      }
   }

   private void f() {
      if (this.g > 100) {
         this.d.a(tf.c("demo.reminder"));
         this.g = 0;
      }
   }

   @Override
   public void a(gu $$0, abz.a $$1, ha $$2, int $$3, int $$4) {
      if (this.f) {
         this.f();
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public bgq a(akl $$0, cpm $$1, ciy $$2, bgp $$3) {
      if (this.f) {
         this.f();
         return bgq.d;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public bgq a(akl $$0, cpm $$1, ciy $$2, bgp $$3, eha $$4) {
      if (this.f) {
         this.f();
         return bgq.d;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
