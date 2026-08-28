import java.util.Optional;

public class bxk implements byn {
   private final buk a;
   private final boolean b;

   public bxk(buk $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public fba a() {
      return this.b ? this.a.du().b(0.0, (double)this.a.cS(), 0.0) : this.a.du();
   }

   @Override
   public ji b() {
      return this.a.dw();
   }

   @Override
   public boolean a(bvg $$0) {
      if (this.a instanceof bvg $$1) {
         if (!$$1.bL()) {
            return false;
         } else {
            Optional<cem> $$3 = $$0.ec().c(cek.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public buk c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
