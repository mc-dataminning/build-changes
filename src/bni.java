import java.util.Optional;

public class bni implements bok {
   private final bkq a;
   private final boolean b;

   public bni(bkq $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public eju a() {
      return this.b ? this.a.dl().b(0.0, (double)this.a.cI(), 0.0) : this.a.dl();
   }

   @Override
   public ht b() {
      return this.a.dn();
   }

   @Override
   public boolean a(blg $$0) {
      if (this.a instanceof blg $$1) {
         if (!$$1.bx()) {
            return false;
         } else {
            Optional<buj> $$3 = $$0.dP().c(buh.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bkq c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
