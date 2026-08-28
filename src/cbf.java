import java.util.EnumSet;

public class cbf extends caa {
   private final btz a;

   public cbf(btz $$0) {
      this.a = $$0;
      this.a(EnumSet.of(caa.a.c, caa.a.a));
   }

   @Override
   public boolean b() {
      return this.a.gn();
   }

   @Override
   public boolean a() {
      if (!this.a.s()) {
         return false;
      } else if (this.a.bj()) {
         return false;
      } else if (!this.a.aG()) {
         return false;
      } else {
         btc $$0 = this.a.P_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((bsh)$$0) < 144.0 && $$0.ek() != null ? false : this.a.gn();
         }
      }
   }

   @Override
   public void c() {
      this.a.J().n();
      this.a.x(true);
   }

   @Override
   public void d() {
      this.a.x(false);
   }
}
