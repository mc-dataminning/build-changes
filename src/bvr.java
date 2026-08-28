import java.util.Optional;

public class bvr implements bwu {
   private final bss a;
   private final boolean b;

   public bvr(bss $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public evp a() {
      return this.b ? this.a.dn().b(0.0, (double)this.a.cL(), 0.0) : this.a.dn();
   }

   @Override
   public iz b() {
      return this.a.dp();
   }

   @Override
   public boolean a(btn $$0) {
      if (this.a instanceof btn $$1) {
         if (!$$1.bD()) {
            return false;
         } else {
            Optional<cct> $$3 = $$0.dS().c(ccr.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bss c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
