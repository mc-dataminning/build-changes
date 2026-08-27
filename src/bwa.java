import java.util.EnumSet;

public class bwa extends bvu {
   private final boz a;
   private box b;
   private final float c;

   public bwa(boz $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(bvu.a.c, bvu.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.cL()) {
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
               return !this.a.aC() ? false : this.a.ef().a(b(5)) == 0;
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
      eov $$0 = this.a.dm();
      eov $$1 = new eov(this.b.do() - this.a.do(), 0.0, this.b.du() - this.a.du());
      if ($$1.g() > 1.0E-7) {
         $$1 = $$1.d().a(0.4).e($$0.a(0.2));
      }

      this.a.o($$1.c, (double)this.c, $$1.e);
   }
}
