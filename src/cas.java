public class cas extends bzw {
   private final cgs a;
   private int b;

   public cas(cgs $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void c() {
      this.a.gR();
      this.h();
   }

   private void h() {
      ave $$0 = this.a.gQ();
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
      if (this.b > 0 && this.a.dS().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.fc() && this.a.dS().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(cgs $$0) {
      this.b = -$$0.gV();
   }

   @Override
   public boolean R_() {
      return true;
   }
}
