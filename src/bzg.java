import java.util.Optional;

public class bzg implements caj {
   private final bwf a;
   private final boolean b;

   public bzg(bwf $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public feq a() {
      return this.b ? this.a.dt().b(0.0, (double)this.a.cS(), 0.0) : this.a.dt();
   }

   @Override
   public iu b() {
      return this.a.dv();
   }

   @Override
   public boolean a(bxe $$0) {
      if (this.a instanceof bxe $$1) {
         if (!$$1.bK()) {
            return false;
         } else {
            Optional<cgi> $$3 = $$0.ec().c(cgg.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bwf c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
