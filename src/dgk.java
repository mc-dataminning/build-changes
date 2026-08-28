public interface dgk {
   int M_();

   int L_();

   default int an() {
      return this.L_() + this.M_() - 1;
   }

   default int ao() {
      return this.aq() - this.ap() + 1;
   }

   default int ap() {
      return kk.a(this.L_());
   }

   default int aq() {
      return kk.a(this.an());
   }

   default boolean d(int $$0) {
      return $$0 >= this.L_() && $$0 <= this.an();
   }

   default boolean s(ji $$0) {
      return this.e($$0.v());
   }

   default boolean e(int $$0) {
      return $$0 < this.L_() || $$0 > this.an();
   }

   default int f(int $$0) {
      return this.g(kk.a($$0));
   }

   default int g(int $$0) {
      return $$0 - this.ap();
   }

   default int h(int $$0) {
      return $$0 + this.ap();
   }

   static dgk e(final int $$0, final int $$1) {
      return new dgk() {
         @Override
         public int M_() {
            return $$1;
         }

         @Override
         public int L_() {
            return $$0;
         }
      };
   }
}
