public class cdb extends ccf {
   private final cjc a;
   private int b;

   public cdb(cjc $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void d() {
      this.a.gS();
      this.h();
   }

   private void h() {
      awm $$0 = this.a.gR();
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

   private void a(cjc $$0) {
      this.b = -$$0.gW();
   }

   @Override
   public boolean T_() {
      return true;
   }
}
