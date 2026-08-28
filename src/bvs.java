import java.util.Optional;

public class bvs implements bwv {
   private final bsr a;
   private final boolean b;

   public bvs(bsr $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public exa a() {
      return this.b ? this.a.dn().b(0.0, (double)this.a.cM(), 0.0) : this.a.dn();
   }

   @Override
   public jd b() {
      return this.a.dp();
   }

   @Override
   public boolean a(btn $$0) {
      if (this.a instanceof btn $$1) {
         if (!$$1.bE()) {
            return false;
         } else {
            Optional<ccu> $$3 = $$0.dU().c(ccs.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bsr c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
