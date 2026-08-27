import java.util.Optional;

public class blk implements bmm {
   private final bis a;
   private final boolean b;

   public blk(bis $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ehp a() {
      return this.b ? this.a.dj().b(0.0, (double)this.a.cH(), 0.0) : this.a.dj();
   }

   @Override
   public gw b() {
      return this.a.dl();
   }

   @Override
   public boolean a(bji $$0) {
      if (this.a instanceof bji $$1) {
         if (!$$1.bv()) {
            return false;
         } else {
            Optional<bsl> $$3 = $$0.dN().c(bsj.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bis c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
