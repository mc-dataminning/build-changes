import java.util.EnumSet;

public class bwb extends bwm {
   private final bpr a;
   private final cxb b;

   public bwb(bpr $$0, cxb $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bwm.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aB || this.a.aA;
      if ($$0 && this.a.ai().a(auq.h)) {
         ib $$1 = this.a.dm().c();
         dnb $$2 = this.b.a_($$1);
         return $$2.a(dae.qP) || $$2.k(this.b, $$1) == eqj.a();
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
