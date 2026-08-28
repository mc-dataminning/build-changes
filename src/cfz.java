import java.util.EnumSet;

public class cfz extends ceq {
   private final cre a;

   public cfz(cre $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ceq.a.c, ceq.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.bJ()) {
         return false;
      } else if (this.a.bi()) {
         return false;
      } else if (!this.a.aH()) {
         return false;
      } else if (this.a.T) {
         return false;
      } else {
         crx $$0 = this.a.x();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.bR != null;
         }
      }
   }

   @Override
   public void d() {
      this.a.O().m();
   }

   @Override
   public void e() {
      this.a.a(null);
   }
}
