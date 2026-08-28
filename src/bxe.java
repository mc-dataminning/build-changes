import java.util.Optional;

public class bxe implements byh {
   private final bue a;
   private final boolean b;

   public bxe(bue $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ezn a() {
      return this.b ? this.a.dv().b(0.0, (double)this.a.cT(), 0.0) : this.a.dv();
   }

   @Override
   public jh b() {
      return this.a.dx();
   }

   @Override
   public boolean a(bva $$0) {
      if (this.a instanceof bva $$1) {
         if (!$$1.bM()) {
            return false;
         } else {
            Optional<ceg> $$3 = $$0.ed().c(cee.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bue c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
