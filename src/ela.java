public interface ela extends biq {
   clj v();

   clj c(int var1);

   void b(clj var1);

   dfd w();

   default clj aB_() {
      return this.c(this.aj_());
   }

   @Override
   default int b() {
      return 1;
   }

   @Override
   default boolean ai_() {
      return this.v().b();
   }

   @Override
   default void a() {
      this.aB_();
   }

   @Override
   default clj b(int $$0) {
      return this.a($$0, this.aj_());
   }

   @Override
   default clj a(int $$0) {
      return $$0 == 0 ? this.v() : clj.b;
   }

   @Override
   default clj a(int $$0, int $$1) {
      return $$0 != 0 ? clj.b : this.c($$1);
   }

   @Override
   default void a(int $$0, clj $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   @Override
   default boolean a(cdu $$0) {
      return biq.a(this.w(), $$0);
   }
}
