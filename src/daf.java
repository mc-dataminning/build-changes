public interface daf {
   int J_();

   int I_();

   default int al() {
      return this.I_() + this.J_();
   }

   default int am() {
      return this.ao() - this.an();
   }

   default int an() {
      return jp.a(this.I_());
   }

   default int ao() {
      return jp.a(this.al() - 1) + 1;
   }

   default boolean s(in $$0) {
      return this.d($$0.v());
   }

   default boolean d(int $$0) {
      return $$0 < this.I_() || $$0 >= this.al();
   }

   default int e(int $$0) {
      return this.f(jp.a($$0));
   }

   default int f(int $$0) {
      return $$0 - this.an();
   }

   default int g(int $$0) {
      return $$0 + this.an();
   }

   static daf e(final int $$0, final int $$1) {
      return new daf() {
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
