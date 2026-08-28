import java.util.EnumSet;

public class cdj extends ccf {
   private final cjc a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public cdj(cjc $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(ccf.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.gD() && this.a.ca()) {
         ezy $$0 = cgc.a(this.a, 5, 4);
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
      return !this.a.gD() && !this.a.L().m() && this.a.ca();
   }

   @Override
   public void a() {
      if (!this.a.gD() && this.a.dY().a(this.a(50)) == 0) {
         bul $$0 = this.a.da();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cou $$1) {
            int $$2 = this.a.gJ();
            int $$3 = this.a.gP();
            if ($$3 > 0 && this.a.dY().a($$3) < $$2) {
               this.a.g($$1);
               return;
            }

            this.a.u(5);
         }

         this.a.bP();
         this.a.gT();
         this.a.dV().a(this.a, (byte)6);
      }
   }
}
