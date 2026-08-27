import java.util.Optional;

public class blb implements bmd {
   private final bii a;
   private final boolean b;

   public blb(bii $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ehe a() {
      return this.b ? this.a.di().b(0.0, (double)this.a.cH(), 0.0) : this.a.di();
   }

   @Override
   public gu b() {
      return this.a.dk();
   }

   @Override
   public boolean a(biy $$0) {
      if (this.a instanceof biy $$1) {
         if (!$$1.bv()) {
            return false;
         } else {
            Optional<bsc> $$3 = $$0.dM().c(bsa.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bii c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
