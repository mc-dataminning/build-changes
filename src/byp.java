import java.util.EnumSet;

public class byp extends bxl {
   private final cef a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public byp(cef $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bxl.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.gC() && this.a.bP()) {
         esa $$0 = cbi.a(this.a, 5, 4);
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
      return !this.a.gC() && !this.a.K().l() && this.a.bP();
   }

   @Override
   public void e() {
      if (!this.a.gC() && this.a.ei().a(this.a(50)) == 0) {
         bpv $$0 = this.a.cQ();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cjt $$1) {
            int $$2 = this.a.gI();
            int $$3 = this.a.gN();
            if ($$3 > 0 && this.a.ei().a($$3) < $$2) {
               this.a.h($$1);
               return;
            }

            this.a.w(5);
         }

         this.a.bE();
         this.a.gS();
         this.a.dM().a(this.a, (byte)6);
      }
   }
}
