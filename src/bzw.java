import java.util.Optional;

public class bzw implements caz {
   private final bwt a;
   private final boolean b;

   public bzw(bwt $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ffq a() {
      return this.b ? this.a.dt().b(0.0, (double)this.a.cS(), 0.0) : this.a.dt();
   }

   @Override
   public iv b() {
      return this.a.dv();
   }

   @Override
   public boolean a(bxu $$0) {
      if (this.a instanceof bxu $$1) {
         if (!$$1.bJ()) {
            return false;
         } else {
            Optional<cgy> $$3 = $$0.ec().c(cgw.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bwt c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
