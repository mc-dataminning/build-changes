import java.util.EnumSet;

public class bsv extends btg {
   private final bmm a;
   private final cto b;

   public bsv(bmm $$0, cto $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(btg.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aB || this.a.aA;
      if ($$0 && this.a.ai().a(asj.h)) {
         hx $$1 = this.a.dm().c();
         djg $$2 = this.b.a_($$1);
         return $$2.a(cwr.qP) || $$2.k(this.b, $$1) == emi.a();
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
