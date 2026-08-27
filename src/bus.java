import java.util.Optional;

public class bus implements bvv {
   private final bru a;
   private final boolean b;

   public bus(bru $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public euk a() {
      return this.b ? this.a.dn().b(0.0, (double)this.a.cL(), 0.0) : this.a.dn();
   }

   @Override
   public io b() {
      return this.a.dp();
   }

   @Override
   public boolean a(bso $$0) {
      if (this.a instanceof bso $$1) {
         if (!$$1.bD()) {
            return false;
         } else {
            Optional<cbu> $$3 = $$0.dS().c(cbs.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bru c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
