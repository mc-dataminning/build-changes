public class cah extends bzl {
   private final cgi a;
   private int b;

   public cah(cgi $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void c() {
      this.a.hc();
      this.h();
   }

   private void h() {
      avn $$0 = this.a.hb();
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
      if (this.b > 0 && this.a.et().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.fp() && this.a.et().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(cgi $$0) {
      this.b = -$$0.hg();
   }

   @Override
   public boolean S_() {
      return true;
   }
}
