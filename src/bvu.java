import java.util.Optional;

public class bvu implements bwx {
   private final bsv a;
   private final boolean b;

   public bvu(bsv $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public evs a() {
      return this.b ? this.a.dn().b(0.0, (double)this.a.cL(), 0.0) : this.a.dn();
   }

   @Override
   public iz b() {
      return this.a.dp();
   }

   @Override
   public boolean a(btq $$0) {
      if (this.a instanceof btq $$1) {
         if (!$$1.bD()) {
            return false;
         } else {
            Optional<ccw> $$3 = $$0.dS().c(ccu.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bsv c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
