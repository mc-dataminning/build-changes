import java.util.EnumSet;

public class cdj extends ccv {
   private final bwf a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public cdj(bwf $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(ccv.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.ak()) {
         return false;
      } else {
         fbr $$0 = cgs.a(this.a, 16, 7, fbr.c(this.a.fX()), (float) (Math.PI / 2));
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.d;
            this.c = $$0.e;
            this.d = $$0.f;
            return true;
         }
      }
   }

   @Override
   public boolean c() {
      return !this.a.L().m();
   }

   @Override
   public void d() {
      this.a.L().a(this.b, this.c, this.d, this.e);
   }
}
