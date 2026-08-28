import java.util.EnumSet;

public class cfa extends cdv {
   private final bxv a;

   public cfa(bxv $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cdv.a.c, cdv.a.a));
   }

   @Override
   public boolean c() {
      return this.a.gq();
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.gq();
      if (!$$0 && !this.a.q()) {
         return false;
      } else if (this.a.bj()) {
         return false;
      } else if (!this.a.aJ()) {
         return false;
      } else {
         bwz $$1 = this.a.e();
         if ($$1 == null) {
            return true;
         } else {
            return this.a.g((bwa)$$1) < 144.0 && $$1.eq() != null ? false : $$0;
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
