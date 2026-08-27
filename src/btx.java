public class btx extends btb {
   private final bzr a;
   private int b;

   public btx(bzr $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void c() {
      this.a.gJ();
      this.h();
   }

   private void h() {
      arl $$0 = this.a.gI();
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
      if (this.b > 0 && this.a.eg().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.eY() && this.a.eg().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(bzr $$0) {
      this.b = -$$0.gP();
   }

   @Override
   public boolean T_() {
      return true;
   }
}
