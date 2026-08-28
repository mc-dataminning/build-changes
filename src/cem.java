import java.util.EnumSet;

public class cem extends cdy {
   private final bxk a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public cem(bxk $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(cdy.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.ga()) {
         return false;
      } else {
         fei $$0 = chv.a(this.a, 16, 7, fei.c(this.a.gb()), (float) (Math.PI / 2));
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
