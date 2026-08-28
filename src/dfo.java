public interface dfo {
   int L_();

   int K_();

   default int al() {
      return this.K_() + this.L_() - 1;
   }

   default int am() {
      return this.ao() - this.an() + 1;
   }

   default int an() {
      return kj.a(this.K_());
   }

   default int ao() {
      return kj.a(this.al());
   }

   default boolean d(int $$0) {
      return $$0 >= this.K_() && $$0 <= this.al();
   }

   default boolean s(jh $$0) {
      return this.e($$0.v());
   }

   default boolean e(int $$0) {
      return $$0 < this.K_() || $$0 > this.al();
   }

   default int f(int $$0) {
      return this.g(kj.a($$0));
   }

   default int g(int $$0) {
      return $$0 - this.an();
   }

   default int h(int $$0) {
      return $$0 + this.an();
   }

   static dfo e(final int $$0, final int $$1) {
      return new dfo() {
         @Override
         public int L_() {
            return $$1;
         }

         @Override
         public int K_() {
            return $$0;
         }
      };
   }
}
