public interface cta {
   int K_();

   int J_();

   default int ak() {
      return this.J_() + this.K_();
   }

   default int al() {
      return this.an() - this.am();
   }

   default int am() {
      return ix.a(this.J_());
   }

   default int an() {
      return ix.a(this.ak() - 1) + 1;
   }

   default boolean r(hv $$0) {
      return this.d($$0.v());
   }

   default boolean d(int $$0) {
      return $$0 < this.J_() || $$0 >= this.ak();
   }

   default int e(int $$0) {
      return this.f(ix.a($$0));
   }

   default int f(int $$0) {
      return $$0 - this.am();
   }

   default int g(int $$0) {
      return $$0 + this.am();
   }

   static cta e(final int $$0, final int $$1) {
      return new cta() {
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
