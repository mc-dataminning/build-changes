import java.util.Optional;

public class cah implements cbk {
   private final bxe a;
   private final boolean b;

   public cah(bxe $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public fgc a() {
      return this.b ? this.a.dt().b(0.0, (double)this.a.cS(), 0.0) : this.a.dt();
   }

   @Override
   public iw b() {
      return this.a.dv();
   }

   @Override
   public boolean a(byf $$0) {
      if (this.a instanceof byf $$1) {
         if (!$$1.bJ()) {
            return false;
         } else {
            Optional<chj> $$3 = $$0.ec().c(chh.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bxe c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
