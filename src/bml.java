import java.util.Optional;

public class bml implements bnn {
   private final bjt a;
   private final boolean b;

   public bml(bjt $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public eif a() {
      return this.b ? this.a.dj().b(0.0, (double)this.a.cH(), 0.0) : this.a.dj();
   }

   @Override
   public ht b() {
      return this.a.dl();
   }

   @Override
   public boolean a(bkj $$0) {
      if (this.a instanceof bkj $$1) {
         if (!$$1.bv()) {
            return false;
         } else {
            Optional<btm> $$3 = $$0.dN().c(btk.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bjt c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
