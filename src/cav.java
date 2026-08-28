public class cav extends bzz {
   private final cgv a;
   private int b;

   public cav(cgv $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void c() {
      this.a.gS();
      this.h();
   }

   private void h() {
      avg $$0 = this.a.gR();
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
      if (this.b > 0 && this.a.dT().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.fd() && this.a.dT().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(cgv $$0) {
      this.b = -$$0.gW();
   }

   @Override
   public boolean R_() {
      return true;
   }
}
