import java.util.EnumSet;

public class cac extends can {
   private final btr a;
   private final dby b;

   public cac(btr $$0, dby $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(can.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aC || this.a.aB;
      if ($$0 && this.a.ak().a(awt.h)) {
         iz $$1 = this.a.dp().c();
         dsc $$2 = this.b.a_($$1);
         return $$2.a(dfb.qP) || $$2.k(this.b, $$1) == ewh.a();
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
