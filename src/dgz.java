public interface dgz extends apf {
   float b = 5.9604645E-8F;
   double c = 1.110223E-16F;

   int c(int var1);

   @Override
   default int f() {
      return this.c(32);
   }

   @Override
   default int a(int $$0) {
      if ($$0 <= 0) {
         throw new IllegalArgumentException("Bound must be positive");
      } else if (($$0 & $$0 - 1) == 0) {
         return (int)((long)$$0 * (long)this.c(31) >> 31);
      } else {
         int $$1;
         int $$2;
         do {
            $$1 = this.c(31);
            $$2 = $$1 % $$0;
         } while ($$1 - $$2 + ($$0 - 1) < 0);

         return $$2;
      }
   }

   @Override
   default long g() {
      int $$0 = this.c(32);
      int $$1 = this.c(32);
      long $$2 = (long)$$0 << 32;
      return $$2 + (long)$$1;
   }

   @Override
   default boolean h() {
      return this.c(1) != 0;
   }

   @Override
   default float i() {
      return (float)this.c(24) * 5.9604645E-8F;
   }

   @Override
   default double j() {
      int $$0 = this.c(26);
      int $$1 = this.c(27);
      long $$2 = ((long)$$0 << 27) + (long)$$1;
      return (double)$$2 * 1.110223E-16F;
   }
}
