import java.util.EnumSet;

public class brq extends bsb {
   private final bli a;
   private final csa b;

   public brq(bli $$0, csa $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bsb.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aB || this.a.aA;
      if ($$0 && this.a.ai().a(arj.h)) {
         ht $$1 = this.a.dn().c();
         dhi $$2 = this.b.a_($$1);
         return $$2.a(cvc.qP) || $$2.k(this.b, $$1) == ekk.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean S_() {
      return true;
   }

   @Override
   public void e() {
      this.a.M().a();
   }
}
