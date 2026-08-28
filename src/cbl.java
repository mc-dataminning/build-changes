public class cbl extends cap {
   private final chl a;
   private int b;

   public cbl(chl $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void c() {
      this.a.gU();
      this.h();
   }

   private void h() {
      avz $$0 = this.a.gT();
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

   private void a(chl $$0) {
      this.b = -$$0.gY();
   }

   @Override
   public boolean R_() {
      return true;
   }
}
