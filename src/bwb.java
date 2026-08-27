public class bwb extends bvf {
   private final cbz a;
   private int b;

   public bwb(cbz $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void c() {
      this.a.gL();
      this.h();
   }

   private void h() {
      atk $$0 = this.a.gK();
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
      if (this.b > 0 && this.a.eh().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.eY() && this.a.eh().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(cbz $$0) {
      this.b = -$$0.gR();
   }

   @Override
   public boolean T_() {
      return true;
   }
}
