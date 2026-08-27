import java.util.Optional;

public class bql implements bro {
   private final bnq a;
   private final boolean b;

   public bql(bnq $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public enz a() {
      return this.b ? this.a.dk().b(0.0, (double)this.a.cI(), 0.0) : this.a.dk();
   }

   @Override
   public hz b() {
      return this.a.dm();
   }

   @Override
   public boolean a(boi $$0) {
      if (this.a instanceof boi $$1) {
         if (!$$1.bx()) {
            return false;
         } else {
            Optional<bxn> $$3 = $$0.dO().c(bxl.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bnq c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
