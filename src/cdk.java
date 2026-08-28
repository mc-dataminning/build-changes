import java.util.EnumSet;

public class cdk extends ccg {
   private final cjd a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public cdk(cjd $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(ccg.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.gJ() && this.a.ca()) {
         fbb $$0 = cgd.a(this.a, 5, 4);
         if ($$0 == null) {
            return false;
         } else {
            this.c = $$0.d;
            this.d = $$0.e;
            this.e = $$0.f;
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.a.P().a(this.c, this.d, this.e, this.b);
   }

   @Override
   public boolean c() {
      return !this.a.gJ() && !this.a.P().k() && this.a.ca();
   }

   @Override
   public void a() {
      if (!this.a.gJ() && this.a.dY().a(this.a(50)) == 0) {
         bum $$0 = this.a.cZ();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof coy $$1) {
            int $$2 = this.a.gP();
            int $$3 = this.a.gV();
            if ($$3 > 0 && this.a.dY().a($$3) < $$2) {
               this.a.g($$1);
               return;
            }

            this.a.u(5);
         }

         this.a.bP();
         this.a.gZ();
         this.a.dV().a(this.a, (byte)6);
      }
   }
}
