import java.util.EnumSet;

public class bxu extends bwl {
   private final cia a;

   public bxu(cia $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bwl.a.c, bwl.a.a));
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
         cis $$0 = this.a.gn();
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
