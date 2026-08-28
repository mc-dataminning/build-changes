import java.util.EnumSet;

public class cef extends ceq {
   private final bxw a;
   private final djx b;

   public cef(bxw $$0, djx $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(ceq.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.aw || this.a.av;
      if ($$0 && this.a.an().a(axh.h)) {
         iv $$1 = this.a.dv().d();
         ebe $$2 = this.b.a_($$1);
         return $$2.a(dne.rx) || $$2.g(this.b, $$1) == fgh.a();
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
      this.a.N().a();
   }
}
