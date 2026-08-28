import java.util.EnumSet;

public class car extends cbc {
   private final buh a;
   private final dds b;

   public car(buh $$0, dds $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cbc.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.ax || this.a.aw;
      if ($$0 && this.a.ao().a(aww.h)) {
         je $$1 = this.a.ds().d();
         dua $$2 = this.b.a_($$1);
         return $$2.a(dgx.qP) || $$2.g(this.b, $$1) == eyu.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void a() {
      this.a.O().a();
   }
}
