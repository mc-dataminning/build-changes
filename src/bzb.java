import java.util.EnumSet;

public class bzb extends bzm {
   private final bsq a;
   private final dax b;

   public bzb(bsq $$0, dax $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bzm.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aC || this.a.aB;
      if ($$0 && this.a.ak().a(avz.h)) {
         io $$1 = this.a.dp().c();
         drb $$2 = this.b.a_($$1);
         return $$2.a(dea.qP) || $$2.k(this.b, $$1) == eva.a();
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
