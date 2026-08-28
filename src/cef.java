import java.util.EnumSet;

public class cef extends ccw {
   private final coy a;

   public cef(coy $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccw.a.c, ccw.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.bJ()) {
         return false;
      } else if (this.a.bj()) {
         return false;
      } else if (!this.a.aJ()) {
         return false;
      } else if (this.a.T) {
         return false;
      } else {
         cpr $$0 = this.a.x();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.bQ != null;
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
