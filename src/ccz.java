public class ccz extends ccd {
   private final cja a;
   private int b;

   public ccz(cja $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void d() {
      this.a.gV();
      this.h();
   }

   private void h() {
      avy $$0 = this.a.gU();
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
      if (this.b > 0 && this.a.dZ().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.fi() && this.a.dZ().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(cja $$0) {
      this.b = -$$0.gZ();
   }

   @Override
   public boolean V_() {
      return true;
   }
}
