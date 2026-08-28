import java.util.Optional;

public class byc implements bzf {
   private final bva a;
   private final boolean b;

   public byc(bva $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public fbx a() {
      return this.b ? this.a.ds().b(0.0, (double)this.a.cR(), 0.0) : this.a.ds();
   }

   @Override
   public ji b() {
      return this.a.du();
   }

   @Override
   public boolean a(bvy $$0) {
      if (this.a instanceof bvy $$1) {
         if (!$$1.bJ()) {
            return false;
         } else {
            Optional<cfe> $$3 = $$0.ea().c(cfc.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bva c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
