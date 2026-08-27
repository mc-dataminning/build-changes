public interface cxd {
   int J_();

   int I_();

   default int ak() {
      return this.I_() + this.J_();
   }

   default int al() {
      return this.an() - this.am();
   }

   default int am() {
      return je.a(this.I_());
   }

   default int an() {
      return je.a(this.ak() - 1) + 1;
   }

   default boolean s(ib $$0) {
      return this.d($$0.v());
   }

   default boolean d(int $$0) {
      return $$0 < this.I_() || $$0 >= this.ak();
   }

   default int e(int $$0) {
      return this.f(je.a($$0));
   }

   default int f(int $$0) {
      return $$0 - this.am();
   }

   default int g(int $$0) {
      return $$0 + this.am();
   }

   static cxd e(final int $$0, final int $$1) {
      return new cxd() {
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
