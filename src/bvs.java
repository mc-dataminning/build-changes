import java.util.Optional;

public class bvs implements bwv {
   private final bsr a;
   private final boolean b;

   public bvs(bsr $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public exc a() {
      return this.b ? this.a.dm().b(0.0, (double)this.a.cL(), 0.0) : this.a.dm();
   }

   @Override
   public jd b() {
      return this.a.do();
   }

   @Override
   public boolean a(btn $$0) {
      if (this.a instanceof btn $$1) {
         if (!$$1.bE()) {
            return false;
         } else {
            Optional<ccu> $$3 = $$0.dT().c(ccs.h);
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
