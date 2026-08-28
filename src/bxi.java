import java.util.Optional;

public class bxi implements byl {
   private final bui a;
   private final boolean b;

   public bxi(bui $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ezr a() {
      return this.b ? this.a.dw().b(0.0, (double)this.a.cU(), 0.0) : this.a.dw();
   }

   @Override
   public jh b() {
      return this.a.dy();
   }

   @Override
   public boolean a(bve $$0) {
      if (this.a instanceof bve $$1) {
         if (!$$1.bN()) {
            return false;
         } else {
            Optional<cek> $$3 = $$0.ee().c(cei.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bui c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
