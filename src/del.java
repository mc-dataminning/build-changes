public interface del {
   int I_();

   int H_();

   default int an() {
      return this.H_() + this.I_() - 1;
   }

   default int ao() {
      return this.aq() - this.ap() + 1;
   }

   default int ap() {
      return kh.a(this.H_());
   }

   default int aq() {
      return kh.a(this.an());
   }

   default boolean d(int $$0) {
      return $$0 >= this.H_() && $$0 <= this.an();
   }

   default boolean s(jf $$0) {
      return this.e($$0.v());
   }

   default boolean e(int $$0) {
      return $$0 < this.H_() || $$0 > this.an();
   }

   default int f(int $$0) {
      return this.g(kh.a($$0));
   }

   default int g(int $$0) {
      return $$0 - this.ap();
   }

   default int h(int $$0) {
      return $$0 + this.ap();
   }

   static del e(final int $$0, final int $$1) {
      return new del() {
         @Override
         public int I_() {
            return $$1;
         }

         @Override
         public int H_() {
            return $$0;
         }
      };
   }
}
