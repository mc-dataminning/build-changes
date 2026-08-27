import java.util.Optional;

public class bsr implements btu {
   private final bpv a;
   private final boolean b;

   public bsr(bpv $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public esa a() {
      return this.b ? this.a.dk().b(0.0, (double)this.a.cI(), 0.0) : this.a.dk();
   }

   @Override
   public ib b() {
      return this.a.dm();
   }

   @Override
   public boolean a(bqo $$0) {
      if (this.a instanceof bqo $$1) {
         if (!$$1.bA()) {
            return false;
         } else {
            Optional<bzt> $$3 = $$0.dP().c(bzr.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bpv c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
