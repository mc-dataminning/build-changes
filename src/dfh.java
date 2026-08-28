public interface dfh {
   int J_();

   int I_();

   default int al() {
      return this.I_() + this.J_() - 1;
   }

   default int am() {
      return this.ao() - this.an() + 1;
   }

   default int an() {
      return kj.a(this.I_());
   }

   default int ao() {
      return kj.a(this.al());
   }

   default boolean d(int $$0) {
      return $$0 >= this.I_() && $$0 <= this.al();
   }

   default boolean s(jh $$0) {
      return this.e($$0.v());
   }

   default boolean e(int $$0) {
      return $$0 < this.I_() || $$0 > this.al();
   }

   default int f(int $$0) {
      return this.g(kj.a($$0));
   }

   default int g(int $$0) {
      return $$0 - this.an();
   }

   default int h(int $$0) {
      return $$0 + this.an();
   }

   static dfh e(final int $$0, final int $$1) {
      return new dfh() {
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
