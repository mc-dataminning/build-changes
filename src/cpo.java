public interface cpo {
   int D_();

   int C_();

   default int aj() {
      return this.C_() + this.D_();
   }

   default int ak() {
      return this.am() - this.al();
   }

   default int al() {
      return hx.a(this.C_());
   }

   default int am() {
      return hx.a(this.aj() - 1) + 1;
   }

   default boolean r(gu $$0) {
      return this.d($$0.v());
   }

   default boolean d(int $$0) {
      return $$0 < this.C_() || $$0 >= this.aj();
   }

   default int e(int $$0) {
      return this.f(hx.a($$0));
   }

   default int f(int $$0) {
      return $$0 - this.al();
   }

   default int g(int $$0) {
      return $$0 + this.al();
   }

   static cpo e(final int $$0, final int $$1) {
      return new cpo() {
         @Override
         public int D_() {
            return $$1;
         }

         @Override
         public int C_() {
            return $$0;
         }
      };
   }
}
