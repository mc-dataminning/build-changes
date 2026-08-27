import java.util.EnumSet;

public class brf extends bqb {
   private final bwq a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public brf(bwq $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bqb.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.gs() && this.a.bO()) {
         ehn $$0 = btw.a(this.a, 5, 4);
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
      this.a.L().a(this.c, this.d, this.e, this.b);
   }

   @Override
   public boolean b() {
      return !this.a.gs() && !this.a.L().l() && this.a.bO();
   }

   @Override
   public void e() {
      if (!this.a.gs() && this.a.ef().a(this.a(50)) == 0) {
         biq $$0 = this.a.cQ();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cbu $$1) {
            int $$2 = this.a.gy();
            int $$3 = this.a.gE();
            if ($$3 > 0 && this.a.ef().a($$3) < $$2) {
               this.a.h($$1);
               return;
            }

            this.a.v(5);
         }

         this.a.bA();
         this.a.gJ();
         this.a.dL().a(this.a, (byte)6);
      }
   }
}
