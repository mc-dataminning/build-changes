import java.util.EnumSet;

public class bqt extends bre {
   private final bkl a;
   private final cqz b;

   public bqt(bkl $$0, cqz $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bre.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aB || this.a.aA;
      if ($$0 && this.a.ag().a(aqv.h)) {
         ht $$1 = this.a.dl().c();
         dgb $$2 = this.b.a_($$1);
         return $$2.a(cuc.qC) || $$2.k(this.b, $$1) == eiv.a();
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
      this.a.K().a();
   }
}
