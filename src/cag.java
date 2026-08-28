import java.util.EnumSet;

public class cag extends caa {
   private final bte a;
   private btc b;
   private final float c;

   public cag(bte $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(caa.a.c, caa.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.cT()) {
         return false;
      } else {
         this.b = this.a.p();
         if (this.b == null) {
            return false;
         } else {
            double $$0 = this.a.g((bsh)this.b);
            if ($$0 < 4.0 || $$0 > 16.0) {
               return false;
            } else {
               return !this.a.aG() ? false : this.a.dU().a(b(5)) == 0;
            }
         }
      }
   }

   @Override
   public boolean b() {
      return !this.a.aG();
   }

   @Override
   public void c() {
      ewh $$0 = this.a.du();
      ewh $$1 = new ewh(this.b.dw() - this.a.dw(), 0.0, this.b.dC() - this.a.dC());
      if ($$1.g() > 1.0E-7) {
         $$1 = $$1.d().a(0.4).e($$0.a(0.2));
      }

      this.a.o($$1.c, (double)this.c, $$1.e);
   }
}
