import java.util.Optional;

public class brs implements bsv {
   private final box a;
   private final boolean b;

   public brs(box $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ept a() {
      return this.b ? this.a.dk().b(0.0, (double)this.a.cI(), 0.0) : this.a.dk();
   }

   @Override
   public ib b() {
      return this.a.dm();
   }

   @Override
   public boolean a(bpp $$0) {
      if (this.a instanceof bpp $$1) {
         if (!$$1.bA()) {
            return false;
         } else {
            Optional<byu> $$3 = $$0.dP().c(bys.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public box c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
