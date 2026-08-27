import java.util.EnumSet;

public class btf extends bsb {
   private final byq a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public btf(byq $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bsb.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.gu() && this.a.bP()) {
         eju $$0 = bvw.a(this.a, 5, 4);
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
      this.a.N().a(this.c, this.d, this.e, this.b);
   }

   @Override
   public boolean b() {
      return !this.a.gu() && !this.a.N().l() && this.a.bP();
   }

   @Override
   public void e() {
      if (!this.a.gu() && this.a.eh().a(this.a(50)) == 0) {
         bkq $$0 = this.a.cR();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cdu $$1) {
            int $$2 = this.a.gA();
            int $$3 = this.a.gG();
            if ($$3 > 0 && this.a.eh().a($$3) < $$2) {
               this.a.h($$1);
               return;
            }

            this.a.v(5);
         }

         this.a.bB();
         this.a.gL();
         this.a.dN().a(this.a, (byte)6);
      }
   }
}
