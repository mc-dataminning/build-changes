public class brd extends bqh {
   private final bww a;
   private int b;

   public brd(bww $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void c() {
      this.a.gJ();
      this.h();
   }

   private void h() {
      apf $$0 = this.a.gI();
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

   private void a(bww $$0) {
      this.b = -$$0.gP();
   }

   @Override
   public boolean Q_() {
      return true;
   }
}
