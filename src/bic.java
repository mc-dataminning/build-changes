import java.util.Optional;

public class bic implements bje {
   private final bfj a;
   private final boolean b;

   public bic(bfj $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public eei a() {
      return this.b ? this.a.dg().b(0.0, (double)this.a.cF(), 0.0) : this.a.dg();
   }

   @Override
   public gu b() {
      return this.a.di();
   }

   @Override
   public boolean a(bfz $$0) {
      if (this.a instanceof bfz $$1) {
         if (!$$1.bs()) {
            return false;
         } else {
            Optional<bpd> $$3 = $$0.dK().c(bpb.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bfj c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
