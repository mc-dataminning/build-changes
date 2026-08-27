import java.util.Optional;

public class bqh implements brk {
   private final bno a;
   private final boolean b;

   public bqh(bno $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ens a() {
      return this.b ? this.a.dk().b(0.0, (double)this.a.cI(), 0.0) : this.a.dk();
   }

   @Override
   public hz b() {
      return this.a.dm();
   }

   @Override
   public boolean a(bog $$0) {
      if (this.a instanceof bog $$1) {
         if (!$$1.bx()) {
            return false;
         } else {
            Optional<bxj> $$3 = $$0.dO().c(bxh.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bno c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
