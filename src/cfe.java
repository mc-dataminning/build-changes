import java.util.EnumSet;

public class cfe extends cdv {
   private final cpz a;

   public cfe(cpz $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cdv.a.c, cdv.a.a));
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
         cqs $$0 = this.a.x();
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
