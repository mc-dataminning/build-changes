import java.util.EnumSet;

public class bsh extends bsb {
   private final bli a;
   private blg b;
   private final float c;

   public bsh(bli $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(bsb.a.c, bsb.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.cP()) {
         return false;
      } else {
         this.b = this.a.q();
         if (this.b == null) {
            return false;
         } else {
            double $$0 = this.a.f(this.b);
            if ($$0 < 4.0 || $$0 > 16.0) {
               return false;
            } else {
               return !this.a.aC() ? false : this.a.eh().a(b(5)) == 0;
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
      eju $$0 = this.a.dq();
      eju $$1 = new eju(this.b.ds() - this.a.ds(), 0.0, this.b.dy() - this.a.dy());
      if ($$1.g() > 1.0E-7) {
         $$1 = $$1.d().a(0.4).e($$0.a(0.2));
      }

      this.a.o($$1.c, (double)this.c, $$1.e);
   }
}
