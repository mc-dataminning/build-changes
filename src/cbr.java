import java.util.EnumSet;

public class cbr extends ccc {
   private final bvg a;
   private final dff b;

   public cbr(bvg $$0, dff $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(ccc.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.ax || this.a.aw;
      if ($$0 && this.a.ar().a(axh.h)) {
         jh $$1 = this.a.dy().d();
         dvo $$2 = this.b.a_($$1);
         return $$2.a(dil.qP) || $$2.g(this.b, $$1) == fai.a();
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
      this.a.O().a();
   }
}
