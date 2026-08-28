import java.util.Optional;

public class bvf implements bwi {
   private final bsg a;
   private final boolean b;

   public bvf(bsg $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ewf a() {
      return this.b ? this.a.do().b(0.0, (double)this.a.cM(), 0.0) : this.a.do();
   }

   @Override
   public ja b() {
      return this.a.dq();
   }

   @Override
   public boolean a(btb $$0) {
      if (this.a instanceof btb $$1) {
         if (!$$1.bE()) {
            return false;
         } else {
            Optional<cch> $$3 = $$0.dU().c(ccf.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bsg c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
