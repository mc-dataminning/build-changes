public class bsp extends brt {
   private final byi a;
   private int b;

   public bsp(byi $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void c() {
      this.a.gJ();
      this.h();
   }

   private void h() {
      aqm $$0 = this.a.gI();
      if ($$0 != null) {
         this.a.a($$0);
      }
   }

   @Override
   public boolean b() {
      return false;
   }

   @Override
   public boolean a() {
      this.b++;
      if (this.b > 0 && this.a.ef().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.eX() && this.a.ef().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(byi $$0) {
      this.b = -$$0.gP();
   }

   @Override
   public boolean R_() {
      return true;
   }
}
