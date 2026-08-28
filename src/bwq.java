import java.util.Optional;

public class bwq implements bxt {
   private final btr a;
   private final boolean b;

   public bwq(btr $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public eyw a() {
      return this.b ? this.a.dq().b(0.0, (double)this.a.cP(), 0.0) : this.a.dq();
   }

   @Override
   public jf b() {
      return this.a.ds();
   }

   @Override
   public boolean a(bun $$0) {
      if (this.a instanceof bun $$1) {
         if (!$$1.bI()) {
            return false;
         } else {
            Optional<cds> $$3 = $$0.dY().c(cdq.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public btr c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
