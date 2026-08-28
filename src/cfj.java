import java.util.EnumSet;

public class cfj extends cef {
   private final cll a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public cfj(cll $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cef.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.gK() && this.a.bY()) {
         fex $$0 = cic.a(this.a, 5, 4);
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
      return !this.a.gK() && !this.a.O().k() && this.a.bY();
   }

   @Override
   public void a() {
      if (!this.a.gK() && this.a.dX().a(this.a(50)) == 0) {
         bwi $$0 = this.a.cY();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof crj $$1) {
            int $$2 = this.a.gQ();
            int $$3 = this.a.gV();
            if ($$3 > 0 && this.a.dX().a($$3) < $$2) {
               this.a.f($$1);
               return;
            }

            this.a.u(5);
         }

         this.a.bM();
         this.a.gZ();
         this.a.dU().a(this.a, (byte)6);
      }
   }
}
