import java.util.EnumSet;

public class brz extends brt {
   private final bla a;
   private bky b;
   private final float c;

   public brz(bla $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(brt.a.c, brt.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.cO()) {
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
               return !this.a.aA() ? false : this.a.ef().a(b(5)) == 0;
            }
         }
      }
   }

   @Override
   public boolean b() {
      return !this.a.aA();
   }

   @Override
   public void c() {
      eji $$0 = this.a.do();
      eji $$1 = new eji(this.b.dq() - this.a.dq(), 0.0, this.b.dw() - this.a.dw());
      if ($$1.g() > 1.0E-7) {
         $$1 = $$1.d().a(0.4).e($$0.a(0.2));
      }

      this.a.o($$1.c, (double)this.c, $$1.e);
   }
}
