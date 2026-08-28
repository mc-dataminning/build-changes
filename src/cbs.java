import java.util.EnumSet;

public class cbs extends ccd {
   private final bvh a;
   private final dgg b;

   public cbs(bvh $$0, dgg $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(ccd.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.aw || this.a.av;
      if ($$0 && this.a.aq().a(aws.h)) {
         ji $$1 = this.a.dw().d();
         dwv $$2 = this.b.a_($$1);
         return $$2.a(djm.rr) || $$2.g(this.b, $$1) == fbp.a();
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
