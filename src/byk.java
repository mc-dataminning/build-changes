import java.util.Optional;

public class byk implements bzn {
   private final bvk a;
   private final boolean b;

   public byk(bvk $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public fby a() {
      return this.b ? this.a.du().b(0.0, (double)this.a.cS(), 0.0) : this.a.du();
   }

   @Override
   public jh b() {
      return this.a.dw();
   }

   @Override
   public boolean a(bwg $$0) {
      if (this.a instanceof bwg $$1) {
         if (!$$1.bL()) {
            return false;
         } else {
            Optional<cfm> $$3 = $$0.ec().c(cfk.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bvk c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
