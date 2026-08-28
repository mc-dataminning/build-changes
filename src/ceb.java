import java.util.EnumSet;

public class ceb extends ccw {
   private final bwv a;

   public ceb(bwv $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccw.a.c, ccw.a.a));
   }

   @Override
   public boolean c() {
      return this.a.gs();
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.gs();
      if (!$$0 && !this.a.q()) {
         return false;
      } else if (this.a.bj()) {
         return false;
      } else if (!this.a.aJ()) {
         return false;
      } else {
         bvy $$1 = this.a.ae_();
         if ($$1 == null) {
            return true;
         } else {
            return this.a.g((bva)$$1) < 144.0 && $$1.ep() != null ? false : $$0;
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
