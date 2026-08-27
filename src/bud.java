import java.util.Optional;

public class bud implements bvg {
   private final brh a;
   private final boolean b;

   public bud(brh $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public etp a() {
      return this.b ? this.a.dl().b(0.0, (double)this.a.cJ(), 0.0) : this.a.dl();
   }

   @Override
   public in b() {
      return this.a.dn();
   }

   @Override
   public boolean a(bsa $$0) {
      if (this.a instanceof bsa $$1) {
         if (!$$1.bB()) {
            return false;
         } else {
            Optional<cbf> $$3 = $$0.dQ().c(cbd.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public brh c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
