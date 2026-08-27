public interface cru {
   int J_();

   int I_();

   default int aj() {
      return this.I_() + this.J_();
   }

   default int ak() {
      return this.am() - this.al();
   }

   default int al() {
      return iu.a(this.I_());
   }

   default int am() {
      return iu.a(this.aj() - 1) + 1;
   }

   default boolean r(ht $$0) {
      return this.d($$0.v());
   }

   default boolean d(int $$0) {
      return $$0 < this.I_() || $$0 >= this.aj();
   }

   default int e(int $$0) {
      return this.f(iu.a($$0));
   }

   default int f(int $$0) {
      return $$0 - this.al();
   }

   default int g(int $$0) {
      return $$0 + this.al();
   }

   static cru e(final int $$0, final int $$1) {
      return new cru() {
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
