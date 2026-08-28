import java.util.EnumSet;

public class bzp extends caa {
   private final bte a;
   private final dcg b;

   public bzp(bte $$0, dcg $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(caa.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aC || this.a.aB;
      if ($$0 && this.a.am().a(awa.h)) {
         ja $$1 = this.a.dr().c();
         dsl $$2 = this.b.a_($$1);
         return $$2.a(dfk.qP) || $$2.k(this.b, $$1) == ewx.a();
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
