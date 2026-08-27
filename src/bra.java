import java.util.Optional;

public class bra implements bsd {
   private final bof a;
   private final boolean b;

   public bra(bof $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public eov a() {
      return this.b ? this.a.dh().b(0.0, (double)this.a.cF(), 0.0) : this.a.dh();
   }

   @Override
   public ib b() {
      return this.a.dj();
   }

   @Override
   public boolean a(box $$0) {
      if (this.a instanceof box $$1) {
         if (!$$1.bx()) {
            return false;
         } else {
            Optional<byc> $$3 = $$0.dM().c(bya.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bof c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
