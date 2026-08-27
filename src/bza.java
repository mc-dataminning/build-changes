import java.util.EnumSet;

public class bza extends bzl {
   private final bsq a;
   private final dca b;

   public bza(bsq $$0, dca $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bzl.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aG || this.a.aF;
      if ($$0 && this.a.ak().a(awh.h)) {
         ir $$1 = this.a.du().c();
         dtc $$2 = this.b.a_($$1);
         return $$2.a(dfe.sa) || $$2.k(this.b, $$1) == exk.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean S_() {
      return true;
   }

   @Override
   public void e() {
      this.a.I().a();
   }
}
