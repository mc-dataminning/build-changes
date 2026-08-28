import java.util.EnumSet;

public class ccq extends cbh {
   private final cnc a;

   public ccq(cnc $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cbh.a.c, cbh.a.a));
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
         cnu $$0 = this.a.gp();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.bZ != null;
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
