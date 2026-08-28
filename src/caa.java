import java.util.EnumSet;

public class caa extends cal {
   private final btp a;
   private final dbw b;

   public caa(btp $$0, dbw $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cal.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aC || this.a.aB;
      if ($$0 && this.a.ak().a(aws.h)) {
         iz $$1 = this.a.dp().c();
         dsa $$2 = this.b.a_($$1);
         return $$2.a(dez.qP) || $$2.k(this.b, $$1) == ewf.a();
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
