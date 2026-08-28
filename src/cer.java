public class cer extends cdv {
   private final ckx a;
   private int b;

   public cer(ckx $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void d() {
      this.a.gV();
      this.h();
   }

   private void h() {
      awk $$0 = this.a.gU();
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
         return !this.a.ff() && this.a.dY().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(ckx $$0) {
      this.b = -$$0.gZ();
   }

   @Override
   public boolean Q_() {
      return true;
   }
}
