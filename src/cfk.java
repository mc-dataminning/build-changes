import java.util.EnumSet;

public class cfk extends cef {
   private final byf a;

   public cfk(byf $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cef.a.c, cef.a.a));
   }

   @Override
   public boolean c() {
      return this.a.gt();
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.gt();
      if (!$$0 && !this.a.q()) {
         return false;
      } else if (this.a.bh()) {
         return false;
      } else if (!this.a.aH()) {
         return false;
      } else {
         bxj $$1 = this.a.e();
         if ($$1 == null) {
            return true;
         } else {
            return this.a.g((bwi)$$1) < 144.0 && $$1.eq() != null ? false : $$0;
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
