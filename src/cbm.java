import java.util.EnumSet;

public class cbm extends cai {
   private final che a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public cbm(che $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cai.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.gF() && this.a.bS()) {
         evm $$0 = cef.a(this.a, 5, 4);
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
      return !this.a.gF() && !this.a.K().l() && this.a.bS();
   }

   @Override
   public void e() {
      if (!this.a.gF() && this.a.el().a(this.a(50)) == 0) {
         bsp $$0 = this.a.cT();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cms $$1) {
            int $$2 = this.a.gL();
            int $$3 = this.a.gQ();
            if ($$3 > 0 && this.a.el().a($$3) < $$2) {
               this.a.h($$1);
               return;
            }

            this.a.w(5);
         }

         this.a.bH();
         this.a.gV();
         this.a.dP().a(this.a, (byte)6);
      }
   }
}
