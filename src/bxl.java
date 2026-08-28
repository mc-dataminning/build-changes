import java.util.Optional;

public class bxl implements byo {
   private final bul a;
   private final boolean b;

   public bxl(bul $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ezy a() {
      return this.b ? this.a.dt().b(0.0, (double)this.a.cS(), 0.0) : this.a.dt();
   }

   @Override
   public jh b() {
      return this.a.dv();
   }

   @Override
   public boolean a(bvh $$0) {
      if (this.a instanceof bvh $$1) {
         if (!$$1.bL()) {
            return false;
         } else {
            Optional<cen> $$3 = $$0.eb().c(cel.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bul c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
