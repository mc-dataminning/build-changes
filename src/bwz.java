import java.util.Optional;

public class bwz implements byc {
   private final btz a;
   private final boolean b;

   public bwz(btz $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ezh a() {
      return this.b ? this.a.dv().b(0.0, (double)this.a.cT(), 0.0) : this.a.dv();
   }

   @Override
   public jg b() {
      return this.a.dx();
   }

   @Override
   public boolean a(buv $$0) {
      if (this.a instanceof buv $$1) {
         if (!$$1.bM()) {
            return false;
         } else {
            Optional<ceb> $$3 = $$0.ed().c(cdz.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public btz c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
