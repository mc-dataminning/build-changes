import java.util.EnumSet;

public class cdp extends ccg {
   private final coe a;

   public cdp(coe $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccg.a.c, ccg.a.a));
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
         coy $$0 = this.a.gs();
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
