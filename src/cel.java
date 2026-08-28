import java.util.EnumSet;

public class cel extends cef {
   private final bxl a;
   private bxj b;
   private final float c;

   public cel(bxl $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(cef.a.c, cef.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.cW()) {
         return false;
      } else {
         this.b = this.a.f();
         if (this.b == null) {
            return false;
         } else {
            double $$0 = this.a.g((bwi)this.b);
            if ($$0 < 4.0 || $$0 > 16.0) {
               return false;
            } else {
               return !this.a.aH() ? false : this.a.dX().a(b(5)) == 0;
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
      fex $$0 = this.a.dx();
      fex $$1 = new fex(this.b.dz() - this.a.dz(), 0.0, this.b.dF() - this.a.dF());
      if ($$1.h() > 1.0E-7) {
         $$1 = $$1.d().c(0.4).e($$0.c(0.2));
      }

      this.a.n($$1.d, (double)this.c, $$1.f);
   }
}
