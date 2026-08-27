import java.util.EnumSet;

public class bnb extends bmv {
   private final bgb a;
   private bfz b;
   private final float c;

   public bnb(bgb $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(bmv.a.c, bmv.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.bN()) {
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
               return !this.a.ay() ? false : this.a.ec().a(b(5)) == 0;
            }
         }
      }
   }

   @Override
   public boolean b() {
      return !this.a.ay();
   }

   @Override
   public void c() {
      eei $$0 = this.a.dl();
      eei $$1 = new eei(this.b.dn() - this.a.dn(), 0.0, this.b.dt() - this.a.dt());
      if ($$1.g() > 1.0E-7) {
         $$1 = $$1.d().a(0.4).e($$0.a(0.2));
      }

      this.a.o($$1.c, (double)this.c, $$1.e);
   }
}
