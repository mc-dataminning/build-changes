import java.util.EnumSet;

public class cfg extends ces {
   private final bye a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public cfg(bye $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(ces.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.ge()) {
         return false;
      } else {
         ffs $$0 = cip.a(this.a, 16, 7, ffs.c(this.a.gf()), (float) (Math.PI / 2));
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
      return !this.a.O().k();
   }

   @Override
   public void d() {
      this.a.O().a(this.b, this.c, this.d, this.e);
   }
}
