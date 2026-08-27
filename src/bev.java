public class bev extends bey {
   protected final double a;

   protected bev(bez $$0, int $$1, double $$2) {
      super($$0, $$1);
      this.a = $$2;
   }

   @Override
   public double a(int $$0, bhe $$1) {
      return this.a * (double)($$0 + 1);
   }
}
