import java.util.EnumSet;

public class cbu extends ccf {
   private final bvj a;
   private final dgi b;

   public cbu(bvj $$0, dgi $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(ccf.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.aw || this.a.av;
      if ($$0 && this.a.aq().a(awt.h)) {
         ji $$1 = this.a.dv().d();
         dwx $$2 = this.b.a_($$1);
         return $$2.a(djo.rr) || $$2.g(this.b, $$1) == fbr.a();
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
