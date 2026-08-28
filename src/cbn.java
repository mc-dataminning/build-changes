import java.util.EnumSet;

public class cbn extends cbh {
   private final bum a;
   private buk b;
   private final float c;

   public cbn(bum $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(cbh.a.c, cbh.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.cV()) {
         return false;
      } else {
         this.b = this.a.m();
         if (this.b == null) {
            return false;
         } else {
            double $$0 = this.a.g(this.b);
            if ($$0 < 4.0 || $$0 > 16.0) {
               return false;
            } else {
               return !this.a.aH() ? false : this.a.dV().a(b(5)) == 0;
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
      eys $$0 = this.a.dv();
      eys $$1 = new eys(this.b.dx() - this.a.dx(), 0.0, this.b.dD() - this.a.dD());
      if ($$1.h() > 1.0E-7) {
         $$1 = $$1.d().c(0.4).e($$0.c(0.2));
      }

      this.a.n($$1.d, (double)this.c, $$1.f);
   }
}
