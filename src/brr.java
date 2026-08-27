import java.util.Optional;

public class brr implements bsu {
   private final bow a;
   private final boolean b;

   public brr(bow $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public epr a() {
      return this.b ? this.a.dk().b(0.0, (double)this.a.cI(), 0.0) : this.a.dk();
   }

   @Override
   public ib b() {
      return this.a.dm();
   }

   @Override
   public boolean a(bpo $$0) {
      if (this.a instanceof bpo $$1) {
         if (!$$1.bA()) {
            return false;
         } else {
            Optional<byt> $$3 = $$0.dP().c(byr.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bow c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
