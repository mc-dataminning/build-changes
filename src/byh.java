import java.util.EnumSet;

public class byh extends byb {
   private final brg a;
   private bre b;
   private final float c;

   public byh(brg $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(byb.a.c, byb.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.cP()) {
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
               return !this.a.aC() ? false : this.a.ej().a(b(5)) == 0;
            }
         }
      }
   }

   @Override
   public boolean b() {
      return !this.a.aC();
   }

   @Override
   public void c() {
      etf $$0 = this.a.dq();
      etf $$1 = new etf(this.b.ds() - this.a.ds(), 0.0, this.b.dy() - this.a.dy());
      if ($$1.g() > 1.0E-7) {
         $$1 = $$1.d().a(0.4).e($$0.a(0.2));
      }

      this.a.o($$1.c, (double)this.c, $$1.e);
   }
}
