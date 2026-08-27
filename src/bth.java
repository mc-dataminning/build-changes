import java.util.Optional;

public class bth implements buk {
   private final bql a;
   private final boolean b;

   public bth(bql $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public etf a() {
      return this.b ? this.a.dl().b(0.0, (double)this.a.cJ(), 0.0) : this.a.dl();
   }

   @Override
   public im b() {
      return this.a.dn();
   }

   @Override
   public boolean a(bre $$0) {
      if (this.a instanceof bre $$1) {
         if (!$$1.bB()) {
            return false;
         } else {
            Optional<caj> $$3 = $$0.dQ().c(cah.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bql c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
