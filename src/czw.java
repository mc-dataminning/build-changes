public interface czw {
   int J_();

   int I_();

   default int al() {
      return this.I_() + this.J_();
   }

   default int am() {
      return this.ao() - this.an();
   }

   default int an() {
      return jo.a(this.I_());
   }

   default int ao() {
      return jo.a(this.al() - 1) + 1;
   }

   default boolean s(im $$0) {
      return this.d($$0.v());
   }

   default boolean d(int $$0) {
      return $$0 < this.I_() || $$0 >= this.al();
   }

   default int e(int $$0) {
      return this.f(jo.a($$0));
   }

   default int f(int $$0) {
      return $$0 - this.an();
   }

   default int g(int $$0) {
      return $$0 + this.an();
   }

   static czw e(final int $$0, final int $$1) {
      return new czw() {
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
