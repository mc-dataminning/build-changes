public interface dex {
   int J_();

   int I_();

   default int an() {
      return this.I_() + this.J_() - 1;
   }

   default int ao() {
      return this.aq() - this.ap() + 1;
   }

   default int ap() {
      return ki.a(this.I_());
   }

   default int aq() {
      return ki.a(this.an());
   }

   default boolean d(int $$0) {
      return $$0 >= this.I_() && $$0 <= this.an();
   }

   default boolean s(jg $$0) {
      return this.e($$0.v());
   }

   default boolean e(int $$0) {
      return $$0 < this.I_() || $$0 > this.an();
   }

   default int f(int $$0) {
      return this.g(ki.a($$0));
   }

   default int g(int $$0) {
      return $$0 - this.ap();
   }

   default int h(int $$0) {
      return $$0 + this.ap();
   }

   static dex e(final int $$0, final int $$1) {
      return new dex() {
         @Override
         public int J_() {
            return $$1;
         }

         @Override
         public int I_() {
            return $$0;
         }
      };
   }
}
