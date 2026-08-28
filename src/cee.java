import java.util.EnumSet;

public class cee extends ccv {
   private final cov a;

   public cee(cov $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccv.a.c, ccv.a.a));
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
         cpo $$0 = this.a.go();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.cd != null;
         }
      }
   }

   @Override
   public void d() {
      this.a.L().o();
   }

   @Override
   public void e() {
      this.a.a(null);
   }
}
