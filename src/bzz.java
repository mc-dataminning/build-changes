import java.util.EnumSet;

public class bzz extends cak {
   private final btn a;
   private final dcu b;

   public bzz(btn $$0, dcu $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cak.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.aA || this.a.az;
      if ($$0 && this.a.am().a(awh.h)) {
         jd $$1 = this.a.dq().c();
         dta $$2 = this.b.a_($$1);
         return $$2.a(dfy.qP) || $$2.k(this.b, $$1) == exm.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void a() {
      this.a.I().a();
   }
}
