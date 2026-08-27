import java.util.Optional;

public class bna implements boc {
   private final bki a;
   private final boolean b;

   public bna(bki $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public eji a() {
      return this.b ? this.a.dj().b(0.0, (double)this.a.cH(), 0.0) : this.a.dj();
   }

   @Override
   public ht b() {
      return this.a.dl();
   }

   @Override
   public boolean a(bky $$0) {
      if (this.a instanceof bky $$1) {
         if (!$$1.bv()) {
            return false;
         } else {
            Optional<bub> $$3 = $$0.dN().c(btz.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bki c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
