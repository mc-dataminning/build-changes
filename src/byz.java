import java.util.EnumSet;

public class byz extends bxq {
   private final cji a;

   public byz(cji $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bxq.a.c, bxq.a.a));
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
         cka $$0 = this.a.gn();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.ca != null;
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
