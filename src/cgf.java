import java.util.EnumSet;

public class cgf extends cfb {
   private final cme a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public cgf(cme $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cfb.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.gL() && this.a.bZ()) {
         fgc $$0 = ciy.a(this.a, 5, 4);
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
      return !this.a.gL() && !this.a.O().k() && this.a.bZ();
   }

   @Override
   public void a() {
      if (!this.a.gL() && this.a.dY().a(this.a(50)) == 0) {
         bxe $$0 = this.a.cZ();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof csi $$1) {
            int $$2 = this.a.gR();
            int $$3 = this.a.gW();
            if ($$3 > 0 && this.a.dY().a($$3) < $$2) {
               this.a.f($$1);
               return;
            }

            this.a.u(5);
         }

         this.a.bN();
         this.a.ha();
         this.a.dV().a(this.a, (byte)6);
      }
   }
}
