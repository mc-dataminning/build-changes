import java.util.EnumSet;

public class caf extends bzz {
   private final btd a;
   private btb b;
   private final float c;

   public caf(btd $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(bzz.a.c, bzz.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.cS()) {
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
               return !this.a.aF() ? false : this.a.dT().a(b(5)) == 0;
            }
         }
      }
   }

   @Override
   public boolean b() {
      return !this.a.aF();
   }

   @Override
   public void c() {
      ewf $$0 = this.a.dt();
      ewf $$1 = new ewf(this.b.dv() - this.a.dv(), 0.0, this.b.dB() - this.a.dB());
      if ($$1.g() > 1.0E-7) {
         $$1 = $$1.d().a(0.4).e($$0.a(0.2));
      }

      this.a.o($$1.c, (double)this.c, $$1.e);
   }
}
