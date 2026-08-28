import java.util.EnumSet;

public class cbe extends caa {
   private final cgw a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public cbe(cgw $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(caa.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.gC() && this.a.bU()) {
         ewh $$0 = cdx.a(this.a, 5, 4);
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
      return !this.a.gC() && !this.a.J().l() && this.a.bU();
   }

   @Override
   public void e() {
      if (!this.a.gC() && this.a.dU().a(this.a(50)) == 0) {
         bsh $$0 = this.a.cV();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cml $$1) {
            int $$2 = this.a.gI();
            int $$3 = this.a.gN();
            if ($$3 > 0 && this.a.dU().a($$3) < $$2) {
               this.a.h($$1);
               return;
            }

            this.a.v(5);
         }

         this.a.bJ();
         this.a.gS();
         this.a.dR().a(this.a, (byte)6);
      }
   }
}
