import java.util.EnumSet;

public class cdh extends ccd {
   private final cja a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public cdh(cja $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(ccd.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.gG() && this.a.ca()) {
         fay $$0 = cga.a(this.a, 5, 4);
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
      this.a.L().a(this.c, this.d, this.e, this.b);
   }

   @Override
   public boolean c() {
      return !this.a.gG() && !this.a.L().k() && this.a.ca();
   }

   @Override
   public void a() {
      if (!this.a.gG() && this.a.dZ().a(this.a(50)) == 0) {
         buj $$0 = this.a.da();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cov $$1) {
            int $$2 = this.a.gM();
            int $$3 = this.a.gS();
            if ($$3 > 0 && this.a.dZ().a($$3) < $$2) {
               this.a.g($$1);
               return;
            }

            this.a.u(5);
         }

         this.a.bP();
         this.a.gW();
         this.a.dW().a(this.a, (byte)6);
      }
   }
}
