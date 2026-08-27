import java.util.EnumSet;

public class bqc extends bpw {
   private final bjd a;
   private bjb b;
   private final float c;

   public bqc(bjd $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(bpw.a.c, bpw.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.cO()) {
         return false;
      } else {
         this.b = this.a.j();
         if (this.b == null) {
            return false;
         } else {
            double $$0 = this.a.f(this.b);
            if ($$0 < 4.0 || $$0 > 16.0) {
               return false;
            } else {
               return !this.a.aA() ? false : this.a.ee().a(b(5)) == 0;
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
      ehi $$0 = this.a.dn();
      ehi $$1 = new ehi(this.b.dp() - this.a.dp(), 0.0, this.b.dv() - this.a.dv());
      if ($$1.g() > 1.0E-7) {
         $$1 = $$1.d().a(0.4).e($$0.a(0.2));
      }

      this.a.o($$1.c, (double)this.c, $$1.e);
   }
}
