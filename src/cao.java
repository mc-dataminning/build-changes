import java.util.EnumSet;

public class cao extends cai {
   private final btm a;
   private btk b;
   private final float c;

   public cao(btm $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(cai.a.c, cai.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.cR()) {
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
               return !this.a.aE() ? false : this.a.el().a(b(5)) == 0;
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
      evm $$0 = this.a.ds();
      evm $$1 = new evm(this.b.du() - this.a.du(), 0.0, this.b.dA() - this.a.dA());
      if ($$1.g() > 1.0E-7) {
         $$1 = $$1.d().a(0.4).e($$0.a(0.2));
      }

      this.a.o($$1.c, (double)this.c, $$1.e);
   }
}
