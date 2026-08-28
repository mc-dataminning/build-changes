public interface ddu {
   int H_();

   int G_();

   default int an() {
      return this.G_() + this.H_();
   }

   default int ao() {
      return this.aq() - this.ap();
   }

   default int ap() {
      return kg.a(this.G_());
   }

   default int aq() {
      return kg.a(this.an() - 1) + 1;
   }

   default boolean s(je $$0) {
      return this.d($$0.v());
   }

   default boolean d(int $$0) {
      return $$0 < this.G_() || $$0 >= this.an();
   }

   default int e(int $$0) {
      return this.f(kg.a($$0));
   }

   default int f(int $$0) {
      return $$0 - this.ap();
   }

   default int g(int $$0) {
      return $$0 + this.ap();
   }

   static ddu e(final int $$0, final int $$1) {
      return new ddu() {
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
