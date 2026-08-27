public interface ctz {
   int K_();

   int J_();

   default int al() {
      return this.J_() + this.K_();
   }

   default int am() {
      return this.ao() - this.an();
   }

   default int an() {
      return iz.a(this.J_());
   }

   default int ao() {
      return iz.a(this.al() - 1) + 1;
   }

   default boolean s(hx $$0) {
      return this.d($$0.v());
   }

   default boolean d(int $$0) {
      return $$0 < this.J_() || $$0 >= this.al();
   }

   default int e(int $$0) {
      return this.f(iz.a($$0));
   }

   default int f(int $$0) {
      return $$0 - this.an();
   }

   default int g(int $$0) {
      return $$0 + this.an();
   }

   static ctz e(final int $$0, final int $$1) {
      return new ctz() {
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
