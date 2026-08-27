import java.util.EnumSet;

public class bxa extends bxl {
   private final bqq a;
   private final cyx b;

   public bxa(bqq $$0, cyx $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bxl.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aB || this.a.aA;
      if ($$0 && this.a.ai().a(avf.h)) {
         ib $$1 = this.a.dm().c();
         doz $$2 = this.b.a_($$1);
         return $$2.a(dca.qP) || $$2.k(this.b, $$1) == esq.a();
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
