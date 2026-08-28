import java.util.Optional;

public class bze implements cah {
   private final bwd a;
   private final boolean b;

   public bze(bwd $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public fei a() {
      return this.b ? this.a.dt().b(0.0, (double)this.a.cS(), 0.0) : this.a.dt();
   }

   @Override
   public iu b() {
      return this.a.dv();
   }

   @Override
   public boolean a(bxc $$0) {
      if (this.a instanceof bxc $$1) {
         if (!$$1.bK()) {
            return false;
         } else {
            Optional<cgg> $$3 = $$0.eb().c(cge.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bwd c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
