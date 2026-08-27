public interface cwg {
   int K_();

   int J_();

   default int ak() {
      return this.J_() + this.K_();
   }

   default int al() {
      return this.an() - this.am();
   }

   default int am() {
      return jd.a(this.J_());
   }

   default int an() {
      return jd.a(this.ak() - 1) + 1;
   }

   default boolean s(ib $$0) {
      return this.d($$0.v());
   }

   default boolean d(int $$0) {
      return $$0 < this.J_() || $$0 >= this.ak();
   }

   default int e(int $$0) {
      return this.f(jd.a($$0));
   }

   default int f(int $$0) {
      return $$0 - this.am();
   }

   default int g(int $$0) {
      return $$0 + this.am();
   }

   static cwg e(final int $$0, final int $$1) {
      return new cwg() {
         @Override
         public int K_() {
            return $$1;
         }

         @Override
         public int J_() {
            return $$0;
         }
      };
   }
}
