public interface dhk {
   int M_();

   int L_();

   default int am() {
      return this.L_() + this.M_() - 1;
   }

   default int an() {
      return this.ap() - this.ao() + 1;
   }

   default int ao() {
      return kj.a(this.L_());
   }

   default int ap() {
      return kj.a(this.am());
   }

   default boolean d(int $$0) {
      return $$0 >= this.L_() && $$0 <= this.am();
   }

   default boolean s(jh $$0) {
      return this.e($$0.v());
   }

   default boolean e(int $$0) {
      return $$0 < this.L_() || $$0 > this.am();
   }

   default int f(int $$0) {
      return this.g(kj.a($$0));
   }

   default int g(int $$0) {
      return $$0 - this.ao();
   }

   default int h(int $$0) {
      return $$0 + this.ao();
   }

   static dhk e(final int $$0, final int $$1) {
      return new dhk() {
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
