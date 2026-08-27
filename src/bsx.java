import java.util.EnumSet;

public class bsx extends brt {
   private final byi a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public bsx(byi $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(brt.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.gt() && this.a.bO()) {
         eji $$0 = bvo.a(this.a, 5, 4);
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
      return !this.a.gt() && !this.a.L().l() && this.a.bO();
   }

   @Override
   public void e() {
      if (!this.a.gt() && this.a.ef().a(this.a(50)) == 0) {
         bki $$0 = this.a.cQ();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cdm $$1) {
            int $$2 = this.a.gz();
            int $$3 = this.a.gF();
            if ($$3 > 0 && this.a.ef().a($$3) < $$2) {
               this.a.h($$1);
               return;
            }

            this.a.v(5);
         }

         this.a.bA();
         this.a.gK();
         this.a.dL().a(this.a, (byte)6);
      }
   }
}
