import java.util.EnumSet;

public class ccl extends cbc {
   private final cmx a;

   public ccl(cmx $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cbc.a.c, cbc.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.bI()) {
         return false;
      } else if (this.a.bi()) {
         return false;
      } else if (!this.a.aH()) {
         return false;
      } else if (this.a.U) {
         return false;
      } else {
         cnp $$0 = this.a.go();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.ca != null;
         }
      }
   }

   @Override
   public void d() {
      this.a.P().o();
   }

   @Override
   public void e() {
      this.a.a(null);
   }
}
