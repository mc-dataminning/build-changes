public class bqo extends bps {
   private final bwh a;
   private int b;

   public bqo(bwh $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void c() {
      this.a.gE();
      this.h();
   }

   private void h() {
      aot $$0 = this.a.gD();
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
      if (this.b > 0 && this.a.ee().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.eW() && this.a.ee().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(bwh $$0) {
      this.b = -$$0.gK();
   }

   @Override
   public boolean K_() {
      return true;
   }
}
