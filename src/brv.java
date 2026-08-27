import java.util.EnumSet;

public class brv extends bsg {
   private final bln a;
   private final csf b;

   public brv(bln $$0, csf $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bsg.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aB || this.a.aA;
      if ($$0 && this.a.ai().a(arn.h)) {
         hx $$1 = this.a.dn().c();
         dhn $$2 = this.b.a_($$1);
         return $$2.a(cvh.qP) || $$2.k(this.b, $$1) == ekp.a();
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
