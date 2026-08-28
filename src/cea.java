import java.util.EnumSet;

public class cea extends ccw {
   private final cjw a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public cea(cjw $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(ccw.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.gJ() && this.a.bZ()) {
         fbx $$0 = cgt.a(this.a, 5, 4);
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
      return !this.a.gJ() && !this.a.O().k() && this.a.bZ();
   }

   @Override
   public void a() {
      if (!this.a.gJ() && this.a.dX().a(this.a(50)) == 0) {
         bva $$0 = this.a.cY();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cpr $$1) {
            int $$2 = this.a.gP();
            int $$3 = this.a.gV();
            if ($$3 > 0 && this.a.dX().a($$3) < $$2) {
               this.a.f($$1);
               return;
            }

            this.a.u(5);
         }

         this.a.bN();
         this.a.gZ();
         this.a.dU().a(this.a, (byte)6);
      }
   }
}
