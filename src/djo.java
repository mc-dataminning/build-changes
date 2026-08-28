public interface djo {
   int H_();

   int G_();

   default int ao() {
      return this.G_() + this.H_() - 1;
   }

   default int ap() {
      return this.ar() - this.aq() + 1;
   }

   default int aq() {
      return jy.a(this.G_());
   }

   default int ar() {
      return jy.a(this.ao());
   }

   default boolean d(int $$0) {
      return $$0 >= this.G_() && $$0 <= this.ao();
   }

   default boolean t(iv $$0) {
      return this.e($$0.v());
   }

   default boolean e(int $$0) {
      return $$0 < this.G_() || $$0 > this.ao();
   }

   default int f(int $$0) {
      return this.g(jy.a($$0));
   }

   default int g(int $$0) {
      return $$0 - this.aq();
   }

   default int h(int $$0) {
      return $$0 + this.aq();
   }

   static djo e(final int $$0, final int $$1) {
      return new djo() {
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
