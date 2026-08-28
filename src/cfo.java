import java.util.EnumSet;

public class cfo extends cef {
   private final cqt a;

   public cfo(cqt $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cef.a.c, cef.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.bI()) {
         return false;
      } else if (this.a.bh()) {
         return false;
      } else if (!this.a.aH()) {
         return false;
      } else if (this.a.T) {
         return false;
      } else {
         crm $$0 = this.a.x();
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
