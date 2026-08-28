import java.util.EnumSet;

public class ccl extends cbh {
   private final cie a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public ccl(cie $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cbh.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.gG() && this.a.bX()) {
         eys $$0 = cfe.a(this.a, 5, 4);
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
      this.a.P().a(this.c, this.d, this.e, this.b);
   }

   @Override
   public boolean c() {
      return !this.a.gG() && !this.a.P().m() && this.a.bX();
   }

   @Override
   public void a() {
      if (!this.a.gG() && this.a.dV().a(this.a(50)) == 0) {
         bto $$0 = this.a.cX();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cnu $$1) {
            int $$2 = this.a.gM();
            int $$3 = this.a.gS();
            if ($$3 > 0 && this.a.dV().a($$3) < $$2) {
               this.a.g($$1);
               return;
            }

            this.a.v(5);
         }

         this.a.bM();
         this.a.gX();
         this.a.dS().a(this.a, (byte)6);
      }
   }
}
