import java.util.Optional;

public class bvq implements bwt {
   private final bsq a;
   private final boolean b;

   public bvq(bsq $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public eww a() {
      return this.b ? this.a.do().b(0.0, (double)this.a.cM(), 0.0) : this.a.do();
   }

   @Override
   public jd b() {
      return this.a.dq();
   }

   @Override
   public boolean a(btl $$0) {
      if (this.a instanceof btl $$1) {
         if (!$$1.bE()) {
            return false;
         } else {
            Optional<ccs> $$3 = $$0.dU().c(ccq.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bsq c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
