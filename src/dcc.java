public interface dcc {
   int K_();

   int J_();

   default int am() {
      return this.J_() + this.K_();
   }

   default int an() {
      return this.ap() - this.ao();
   }

   default int ao() {
      return jt.a(this.J_());
   }

   default int ap() {
      return jt.a(this.am() - 1) + 1;
   }

   default boolean s(ir $$0) {
      return this.d($$0.v());
   }

   default boolean d(int $$0) {
      return $$0 < this.J_() || $$0 >= this.am();
   }

   default int e(int $$0) {
      return this.f(jt.a($$0));
   }

   default int f(int $$0) {
      return $$0 - this.ao();
   }

   default int g(int $$0) {
      return $$0 + this.ao();
   }

   static dcc d(final int $$0, final int $$1) {
      return new dcc() {
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
