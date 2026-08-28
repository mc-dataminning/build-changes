public class cfb extends cef {
   private final cll a;
   private int b;

   public cfb(cll $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void d() {
      this.a.gY();
      this.h();
   }

   private void h() {
      awm $$0 = this.a.gX();
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
      if (this.b > 0 && this.a.dX().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.ff() && this.a.dX().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(cll $$0) {
      this.b = -$$0.hc();
   }

   @Override
   public boolean R_() {
      return true;
   }
}
