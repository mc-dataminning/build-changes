public class amq extends anb {
   public static final int a = 5;
   public static final int b = 120500;
   private boolean e;
   private boolean f;
   private int g;
   private int h;

   public amq(ana $$0) {
      super($$0);
   }

   @Override
   public void a() {
      super.a();
      this.h++;
      long $$0 = this.c.X();
      long $$1 = $$0 / 24000L + 1L;
      if (!this.e && this.h > 20) {
         this.e = true;
         this.d.c.b(new aac(aac.f, 0.0F));
      }

      this.f = $$0 > 120500L;
      if (this.f) {
         this.g++;
      }

      if ($$0 % 24000L == 500L) {
         if ($$1 <= 6L) {
            if ($$1 == 6L) {
               this.d.c.b(new aac(aac.f, 104.0F));
            } else {
               this.d.a(vd.c("demo.day." + $$1));
            }
         }
      } else if ($$1 == 1L) {
         if ($$0 == 100L) {
            this.d.c.b(new aac(aac.f, 101.0F));
         } else if ($$0 == 175L) {
            this.d.c.b(new aac(aac.f, 102.0F));
         } else if ($$0 == 250L) {
            this.d.c.b(new aac(aac.f, 103.0F));
         }
      } else if ($$1 == 5L && $$0 % 24000L == 22000L) {
         this.d.a(vd.c("demo.day.warning"));
      }
   }

   private void f() {
      if (this.g > 100) {
         this.d.a(vd.c("demo.reminder"));
         this.g = 0;
      }
   }

   @Override
   public void a(hx $$0, aej.a $$1, ic $$2, int $$3, int $$4) {
      if (this.f) {
         this.f();
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public bjv a(ana $$0, cti $$1, cmr $$2, bju $$3) {
      if (this.f) {
         this.f();
         return bjv.d;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public bjv a(ana $$0, cti $$1, cmr $$2, bju $$3, eli $$4) {
      if (this.f) {
         this.f();
         return bjv.d;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
