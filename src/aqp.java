public class aqp extends arf {
   public static final int a = 5;
   public static final int b = 120500;
   private boolean e;
   private boolean f;
   private int g;
   private int h;

   public aqp(are $$0) {
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
         this.d.f.b(new acs(acs.g, 0.0F));
      }

      this.f = $$0 > 120500L;
      if (this.f) {
         this.g++;
      }

      if ($$0 % 24000L == 500L) {
         if ($$1 <= 6L) {
            if ($$1 == 6L) {
               this.d.f.b(new acs(acs.g, 104.0F));
            } else {
               this.d.a(wp.c("demo.day." + $$1));
            }
         }
      } else if ($$1 == 1L) {
         if ($$0 == 100L) {
            this.d.f.b(new acs(acs.g, 101.0F));
         } else if ($$0 == 175L) {
            this.d.f.b(new acs(acs.g, 102.0F));
         } else if ($$0 == 250L) {
            this.d.f.b(new acs(acs.g, 103.0F));
         }
      } else if ($$1 == 5L && $$0 % 24000L == 22000L) {
         this.d.a(wp.c("demo.day.warning"));
      }
   }

   private void f() {
      if (this.g > 100) {
         this.d.a(wp.c("demo.reminder"));
         this.g = 0;
      }
   }

   @Override
   public void a(ji $$0, ahl.a $$1, jn $$2, int $$3, int $$4) {
      if (this.f) {
         this.f();
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public bsy a(are $$0, dgz $$1, cxh $$2, bsx $$3) {
      if (this.f) {
         this.f();
         return bsy.e;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public bsy a(are $$0, dgz $$1, cxh $$2, bsx $$3, fbt $$4) {
      if (this.f) {
         this.f();
         return bsy.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
