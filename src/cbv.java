import java.util.EnumSet;

public class cbv extends ccg {
   private final bvk a;
   private final dgj b;

   public cbv(bvk $$0, dgj $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(ccg.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.aw || this.a.av;
      if ($$0 && this.a.aq().a(awt.h)) {
         ji $$1 = this.a.dv().d();
         dwy $$2 = this.b.a_($$1);
         return $$2.a(djp.rr) || $$2.g(this.b, $$1) == fbs.a();
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
