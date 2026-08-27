import java.util.EnumSet;

public class btk extends bsg {
   private final byv a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public btk(byv $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bsg.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.gu() && this.a.bP()) {
         ejz $$0 = bwb.a(this.a, 5, 4);
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
         bkv $$0 = this.a.cR();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cdz $$1) {
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
