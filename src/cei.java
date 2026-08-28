import java.util.EnumSet;

public class cei extends cde {
   private final ckb a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public cei(ckb $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cde.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.gF() && this.a.ca()) {
         fby $$0 = chb.a(this.a, 5, 4);
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
      return !this.a.gF() && !this.a.L().m() && this.a.ca();
   }

   @Override
   public void a() {
      if (!this.a.gF() && this.a.dZ().a(this.a(50)) == 0) {
         bvk $$0 = this.a.da();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cpx $$1) {
            int $$2 = this.a.gL();
            int $$3 = this.a.gR();
            if ($$3 > 0 && this.a.dZ().a($$3) < $$2) {
               this.a.g($$1);
               return;
            }

            this.a.u(5);
         }

         this.a.bP();
         this.a.gV();
         this.a.dW().a(this.a, (byte)6);
      }
   }
}
