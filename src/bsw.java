import java.util.EnumSet;

public class bsw extends bth {
   private final bmn a;
   private final ctp b;

   public bsw(bmn $$0, ctp $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bth.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aB || this.a.aA;
      if ($$0 && this.a.ai().a(ask.h)) {
         hx $$1 = this.a.dm().c();
         djh $$2 = this.b.a_($$1);
         return $$2.a(cws.qP) || $$2.k(this.b, $$1) == emj.a();
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
