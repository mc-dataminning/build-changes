public class bwq extends bvu {
   private final cco a;
   private int b;

   public bwq(cco $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void c() {
      this.a.gQ();
      this.h();
   }

   private void h() {
      ato $$0 = this.a.gP();
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
      if (this.b > 0 && this.a.ef().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.fa() && this.a.ef().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(cco $$0) {
      this.b = -$$0.gU();
   }

   @Override
   public boolean T_() {
      return true;
   }
}
