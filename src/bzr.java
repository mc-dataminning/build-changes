import java.util.EnumSet;

public class bzr extends bzl {
   private final bsq a;
   private bso b;
   private final float c;

   public bzr(bsq $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(bzl.a.c, bzl.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.cW()) {
         return false;
      } else {
         this.b = this.a.p();
         if (this.b == null) {
            return false;
         } else {
            double $$0 = this.a.g(this.b);
            if ($$0 < 4.0 || $$0 > 16.0) {
               return false;
            } else {
               return !this.a.aE() ? false : this.a.et().a(b(5)) == 0;
            }
         }
      }
   }

   @Override
   public boolean b() {
      return !this.a.aE();
   }

   @Override
   public void c() {
      ewu $$0 = this.a.dx();
      ewu $$1 = new ewu(this.b.dz() - this.a.dz(), 0.0, this.b.dF() - this.a.dF());
      if ($$1.g() > 1.0E-7) {
         $$1 = $$1.d().a(0.4).e($$0.a(0.2));
      }

      this.a.o($$1.c, (double)this.c, $$1.e);
   }
}
