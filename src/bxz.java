import java.util.EnumSet;

public class bxz extends bxl {
   private final bqw a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public bxz(bqw $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(bxl.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.fV()) {
         return false;
      } else {
         esa $$0 = cbi.a(this.a, 16, 7, esa.c(this.a.fW()), (float) (Math.PI / 2));
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
      return !this.a.K().l();
   }

   @Override
   public void c() {
      this.a.K().a(this.b, this.c, this.d, this.e);
   }
}
