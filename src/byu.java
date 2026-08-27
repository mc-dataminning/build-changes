import java.util.EnumSet;

public class byu extends bxl {
   private final cjb a;

   public byu(cjb $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bxl.a.c, bxl.a.a));
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
         cjt $$0 = this.a.gn();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.bY != null;
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
