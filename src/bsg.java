import java.util.EnumSet;

public class bsg extends bsr {
   private final blx a;
   private final csy b;

   public bsg(blx $$0, csy $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bsr.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aB || this.a.aA;
      if ($$0 && this.a.ai().a(aru.h)) {
         hv $$1 = this.a.dm().c();
         dip $$2 = this.b.a_($$1);
         return $$2.a(cwb.qP) || $$2.k(this.b, $$1) == elr.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void e() {
      this.a.M().a();
   }
}
