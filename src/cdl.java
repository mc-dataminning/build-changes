import java.util.EnumSet;

public class cdl extends ccc {
   private final cnx a;

   public cdl(cnx $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccc.a.c, ccc.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.bN()) {
         return false;
      } else if (this.a.bl()) {
         return false;
      } else if (!this.a.aL()) {
         return false;
      } else if (this.a.U) {
         return false;
      } else {
         cor $$0 = this.a.gv();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.cd != null;
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
