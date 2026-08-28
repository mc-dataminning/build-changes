import java.util.Optional;

public class byj implements bzm {
   private final bvj a;
   private final boolean b;

   public byj(bvj $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public fbx a() {
      return this.b ? this.a.du().b(0.0, (double)this.a.cS(), 0.0) : this.a.du();
   }

   @Override
   public jh b() {
      return this.a.dw();
   }

   @Override
   public boolean a(bwf $$0) {
      if (this.a instanceof bwf $$1) {
         if (!$$1.bL()) {
            return false;
         } else {
            Optional<cfl> $$3 = $$0.ec().c(cfj.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bvj c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
