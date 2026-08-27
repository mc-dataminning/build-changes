import java.util.EnumSet;

public class cab extends byx {
   private final cft a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public cab(cft $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(byx.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.gE() && this.a.bQ()) {
         etp $$0 = ccu.a(this.a, 5, 4);
         if ($$0 == null) {
            return false;
         } else {
            this.c = $$0.c;
            this.d = $$0.d;
            this.e = $$0.e;
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.a.K().a(this.c, this.d, this.e, this.b);
   }

   @Override
   public boolean b() {
      return !this.a.gE() && !this.a.K().l() && this.a.bQ();
   }

   @Override
   public void e() {
      if (!this.a.gE() && this.a.ej().a(this.a(50)) == 0) {
         brh $$0 = this.a.cR();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof clh $$1) {
            int $$2 = this.a.gK();
            int $$3 = this.a.gP();
            if ($$3 > 0 && this.a.ej().a($$3) < $$2) {
               this.a.h($$1);
               return;
            }

            this.a.w(5);
         }

         this.a.bF();
         this.a.gU();
         this.a.dN().a(this.a, (byte)6);
      }
   }
}
