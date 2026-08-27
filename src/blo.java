import java.util.Optional;

public class blo implements bmq {
   private final biw a;
   private final boolean b;

   public blo(biw $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ehh a() {
      return this.b ? this.a.dj().b(0.0, (double)this.a.cH(), 0.0) : this.a.dj();
   }

   @Override
   public gw b() {
      return this.a.dl();
   }

   @Override
   public boolean a(bjm $$0) {
      if (this.a instanceof bjm $$1) {
         if (!$$1.bv()) {
            return false;
         } else {
            Optional<bsp> $$3 = $$0.dN().c(bsn.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public biw c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
