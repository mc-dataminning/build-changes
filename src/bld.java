import java.util.Optional;

public class bld implements bmf {
   private final bil a;
   private final boolean b;

   public bld(bil $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ehi a() {
      return this.b ? this.a.di().b(0.0, (double)this.a.cH(), 0.0) : this.a.di();
   }

   @Override
   public gw b() {
      return this.a.dk();
   }

   @Override
   public boolean a(bjb $$0) {
      if (this.a instanceof bjb $$1) {
         if (!$$1.bv()) {
            return false;
         } else {
            Optional<bse> $$3 = $$0.dM().c(bsc.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bil c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
