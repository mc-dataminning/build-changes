public class bym extends bxq {
   private final cem a;
   private int b;

   public bym(cem $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void c() {
      this.a.gR();
      this.h();
   }

   private void h() {
      aun $$0 = this.a.gQ();
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
      if (this.b > 0 && this.a.ei().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.fd() && this.a.ei().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(cem $$0) {
      this.b = -$$0.gV();
   }

   @Override
   public boolean R_() {
      return true;
   }
}
