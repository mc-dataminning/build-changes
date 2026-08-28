import java.util.Optional;

public class bzl implements cao {
   private final bwi a;
   private final boolean b;

   public bzl(bwi $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public fex a() {
      return this.b ? this.a.ds().b(0.0, (double)this.a.cR(), 0.0) : this.a.ds();
   }

   @Override
   public iv b() {
      return this.a.du();
   }

   @Override
   public boolean a(bxj $$0) {
      if (this.a instanceof bxj $$1) {
         if (!$$1.bI()) {
            return false;
         } else {
            Optional<cgn> $$3 = $$0.eb().c(cgl.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bwi c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
