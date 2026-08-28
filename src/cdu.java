import java.util.EnumSet;

public class cdu extends cef {
   private final bxl a;
   private final djh b;

   public cdu(bxl $$0, djh $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cef.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.aw || this.a.av;
      if ($$0 && this.a.an().a(axf.h)) {
         iv $$1 = this.a.du().d();
         eao $$2 = this.b.a_($$1);
         return $$2.a(dmo.rx) || $$2.g(this.b, $$1) == ffo.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void a() {
      this.a.N().a();
   }
}
