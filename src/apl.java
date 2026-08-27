public class apl extends apw {
   public static final int a = 5;
   public static final int b = 120500;
   private boolean e;
   private boolean f;
   private int g;
   private int h;

   public apl(apv $$0) {
      super($$0);
   }

   @Override
   public void a() {
      super.a();
      this.h++;
      long $$0 = this.c.Y();
      long $$1 = $$0 / 24000L + 1L;
      if (!this.e && this.h > 20) {
         this.e = true;
         this.d.d.b(new ach(ach.g, 0.0F));
      }

      this.f = $$0 > 120500L;
      if (this.f) {
         this.g++;
      }

      if ($$0 % 24000L == 500L) {
         if ($$1 <= 6L) {
            if ($$1 == 6L) {
               this.d.d.b(new ach(ach.g, 104.0F));
            } else {
               this.d.a(wi.c("demo.day." + $$1));
            }
         }
      } else if ($$1 == 1L) {
         if ($$0 == 100L) {
            this.d.d.b(new ach(ach.g, 101.0F));
         } else if ($$0 == 175L) {
            this.d.d.b(new ach(ach.g, 102.0F));
         } else if ($$0 == 250L) {
            this.d.d.b(new ach(ach.g, 103.0F));
         }
      } else if ($$1 == 5L && $$0 % 24000L == 22000L) {
         this.d.a(wi.c("demo.day.warning"));
      }
   }

   private void f() {
      if (this.g > 100) {
         this.d.a(wi.c("demo.reminder"));
         this.g = 0;
      }
   }

   @Override
   public void a(id $$0, agq.a $$1, ij $$2, int $$3, int $$4) {
      if (this.f) {
         this.f();
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public bof a(apv $$0, czg $$1, crs $$2, boe $$3) {
      if (this.f) {
         this.f();
         return bof.d;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public bof a(apv $$0, czg $$1, crs $$2, boe $$3, esf $$4) {
      if (this.f) {
         this.f();
         return bof.d;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
