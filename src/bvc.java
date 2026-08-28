import java.util.Optional;

public class bvc implements bwf {
   private final bsd a;
   private final boolean b;

   public bvc(bsd $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public evz a() {
      return this.b ? this.a.dn().b(0.0, (double)this.a.cL(), 0.0) : this.a.dn();
   }

   @Override
   public ja b() {
      return this.a.dp();
   }

   @Override
   public boolean a(bsy $$0) {
      if (this.a instanceof bsy $$1) {
         if (!$$1.bD()) {
            return false;
         } else {
            Optional<cce> $$3 = $$0.dT().c(ccc.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bsd c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
