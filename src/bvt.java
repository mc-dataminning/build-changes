import java.util.Optional;

public class bvt implements bww {
   private final bsu a;
   private final boolean b;

   public bvt(bsu $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public evr a() {
      return this.b ? this.a.dn().b(0.0, (double)this.a.cL(), 0.0) : this.a.dn();
   }

   @Override
   public iz b() {
      return this.a.dp();
   }

   @Override
   public boolean a(btp $$0) {
      if (this.a instanceof btp $$1) {
         if (!$$1.bD()) {
            return false;
         } else {
            Optional<ccv> $$3 = $$0.dS().c(cct.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bsu c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
