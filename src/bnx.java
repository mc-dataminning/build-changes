import java.util.Optional;

public class bnx implements bpa {
   private final blf a;
   private final boolean b;

   public bnx(blf $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public elb a() {
      return this.b ? this.a.dk().b(0.0, (double)this.a.cI(), 0.0) : this.a.dk();
   }

   @Override
   public hv b() {
      return this.a.dm();
   }

   @Override
   public boolean a(blv $$0) {
      if (this.a instanceof blv $$1) {
         if (!$$1.bx()) {
            return false;
         } else {
            Optional<buz> $$3 = $$0.dO().c(bux.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public blf c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
