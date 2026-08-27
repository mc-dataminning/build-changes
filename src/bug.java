public class bug extends btk {
   private final cae a;
   private int b;

   public bug(cae $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void c() {
      this.a.gK();
      this.h();
   }

   private void h() {
      ars $$0 = this.a.gJ();
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

   private void a(cae $$0) {
      this.b = -$$0.gQ();
   }

   @Override
   public boolean T_() {
      return true;
   }
}
