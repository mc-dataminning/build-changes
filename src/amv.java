public class amv extends ang {
   public static final int a = 5;
   public static final int b = 120500;
   private boolean e;
   private boolean f;
   private int g;
   private int h;

   public amv(anf $$0) {
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
         this.d.c.b(new aag(aag.f, 0.0F));
      }

      this.f = $$0 > 120500L;
      if (this.f) {
         this.g++;
      }

      if ($$0 % 24000L == 500L) {
         if ($$1 <= 6L) {
            if ($$1 == 6L) {
               this.d.c.b(new aag(aag.f, 104.0F));
            } else {
               this.d.a(vg.c("demo.day." + $$1));
            }
         }
      } else if ($$1 == 1L) {
         if ($$0 == 100L) {
            this.d.c.b(new aag(aag.f, 101.0F));
         } else if ($$0 == 175L) {
            this.d.c.b(new aag(aag.f, 102.0F));
         } else if ($$0 == 250L) {
            this.d.c.b(new aag(aag.f, 103.0F));
         }
      } else if ($$1 == 5L && $$0 % 24000L == 22000L) {
         this.d.a(vg.c("demo.day.warning"));
      }
   }

   private void f() {
      if (this.g > 100) {
         this.d.a(vg.c("demo.reminder"));
         this.g = 0;
      }
   }

   @Override
   public void a(hx $$0, aen.a $$1, ic $$2, int $$3, int $$4) {
      if (this.f) {
         this.f();
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public bkc a(anf $$0, ctx $$1, cng $$2, bkb $$3) {
      if (this.f) {
         this.f();
         return bkc.d;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public bkc a(anf $$0, ctx $$1, cng $$2, bkb $$3, ely $$4) {
      if (this.f) {
         this.f();
         return bkc.d;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
