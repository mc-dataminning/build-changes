import java.util.EnumSet;

public class buu extends bvf {
   private final bok a;
   private final cvr b;

   public buu(bok $$0, cvr $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bvf.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aA || this.a.az;
      if ($$0 && this.a.ai().a(aud.h)) {
         hz $$1 = this.a.dm().c();
         dlj $$2 = this.b.a_($$1);
         return $$2.a(cyu.qP) || $$2.k(this.b, $$1) == eop.a();
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
