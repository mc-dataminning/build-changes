import java.util.Optional;

public class bnn implements bop {
   private final bkv a;
   private final boolean b;

   public bnn(bkv $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ejz a() {
      return this.b ? this.a.dl().b(0.0, (double)this.a.cI(), 0.0) : this.a.dl();
   }

   @Override
   public hx b() {
      return this.a.dn();
   }

   @Override
   public boolean a(bll $$0) {
      if (this.a instanceof bll $$1) {
         if (!$$1.bx()) {
            return false;
         } else {
            Optional<buo> $$3 = $$0.dP().c(bum.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bkv c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
