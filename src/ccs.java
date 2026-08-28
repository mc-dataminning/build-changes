import java.util.EnumSet;

public class ccs extends cdd {
   private final bwh a;
   private final dhh b;

   public ccs(bwh $$0, dhh $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cdd.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.aw || this.a.av;
      if ($$0 && this.a.aq().a(axy.h)) {
         jh $$1 = this.a.dw().d();
         dxu $$2 = this.b.a_($$1);
         return $$2.a(dkn.rk) || $$2.g(this.b, $$1) == fco.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      this.a.J().a();
   }
}
