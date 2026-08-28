import java.util.EnumSet;

public class cbt extends cce {
   private final bvi a;
   private final dgh b;

   public cbt(bvi $$0, dgh $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cce.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.aw || this.a.av;
      if ($$0 && this.a.aq().a(awt.h)) {
         ji $$1 = this.a.dv().d();
         dww $$2 = this.b.a_($$1);
         return $$2.a(djn.rr) || $$2.g(this.b, $$1) == fbq.a();
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
