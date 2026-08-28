import java.util.Optional;

public class bzy implements cbb {
   private final bwv a;
   private final boolean b;

   public bzy(bwv $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ffs a() {
      return this.b ? this.a.dt().b(0.0, (double)this.a.cS(), 0.0) : this.a.dt();
   }

   @Override
   public iw b() {
      return this.a.dv();
   }

   @Override
   public boolean a(bxw $$0) {
      if (this.a instanceof bxw $$1) {
         if (!$$1.bJ()) {
            return false;
         } else {
            Optional<cha> $$3 = $$0.ec().c(cgy.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bwv c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
