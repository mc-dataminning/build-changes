public class cfm extends ceq {
   private final clt a;
   private int b;

   public cfm(clt $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void d() {
      this.a.gZ();
      this.h();
   }

   private void h() {
      awo $$0 = this.a.gY();
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
      if (this.b > 0 && this.a.dY().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.fg() && this.a.dY().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(clt $$0) {
      this.b = -$$0.hd();
   }

   @Override
   public boolean V_() {
      return true;
   }
}
