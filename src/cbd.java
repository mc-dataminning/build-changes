import java.util.EnumSet;

public class cbd extends bzz {
   private final cgv a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public cbd(cgv $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bzz.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.gD() && this.a.bT()) {
         ewf $$0 = cdw.a(this.a, 5, 4);
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
      return !this.a.gD() && !this.a.K().l() && this.a.bT();
   }

   @Override
   public void e() {
      if (!this.a.gD() && this.a.dT().a(this.a(50)) == 0) {
         bsg $$0 = this.a.cU();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cmk $$1) {
            int $$2 = this.a.gJ();
            int $$3 = this.a.gO();
            if ($$3 > 0 && this.a.dT().a($$3) < $$2) {
               this.a.h($$1);
               return;
            }

            this.a.v(5);
         }

         this.a.bI();
         this.a.gT();
         this.a.dQ().a(this.a, (byte)6);
      }
   }
}
