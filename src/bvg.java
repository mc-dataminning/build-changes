import java.util.Optional;

public class bvg implements bwj {
   private final bsh a;
   private final boolean b;

   public bvg(bsh $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ewh a() {
      return this.b ? this.a.dp().b(0.0, (double)this.a.cN(), 0.0) : this.a.dp();
   }

   @Override
   public ja b() {
      return this.a.dr();
   }

   @Override
   public boolean a(btc $$0) {
      if (this.a instanceof btc $$1) {
         if (!$$1.bF()) {
            return false;
         } else {
            Optional<cci> $$3 = $$0.dV().c(ccg.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bsh c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
