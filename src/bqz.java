public class bqz extends bqd {
   private final bws a;
   private int b;

   public bqz(bws $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void c() {
      this.a.gI();
      this.h();
   }

   private void h() {
      ape $$0 = this.a.gH();
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

   private void a(bws $$0) {
      this.b = -$$0.gO();
   }

   @Override
   public boolean Q_() {
      return true;
   }
}
