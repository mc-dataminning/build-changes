import java.util.Optional;

public class byb implements bze {
   private final bvb a;
   private final boolean b;

   public byb(bvb $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public fbr a() {
      return this.b ? this.a.du().b(0.0, (double)this.a.cS(), 0.0) : this.a.du();
   }

   @Override
   public jh b() {
      return this.a.dw();
   }

   @Override
   public boolean a(bvx $$0) {
      if (this.a instanceof bvx $$1) {
         if (!$$1.bL()) {
            return false;
         } else {
            Optional<cfd> $$3 = $$0.ec().c(cfb.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bvb c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
