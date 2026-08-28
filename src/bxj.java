import java.util.Optional;

public class bxj implements bym {
   private final buj a;
   private final boolean b;

   public bxj(buj $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public fay a() {
      return this.b ? this.a.du().b(0.0, (double)this.a.cS(), 0.0) : this.a.du();
   }

   @Override
   public ji b() {
      return this.a.dw();
   }

   @Override
   public boolean a(bvf $$0) {
      if (this.a instanceof bvf $$1) {
         if (!$$1.bL()) {
            return false;
         } else {
            Optional<cel> $$3 = $$0.ec().c(cej.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public buj c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
