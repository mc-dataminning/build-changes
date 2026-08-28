import java.util.Optional;

public class bvo implements bwr {
   private final bsp a;
   private final boolean b;

   public bvo(bsp $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public evm a() {
      return this.b ? this.a.dn().b(0.0, (double)this.a.cL(), 0.0) : this.a.dn();
   }

   @Override
   public iz b() {
      return this.a.dp();
   }

   @Override
   public boolean a(btk $$0) {
      if (this.a instanceof btk $$1) {
         if (!$$1.bD()) {
            return false;
         } else {
            Optional<ccq> $$3 = $$0.dS().c(cco.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bsp c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
