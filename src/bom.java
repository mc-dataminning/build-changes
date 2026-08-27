import java.util.Optional;

public class bom implements bpp {
   private final blu a;
   private final boolean b;

   public bom(blu $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public els a() {
      return this.b ? this.a.dk().b(0.0, (double)this.a.cI(), 0.0) : this.a.dk();
   }

   @Override
   public hx b() {
      return this.a.dm();
   }

   @Override
   public boolean a(bmk $$0) {
      if (this.a instanceof bmk $$1) {
         if (!$$1.bx()) {
            return false;
         } else {
            Optional<bvo> $$3 = $$0.dO().c(bvm.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public blu c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
