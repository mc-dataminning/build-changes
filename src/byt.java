import java.util.Optional;

public class byt implements bzw {
   private final bvs a;
   private final boolean b;

   public byt(bvs $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public fcu a() {
      return this.b ? this.a.dt().b(0.0, (double)this.a.cS(), 0.0) : this.a.dt();
   }

   @Override
   public jj b() {
      return this.a.dv();
   }

   @Override
   public boolean a(bwr $$0) {
      if (this.a instanceof bwr $$1) {
         if (!$$1.bK()) {
            return false;
         } else {
            Optional<cfv> $$3 = $$0.eb().c(cft.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bvs c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
