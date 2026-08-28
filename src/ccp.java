public class ccp extends cbt {
   private final ciq a;
   private int b;

   public ccp(ciq $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void d() {
      this.a.hc();
      this.h();
   }

   private void h() {
      awj $$0 = this.a.hb();
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
      if (this.b > 0 && this.a.ea().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.fk() && this.a.ea().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(ciq $$0) {
      this.b = -$$0.hg();
   }

   @Override
   public boolean V_() {
      return true;
   }
}
