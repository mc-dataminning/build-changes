public class cbg extends cak {
   private final chg a;
   private int b;

   public cbg(chg $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void d() {
      this.a.gQ();
      this.h();
   }

   private void h() {
      avn $$0 = this.a.gP();
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
      if (this.b > 0 && this.a.dT().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.fd() && this.a.dT().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(chg $$0) {
      this.b = -$$0.gU();
   }

   @Override
   public boolean R_() {
      return true;
   }
}
