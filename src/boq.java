import java.util.Optional;

public class boq implements bpt {
   private final blw a;
   private final boolean b;

   public boq(blw $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public emc a() {
      return this.b ? this.a.dj().b(0.0, (double)this.a.cI(), 0.0) : this.a.dj();
   }

   @Override
   public hx b() {
      return this.a.dl();
   }

   @Override
   public boolean a(bmo $$0) {
      if (this.a instanceof bmo $$1) {
         if (!$$1.bx()) {
            return false;
         } else {
            Optional<bvs> $$3 = $$0.dN().c(bvq.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public blw c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
