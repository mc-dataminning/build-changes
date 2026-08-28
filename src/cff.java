import java.util.EnumSet;

public class cff extends cea {
   private final bya a;

   public cff(bya $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cea.a.c, cea.a.a));
   }

   @Override
   public boolean c() {
      return this.a.gr();
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.gr();
      if (!$$0 && !this.a.q()) {
         return false;
      } else if (this.a.bj()) {
         return false;
      } else if (!this.a.aJ()) {
         return false;
      } else {
         bxe $$1 = this.a.e();
         if ($$1 == null) {
            return true;
         } else {
            return this.a.g((bwf)$$1) < 144.0 && $$1.er() != null ? false : $$0;
         }
      }
   }

   @Override
   public void d() {
      this.a.O().m();
      this.a.x(true);
   }

   @Override
   public void e() {
      this.a.x(false);
   }
}
