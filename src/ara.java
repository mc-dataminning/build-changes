public class ara extends arq {
   public static final int a = 5;
   public static final int b = 120500;
   private boolean e;
   private boolean f;
   private int g;
   private int h;

   public ara(arp $$0) {
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
         this.d.f.b(new acz(acz.g, 0.0F));
      }

      this.f = $$0 > 120500L;
      if (this.f) {
         this.g++;
      }

      if ($$0 % 24000L == 500L) {
         if ($$1 <= 6L) {
            if ($$1 == 6L) {
               this.d.f.b(new acz(acz.g, 104.0F));
            } else {
               this.d.a(ww.c("demo.day." + $$1));
            }
         }
      } else if ($$1 == 1L) {
         if ($$0 == 100L) {
            this.d.f.b(new acz(acz.g, 101.0F));
         } else if ($$0 == 175L) {
            this.d.f.b(new acz(acz.g, 102.0F));
         } else if ($$0 == 250L) {
            this.d.f.b(new acz(acz.g, 103.0F));
         }
      } else if ($$1 == 5L && $$0 % 24000L == 22000L) {
         this.d.a(ww.c("demo.day.warning"));
      }
   }

   private void f() {
      if (this.g > 100) {
         this.d.a(ww.c("demo.reminder"));
         this.g = 0;
      }
   }

   @Override
   public void a(iu $$0, aht.a $$1, ja $$2, int $$3, int $$4) {
      if (this.f) {
         this.f();
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public bty a(arp $$0, dip $$1, cys $$2, btx $$3) {
      if (this.f) {
         this.f();
         return bty.e;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public bty a(arp $$0, dip $$1, cys $$2, btx $$3, fds $$4) {
      if (this.f) {
         this.f();
         return bty.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
