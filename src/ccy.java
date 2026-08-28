public class ccy extends ccc {
   private final ciz a;
   private int b;

   public ccy(ciz $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void d() {
      this.a.hc();
      this.h();
   }

   private void h() {
      awn $$0 = this.a.hb();
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
      if (this.b > 0 && this.a.eb().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.fl() && this.a.eb().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(ciz $$0) {
      this.b = -$$0.hg();
   }

   @Override
   public boolean V_() {
      return true;
   }
}
