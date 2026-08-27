public class bsn extends bsg {
   private final double b;
   private final double c;

   public bsn(String $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
      } else if ($$1 < $$2) {
         throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
      } else if ($$1 > $$3) {
         throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
      }
   }

   public double d() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   @Override
   public double a(double $$0) {
      return Double.isNaN($$0) ? this.b : axw.a($$0, this.b, this.c);
   }
}
