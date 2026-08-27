public interface cqd {
   int I_();

   int H_();

   default int aj() {
      return this.H_() + this.I_();
   }

   default int ak() {
      return this.am() - this.al();
   }

   default int al() {
      return hw.a(this.H_());
   }

   default int am() {
      return hw.a(this.aj() - 1) + 1;
   }

   default boolean r(gw $$0) {
      return this.d($$0.v());
   }

   default boolean d(int $$0) {
      return $$0 < this.H_() || $$0 >= this.aj();
   }

   default int e(int $$0) {
      return this.f(hw.a($$0));
   }

   default int f(int $$0) {
      return $$0 - this.al();
   }

   default int g(int $$0) {
      return $$0 + this.al();
   }

   static cqd e(final int $$0, final int $$1) {
      return new cqd() {
         @Override
         public int I_() {
            return $$1;
         }

         @Override
         public int H_() {
            return $$0;
         }
      };
   }
}
