import java.util.EnumSet;

public class cfc extends cdy {
   private final cld a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public cfc(cld $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cdy.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.gH() && this.a.ca()) {
         fei $$0 = chv.a(this.a, 5, 4);
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
      this.a.O().a(this.c, this.d, this.e, this.b);
   }

   @Override
   public boolean c() {
      return !this.a.gH() && !this.a.O().k() && this.a.ca();
   }

   @Override
   public void a() {
      if (!this.a.gH() && this.a.dY().a(this.a(50)) == 0) {
         bwd $$0 = this.a.cZ();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cqy $$1) {
            int $$2 = this.a.gN();
            int $$3 = this.a.gS();
            if ($$3 > 0 && this.a.dY().a($$3) < $$2) {
               this.a.f($$1);
               return;
            }

            this.a.u(5);
         }

         this.a.bO();
         this.a.gW();
         this.a.dV().a(this.a, (byte)6);
      }
   }
}
