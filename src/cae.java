import java.util.EnumSet;

public class cae extends cap {
   private final btt a;
   private final dca b;

   public cae(btt $$0, dca $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cap.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aC || this.a.aB;
      if ($$0 && this.a.ak().a(awt.h)) {
         iz $$1 = this.a.dp().c();
         dse $$2 = this.b.a_($$1);
         return $$2.a(dfd.qP) || $$2.k(this.b, $$1) == ewj.a();
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
