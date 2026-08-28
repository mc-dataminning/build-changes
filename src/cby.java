public class cby extends cbc {
   private final chz a;
   private int b;

   public cby(chz $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void d() {
      this.a.gV();
      this.h();
   }

   private void h() {
      awc $$0 = this.a.gU();
      if ($$0 != null) {
         this.a.a($$0);
      }
   }

   @Override
   public boolean c() {
      return false;
   }

   @Override
   public boolean b() {
      this.b++;
      if (this.b > 0 && this.a.dV().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.ff() && this.a.dV().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(chz $$0) {
      this.b = -$$0.gZ();
   }

   @Override
   public boolean T_() {
      return true;
   }
}
