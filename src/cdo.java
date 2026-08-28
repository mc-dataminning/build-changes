import java.util.EnumSet;

public class cdo extends ccf {
   private final cod a;

   public cdo(cod $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccf.a.c, ccf.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.bL()) {
         return false;
      } else if (this.a.bj()) {
         return false;
      } else if (!this.a.aJ()) {
         return false;
      } else if (this.a.T) {
         return false;
      } else {
         cox $$0 = this.a.gs();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.cd != null;
         }
      }
   }

   @Override
   public void d() {
      this.a.P().m();
   }

   @Override
   public void e() {
      this.a.a(null);
   }
}
