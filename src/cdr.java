public class cdr extends ccv {
   private final cjs a;
   private int b;

   public cdr(cjs $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void d() {
      this.a.gU();
      this.h();
   }

   private void h() {
      awu $$0 = this.a.gT();
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
      if (this.b > 0 && this.a.dZ().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.fi() && this.a.dZ().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(cjs $$0) {
      this.b = -$$0.gY();
   }

   @Override
   public boolean V_() {
      return true;
   }
}
