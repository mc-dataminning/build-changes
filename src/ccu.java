public class ccu extends cby {
   private final civ a;
   private int b;

   public ccu(civ $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void d() {
      this.a.hb();
      this.h();
   }

   private void h() {
      awk $$0 = this.a.ha();
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

   private void a(civ $$0) {
      this.b = -$$0.hf();
   }

   @Override
   public boolean V_() {
      return true;
   }
}
