import java.util.EnumSet;

public class cew extends ceq {
   private final bxw a;
   private bxu b;
   private final float c;

   public cew(bxw $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(ceq.a.c, ceq.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.cX()) {
         return false;
      } else {
         this.b = this.a.f();
         if (this.b == null) {
            return false;
         } else {
            double $$0 = this.a.g((bwt)this.b);
            if ($$0 < 4.0 || $$0 > 16.0) {
               return false;
            } else {
               return !this.a.aH() ? false : this.a.dY().a(b(5)) == 0;
            }
         }
      }
   }

   @Override
   public boolean c() {
      return !this.a.aH();
   }

   @Override
   public void d() {
      ffq $$0 = this.a.dy();
      ffq $$1 = new ffq(this.b.dA() - this.a.dA(), 0.0, this.b.dG() - this.a.dG());
      if ($$1.h() > 1.0E-7) {
         $$1 = $$1.d().c(0.4).e($$0.c(0.2));
      }

      this.a.n($$1.d, (double)this.c, $$1.f);
   }
}
