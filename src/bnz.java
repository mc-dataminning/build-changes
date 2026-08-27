import java.util.EnumSet;

public class bnz extends bmv {
   private final btk a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public bnz(btk $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bmv.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.gn() && this.a.bN()) {
         eei $$0 = bqq.a(this.a, 5, 4);
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
      this.a.J().a(this.c, this.d, this.e, this.b);
   }

   @Override
   public boolean b() {
      return !this.a.gn() && !this.a.J().l() && this.a.bN();
   }

   @Override
   public void e() {
      if (!this.a.gn() && this.a.ec().a(this.a(50)) == 0) {
         bfj $$0 = this.a.cN().get(0);
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof byo) {
            int $$1 = this.a.gt();
            int $$2 = this.a.gz();
            if ($$2 > 0 && this.a.ec().a($$2) < $$1) {
               this.a.h((byo)$$0);
               return;
            }

            this.a.v(5);
         }

         this.a.bz();
         this.a.gE();
         this.a.dI().a(this.a, (byte)6);
      }
   }
}
