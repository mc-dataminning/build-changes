public class bqs extends bpw {
   private final bwl a;
   private int b;

   public bqs(bwl $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void c() {
      this.a.gF();
      this.h();
   }

   private void h() {
      aoy $$0 = this.a.gE();
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

   private void a(bwl $$0) {
      this.b = -$$0.gL();
   }

   @Override
   public boolean K_() {
      return true;
   }
}
