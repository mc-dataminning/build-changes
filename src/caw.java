import java.util.EnumSet;

public class caw extends cbh {
   private final bum a;
   private final deg b;

   public caw(bum $$0, deg $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cbh.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.ax || this.a.aw;
      if ($$0 && this.a.ao().a(awx.h)) {
         je $$1 = this.a.ds().d();
         duo $$2 = this.b.a_($$1);
         return $$2.a(dhl.qP) || $$2.g(this.b, $$1) == ezj.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void a() {
      this.a.O().a();
   }
}
