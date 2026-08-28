import java.util.EnumSet;

public class cfj extends cea {
   private final cqj a;

   public cfj(cqj $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cea.a.c, cea.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.bK()) {
         return false;
      } else if (this.a.bj()) {
         return false;
      } else if (!this.a.aJ()) {
         return false;
      } else if (this.a.T) {
         return false;
      } else {
         crc $$0 = this.a.x();
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
