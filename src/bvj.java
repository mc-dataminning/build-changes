import java.util.EnumSet;

public class bvj extends bvu {
   private final boz a;
   private final cwe b;

   public bvj(boz $$0, cwe $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bvu.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aA || this.a.az;
      if ($$0 && this.a.ai().a(auh.h)) {
         ib $$1 = this.a.dj().c();
         dme $$2 = this.b.a_($$1);
         return $$2.a(czh.qP) || $$2.k(this.b, $$1) == epl.a();
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
