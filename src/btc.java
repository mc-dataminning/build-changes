import java.util.EnumSet;

public class btc extends brt {
   private final ccu a;

   public btc(ccu $$0) {
      this.a = $$0;
      this.a(EnumSet.of(brt.a.c, brt.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.bv()) {
         return false;
      } else if (this.a.aX()) {
         return false;
      } else if (!this.a.aA()) {
         return false;
      } else if (this.a.T) {
         return false;
      } else {
         cdm $$0 = this.a.ge();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.f($$0) > 16.0 ? false : $$0.bS != null;
         }
      }
   }

   @Override
   public void c() {
      this.a.L().n();
   }

   @Override
   public void d() {
      this.a.f(null);
   }
}
