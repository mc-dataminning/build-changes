import java.util.EnumSet;

public class cbi extends cbt {
   private final bux a;
   private final dev b;

   public cbi(bux $$0, dev $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cbt.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.ax || this.a.aw;
      if ($$0 && this.a.aq().a(axd.h)) {
         jg $$1 = this.a.dx().d();
         dvd $$2 = this.b.a_($$1);
         return $$2.a(dia.qP) || $$2.g(this.b, $$1) == ezy.a();
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
