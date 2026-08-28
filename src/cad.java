import java.util.EnumSet;

public class cad extends cao {
   private final bts a;
   private final dbz b;

   public cad(bts $$0, dbz $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cao.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aC || this.a.aB;
      if ($$0 && this.a.ak().a(awt.h)) {
         iz $$1 = this.a.dp().c();
         dsd $$2 = this.b.a_($$1);
         return $$2.a(dfc.qP) || $$2.k(this.b, $$1) == ewi.a();
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
