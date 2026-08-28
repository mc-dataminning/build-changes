import java.util.Optional;

public class bvv implements bwy {
   private final bsw a;
   private final boolean b;

   public bvv(bsw $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public evt a() {
      return this.b ? this.a.dn().b(0.0, (double)this.a.cL(), 0.0) : this.a.dn();
   }

   @Override
   public iz b() {
      return this.a.dp();
   }

   @Override
   public boolean a(btr $$0) {
      if (this.a instanceof btr $$1) {
         if (!$$1.bD()) {
            return false;
         } else {
            Optional<ccx> $$3 = $$0.dS().c(ccv.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bsw c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
