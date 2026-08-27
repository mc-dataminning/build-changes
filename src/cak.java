public class cak extends bzo {
   private final cgk a;
   private int b;

   public cak(cgk $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void c() {
      this.a.gT();
      this.h();
   }

   private void h() {
      avh $$0 = this.a.gS();
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
      if (this.b > 0 && this.a.el().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.fg() && this.a.el().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(cgk $$0) {
      this.b = -$$0.gX();
   }

   @Override
   public boolean R_() {
      return true;
   }
}
