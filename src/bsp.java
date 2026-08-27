import java.util.EnumSet;

public class bsp extends bsb {
   private final blp a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public bsp(blp $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(bsb.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.fN()) {
         return false;
      } else {
         eju $$0 = bvw.a(this.a, 16, 7, eju.c(this.a.fO()), (float) (Math.PI / 2));
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
      return !this.a.N().l();
   }

   @Override
   public void c() {
      this.a.N().a(this.b, this.c, this.d, this.e);
   }
}
