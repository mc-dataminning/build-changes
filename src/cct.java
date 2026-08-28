import java.util.EnumSet;

public class cct extends cde {
   private final bwi a;
   private final dhi b;

   public cct(bwi $$0, dhi $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cde.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.aw || this.a.av;
      if ($$0 && this.a.aq().a(axy.h)) {
         jh $$1 = this.a.dw().d();
         dxv $$2 = this.b.a_($$1);
         return $$2.a(dko.rk) || $$2.g(this.b, $$1) == fcp.a();
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
