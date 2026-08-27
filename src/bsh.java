import java.util.EnumSet;

public class bsh extends brt {
   private final blh a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public bsh(blh $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(brt.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.fM()) {
         return false;
      } else {
         eji $$0 = bvo.a(this.a, 16, 7, eji.c(this.a.fN()), (float) (Math.PI / 2));
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.c;
            this.c = $$0.d;
            this.d = $$0.e;
            return true;
         }
      }
   }

   @Override
   public boolean b() {
      return !this.a.L().l();
   }

   @Override
   public void c() {
      this.a.L().a(this.b, this.c, this.d, this.e);
   }
}
