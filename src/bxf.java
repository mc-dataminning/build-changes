import java.util.EnumSet;

public class bxf extends bxq {
   private final bqv a;
   private final czg b;

   public bxf(bqv $$0, czg $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bxq.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aB || this.a.aA;
      if ($$0 && this.a.ai().a(avh.h)) {
         id $$1 = this.a.dm().c();
         dpi $$2 = this.b.a_($$1);
         return $$2.a(dcj.qP) || $$2.k(this.b, $$1) == esz.a();
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
