import java.util.EnumSet;

public class bzx extends cai {
   private final btm a;
   private final dbt b;

   public bzx(btm $$0, dbt $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cai.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aC || this.a.aB;
      if ($$0 && this.a.ak().a(awp.h)) {
         iz $$1 = this.a.dp().c();
         drx $$2 = this.b.a_($$1);
         return $$2.a(dew.qP) || $$2.k(this.b, $$1) == ewc.a();
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
