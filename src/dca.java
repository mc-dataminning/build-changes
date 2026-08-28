public interface dca {
   int J_();

   int I_();

   default int am() {
      return this.I_() + this.J_();
   }

   default int an() {
      return this.ap() - this.ao();
   }

   default int ao() {
      return kb.a(this.I_());
   }

   default int ap() {
      return kb.a(this.am() - 1) + 1;
   }

   default boolean s(iz $$0) {
      return this.d($$0.v());
   }

   default boolean d(int $$0) {
      return $$0 < this.I_() || $$0 >= this.am();
   }

   default int e(int $$0) {
      return this.f(kb.a($$0));
   }

   default int f(int $$0) {
      return $$0 - this.ao();
   }

   default int g(int $$0) {
      return $$0 + this.ao();
   }

   static dca e(final int $$0, final int $$1) {
      return new dca() {
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
