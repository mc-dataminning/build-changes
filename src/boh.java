import java.util.Optional;

public class boh implements bpk {
   private final blp a;
   private final boolean b;

   public boh(blp $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public elm a() {
      return this.b ? this.a.dk().b(0.0, (double)this.a.cI(), 0.0) : this.a.dk();
   }

   @Override
   public hx b() {
      return this.a.dm();
   }

   @Override
   public boolean a(bmf $$0) {
      if (this.a instanceof bmf $$1) {
         if (!$$1.bx()) {
            return false;
         } else {
            Optional<bvj> $$3 = $$0.dO().c(bvh.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public blp c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
