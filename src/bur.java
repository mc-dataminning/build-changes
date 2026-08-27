import java.util.Optional;

public class bur implements bvu {
   private final brv a;
   private final boolean b;

   public bur(brv $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ewu a() {
      return this.b ? this.a.ds().b(0.0, (double)this.a.cQ(), 0.0) : this.a.ds();
   }

   @Override
   public ir b() {
      return this.a.du();
   }

   @Override
   public boolean a(bso $$0) {
      if (this.a instanceof bso $$1) {
         if (!$$1.bI()) {
            return false;
         } else {
            Optional<cbt> $$3 = $$0.dZ().c(cbr.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public brv c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
