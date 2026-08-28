import java.util.Optional;

public class byf implements bzi {
   private final bvf a;
   private final boolean b;

   public byf(bvf $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public fbs a() {
      return this.b ? this.a.dt().b(0.0, (double)this.a.cS(), 0.0) : this.a.dt();
   }

   @Override
   public jh b() {
      return this.a.dv();
   }

   @Override
   public boolean a(bwb $$0) {
      if (this.a instanceof bwb $$1) {
         if (!$$1.bL()) {
            return false;
         } else {
            Optional<cfh> $$3 = $$0.eb().c(cff.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bvf c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
