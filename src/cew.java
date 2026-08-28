public class cew extends cea {
   private final clh a;
   private int b;

   public cew(clh $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void d() {
      this.a.gW();
      this.h();
   }

   private void h() {
      awm $$0 = this.a.gV();
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

   private void a(clh $$0) {
      this.b = -$$0.ha();
   }

   @Override
   public boolean R_() {
      return true;
   }
}
