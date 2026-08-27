import java.util.EnumSet;

public class bwy extends bvu {
   private final cco a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public bwy(cco $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bvu.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.gA() && this.a.bM()) {
         eov $$0 = bzr.a(this.a, 5, 4);
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
      return !this.a.gA() && !this.a.N().l() && this.a.bM();
   }

   @Override
   public void e() {
      if (!this.a.gA() && this.a.ef().a(this.a(50)) == 0) {
         bof $$0 = this.a.cN();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cia $$1) {
            int $$2 = this.a.gG();
            int $$3 = this.a.gM();
            if ($$3 > 0 && this.a.ef().a($$3) < $$2) {
               this.a.h($$1);
               return;
            }

            this.a.w(5);
         }

         this.a.bB();
         this.a.gR();
         this.a.dJ().a(this.a, (byte)6);
      }
   }
}
