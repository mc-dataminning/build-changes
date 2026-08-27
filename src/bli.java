import java.util.Optional;

public class bli implements bmk {
   private final biq a;
   private final boolean b;

   public bli(biq $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ehn a() {
      return this.b ? this.a.dj().b(0.0, (double)this.a.cI(), 0.0) : this.a.dj();
   }

   @Override
   public gw b() {
      return this.a.dl();
   }

   @Override
   public boolean a(bjg $$0) {
      if (this.a instanceof bjg $$1) {
         if (!$$1.bw()) {
            return false;
         } else {
            Optional<bsj> $$3 = $$0.dN().c(bsh.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public biq c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
