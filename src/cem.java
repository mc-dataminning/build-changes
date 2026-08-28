import java.util.EnumSet;

public class cem extends cdd {
   private final cpd a;

   public cem(cpd $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cdd.a.c, cdd.a.a));
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
         cpw $$0 = this.a.gm();
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
