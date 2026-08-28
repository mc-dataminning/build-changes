public interface dei {
   int H_();

   int G_();

   default int an() {
      return this.G_() + this.H_() - 1;
   }

   default int ao() {
      return this.aq() - this.ap() + 1;
   }

   default int ap() {
      return kg.a(this.G_());
   }

   default int aq() {
      return kg.a(this.an());
   }

   default boolean d(int $$0) {
      return $$0 >= this.G_() && $$0 <= this.an();
   }

   default boolean s(je $$0) {
      return this.e($$0.v());
   }

   default boolean e(int $$0) {
      return $$0 < this.G_() || $$0 > this.an();
   }

   default int f(int $$0) {
      return this.g(kg.a($$0));
   }

   default int g(int $$0) {
      return $$0 - this.ap();
   }

   default int h(int $$0) {
      return $$0 + this.ap();
   }

   static dei e(final int $$0, final int $$1) {
      return new dei() {
         @Override
         public int H_() {
            return $$1;
         }

         @Override
         public int G_() {
            return $$0;
         }
      };
   }
}
