import java.util.EnumSet;

public class cfv extends ceq {
   private final byq a;

   public cfv(byq $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ceq.a.c, ceq.a.a));
   }

   @Override
   public boolean c() {
      return this.a.gu();
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.gu();
      if (!$$0 && !this.a.q()) {
         return false;
      } else if (this.a.bi()) {
         return false;
      } else if (!this.a.aH()) {
         return false;
      } else {
         bxu $$1 = this.a.e();
         if ($$1 == null) {
            return true;
         } else {
            return this.a.g((bwt)$$1) < 144.0 && $$1.er() != null ? false : $$0;
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
