import java.util.EnumSet;

public class cbn extends cby {
   private final bvc a;
   private final dfb b;

   public cbn(bvc $$0, dfb $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cby.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.ax || this.a.aw;
      if ($$0 && this.a.ar().a(axe.h)) {
         jh $$1 = this.a.dx().d();
         dvj $$2 = this.b.a_($$1);
         return $$2.a(dig.qP) || $$2.g(this.b, $$1) == fae.a();
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
