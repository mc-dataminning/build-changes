import java.util.Optional;

public class bsw implements btz {
   private final bqa a;
   private final boolean b;

   public bsw(bqa $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public esj a() {
      return this.b ? this.a.dk().b(0.0, (double)this.a.cI(), 0.0) : this.a.dk();
   }

   @Override
   public id b() {
      return this.a.dm();
   }

   @Override
   public boolean a(bqt $$0) {
      if (this.a instanceof bqt $$1) {
         if (!$$1.bA()) {
            return false;
         } else {
            Optional<bzy> $$3 = $$0.dP().c(bzw.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bqa c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
