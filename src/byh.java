public class byh extends bxl {
   private final cef a;
   private int b;

   public byh(cef $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void c() {
      this.a.gR();
      this.h();
   }

   private void h() {
      aul $$0 = this.a.gQ();
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
      if (this.b > 0 && this.a.ei().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.fd() && this.a.ei().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(cef $$0) {
      this.b = -$$0.gV();
   }

   @Override
   public boolean R_() {
      return true;
   }
}
