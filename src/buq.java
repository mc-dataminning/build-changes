import java.util.EnumSet;

public class buq extends bvb {
   private final boi a;
   private final cvn b;

   public buq(boi $$0, cvn $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bvb.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aA || this.a.az;
      if ($$0 && this.a.ai().a(auc.h)) {
         hz $$1 = this.a.dm().c();
         dlf $$2 = this.b.a_($$1);
         return $$2.a(cyq.qP) || $$2.k(this.b, $$1) == eoi.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void e() {
      this.a.M().a();
   }
}
