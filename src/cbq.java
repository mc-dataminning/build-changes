import java.util.EnumSet;

public class cbq extends cam {
   private final chi a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public cbq(chi $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cam.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.gA() && this.a.bT()) {
         exa $$0 = cej.a(this.a, 5, 4);
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
   public void d() {
      this.a.N().a(this.c, this.d, this.e, this.b);
   }

   @Override
   public boolean c() {
      return !this.a.gA() && !this.a.N().l() && this.a.bT();
   }

   @Override
   public void a() {
      if (!this.a.gA() && this.a.dS().a(this.a(50)) == 0) {
         bsr $$0 = this.a.cU();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cmx $$1) {
            int $$2 = this.a.gG();
            int $$3 = this.a.gM();
            if ($$3 > 0 && this.a.dS().a($$3) < $$2) {
               this.a.g($$1);
               return;
            }

            this.a.v(5);
         }

         this.a.bI();
         this.a.gR();
         this.a.dP().a(this.a, (byte)6);
      }
   }
}
