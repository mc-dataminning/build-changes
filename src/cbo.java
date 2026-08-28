import java.util.EnumSet;

public class cbo extends cak {
   private final chg a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public cbo(chg $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cak.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.gB() && this.a.bT()) {
         eww $$0 = ceh.a(this.a, 5, 4);
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
   public void d() {
      this.a.J().a(this.c, this.d, this.e, this.b);
   }

   @Override
   public boolean c() {
      return !this.a.gB() && !this.a.J().l() && this.a.bT();
   }

   @Override
   public void a() {
      if (!this.a.gB() && this.a.dT().a(this.a(50)) == 0) {
         bsq $$0 = this.a.cU();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cmv $$1) {
            int $$2 = this.a.gH();
            int $$3 = this.a.gM();
            if ($$3 > 0 && this.a.dT().a($$3) < $$2) {
               this.a.h($$1);
               return;
            }

            this.a.v(5);
         }

         this.a.bI();
         this.a.gR();
         this.a.dQ().a(this.a, (byte)6);
      }
   }
}
