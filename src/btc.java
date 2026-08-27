public class btc extends bsg {
   private final byv a;
   private int b;

   public btc(byv $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void c() {
      this.a.gK();
      this.h();
   }

   private void h() {
      aqu $$0 = this.a.gJ();
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
      if (this.b > 0 && this.a.eh().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.eZ() && this.a.eh().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(byv $$0) {
      this.b = -$$0.gQ();
   }

   @Override
   public boolean T_() {
      return true;
   }
}
