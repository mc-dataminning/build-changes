import java.util.EnumSet;

public class bxq extends byb {
   private final brg a;
   private final czu b;

   public bxq(brg $$0, czu $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(byb.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aC || this.a.aB;
      if ($$0 && this.a.ai().a(avr.h)) {
         im $$1 = this.a.dn().c();
         dpy $$2 = this.b.a_($$1);
         return $$2.a(dcx.qP) || $$2.k(this.b, $$1) == etv.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      this.a.I().a();
   }
}
