public class bnr extends bmv {
   private final btk a;
   private int b;

   public bnr(btk $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void c() {
      this.a.gD();
      this.h();
   }

   private void h() {
      amg $$0 = this.a.gC();
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
      if (this.b > 0 && this.a.ec().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.eT() && this.a.ec().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(btk $$0) {
      this.b = -$$0.gJ();
   }

   @Override
   public boolean K_() {
      return true;
   }
}
