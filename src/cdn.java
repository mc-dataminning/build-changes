import java.util.EnumSet;

public class cdn extends cce {
   private final cod a;

   public cdn(cod $$0) {
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
         cox $$0 = this.a.gp();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.cd != null;
         }
      }
   }

   @Override
   public void d() {
      this.a.L().m();
   }

   @Override
   public void e() {
      this.a.a(null);
   }
}
