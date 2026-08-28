public class ccd extends cbh {
   private final cie a;
   private int b;

   public ccd(cie $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void d() {
      this.a.gW();
      this.h();
   }

   private void h() {
      awd $$0 = this.a.gV();
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

   private void a(cie $$0) {
      this.b = -$$0.ha();
   }

   @Override
   public boolean T_() {
      return true;
   }
}
