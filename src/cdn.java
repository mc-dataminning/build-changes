import java.util.EnumSet;

public class cdn extends cce {
   private final coc a;

   public cdn(coc $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cce.a.c, cce.a.a));
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
         cow $$0 = this.a.gs();
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
