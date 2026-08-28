import java.util.EnumSet;

public class cgb extends ces {
   private final crg a;

   public cgb(crg $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ces.a.c, ces.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.bJ()) {
         return false;
      } else if (this.a.bi()) {
         return false;
      } else if (!this.a.aH()) {
         return false;
      } else if (this.a.T) {
         return false;
      } else {
         crz $$0 = this.a.x();
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
