import java.util.EnumSet;

public class bxv extends bwm {
   private final cic a;

   public bxv(cic $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bwm.a.c, bwm.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.bA()) {
         return false;
      } else if (this.a.bc()) {
         return false;
      } else if (!this.a.aC()) {
         return false;
      } else if (this.a.T) {
         return false;
      } else {
         ciu $$0 = this.a.gn();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.bZ != null;
         }
      }
   }

   @Override
   public void c() {
      this.a.K().n();
   }

   @Override
   public void d() {
      this.a.f(null);
   }
}
