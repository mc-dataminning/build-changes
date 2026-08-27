import java.util.EnumSet;

public class btv extends bth {
   private final bmu a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public btv(bmu $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(bth.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.fM()) {
         return false;
      } else {
         elt $$0 = bxd.a(this.a, 16, 7, elt.c(this.a.fN()), (float) (Math.PI / 2));
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
