public interface czi {
   int J_();

   int I_();

   default int al() {
      return this.I_() + this.J_();
   }

   default int am() {
      return this.ao() - this.an();
   }

   default int an() {
      return jg.a(this.I_());
   }

   default int ao() {
      return jg.a(this.al() - 1) + 1;
   }

   default boolean s(id $$0) {
      return this.d($$0.v());
   }

   default boolean d(int $$0) {
      return $$0 < this.I_() || $$0 >= this.al();
   }

   default int e(int $$0) {
      return this.f(jg.a($$0));
   }

   default int f(int $$0) {
      return $$0 - this.an();
   }

   default int g(int $$0) {
      return $$0 + this.an();
   }

   static czi e(final int $$0, final int $$1) {
      return new czi() {
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
