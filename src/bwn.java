import java.util.Optional;

public class bwn implements bxq {
   private final bto a;
   private final boolean b;

   public bwn(bto $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public eys a() {
      return this.b ? this.a.dq().b(0.0, (double)this.a.cP(), 0.0) : this.a.dq();
   }

   @Override
   public je b() {
      return this.a.ds();
   }

   @Override
   public boolean a(buk $$0) {
      if (this.a instanceof buk $$1) {
         if (!$$1.bI()) {
            return false;
         } else {
            Optional<cdp> $$3 = $$0.dX().c(cdn.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bto c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
