import java.util.EnumSet;

public class ccl extends ccw {
   private final bwa a;
   private final dgz b;

   public ccl(bwa $$0, dgz $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(ccw.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.aw || this.a.av;
      if ($$0 && this.a.aq().a(awt.h)) {
         ji $$1 = this.a.du().d();
         dxq $$2 = this.b.a_($$1);
         return $$2.a(dkg.rr) || $$2.g(this.b, $$1) == fco.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public void a() {
      this.a.N().a();
   }
}
