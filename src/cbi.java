public class cbi extends cam {
   private final chi a;
   private int b;

   public cbi(chi $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void d() {
      this.a.gQ();
      this.h();
   }

   private void h() {
      avo $$0 = this.a.gP();
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
      if (this.b > 0 && this.a.dS().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.fd() && this.a.dS().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(chi $$0) {
      this.b = -$$0.gU();
   }

   @Override
   public boolean V_() {
      return true;
   }
}
