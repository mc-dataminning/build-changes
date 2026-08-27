import java.util.EnumSet;

public class bmk extends bmv {
   private final bgb a;
   private final cmm b;

   public bmk(bgb $$0, cmm $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bmv.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aA || this.a.az;
      if ($$0 && this.a.ae().a(amz.f)) {
         gu $$1 = this.a.di().c();
         dcb $$2 = this.b.a_($$1);
         return $$2.a(cpo.qC) || $$2.k(this.b, $$1) == eey.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean K_() {
      return true;
   }

   @Override
   public void e() {
      this.a.I().a();
   }
}
