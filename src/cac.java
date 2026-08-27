import java.util.EnumSet;

public class cac extends byx {
   private final bsw a;

   public cac(bsw $$0) {
      this.a = $$0;
      this.a(EnumSet.of(byx.a.c, byx.a.a));
   }

   @Override
   public boolean b() {
      return this.a.gp();
   }

   @Override
   public boolean a() {
      if (!this.a.r()) {
         return false;
      } else if (this.a.bf()) {
         return false;
      } else if (!this.a.aC()) {
         return false;
      } else {
         bsa $$0 = this.a.P_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((brh)$$0) < 144.0 && $$0.ek() != null ? false : this.a.gp();
         }
      }
   }

   @Override
   public void c() {
      this.a.K().n();
      this.a.x(true);
   }

   @Override
   public void d() {
      this.a.x(false);
   }
}
