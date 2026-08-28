import java.util.Optional;

public class bwi implements bxl {
   private final btj a;
   private final boolean b;

   public bwi(btj $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public eye a() {
      return this.b ? this.a.dq().b(0.0, (double)this.a.cP(), 0.0) : this.a.dq();
   }

   @Override
   public je b() {
      return this.a.ds();
   }

   @Override
   public boolean a(buf $$0) {
      if (this.a instanceof buf $$1) {
         if (!$$1.bI()) {
            return false;
         } else {
            Optional<cdk> $$3 = $$0.dX().c(cdi.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public btj c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
