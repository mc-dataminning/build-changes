import java.util.Optional;

public class buu implements bvx {
   private final brw a;
   private final boolean b;

   public buu(brw $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public eum a() {
      return this.b ? this.a.dn().b(0.0, (double)this.a.cL(), 0.0) : this.a.dn();
   }

   @Override
   public io b() {
      return this.a.dp();
   }

   @Override
   public boolean a(bsq $$0) {
      if (this.a instanceof bsq $$1) {
         if (!$$1.bD()) {
            return false;
         } else {
            Optional<cbw> $$3 = $$0.dS().c(cbu.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public brw c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
