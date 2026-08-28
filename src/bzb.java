import java.util.Optional;

public class bzb implements cae {
   private final bwa a;
   private final boolean b;

   public bzb(bwa $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public fdw a() {
      return this.b ? this.a.dt().b(0.0, (double)this.a.cS(), 0.0) : this.a.dt();
   }

   @Override
   public iu b() {
      return this.a.dv();
   }

   @Override
   public boolean a(bwz $$0) {
      if (this.a instanceof bwz $$1) {
         if (!$$1.bK()) {
            return false;
         } else {
            Optional<cgd> $$3 = $$0.eb().c(cgb.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bwa c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
