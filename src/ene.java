public interface ene extends bju {
   cmy x();

   cmy c(int var1);

   void b(cmy var1);

   dgv y();

   default cmy h() {
      return this.c(this.ak_());
   }

   @Override
   default int b() {
      return 1;
   }

   @Override
   default boolean ai_() {
      return this.x().b();
   }

   @Override
   default void a() {
      this.h();
   }

   @Override
   default cmy b(int $$0) {
      return this.a($$0, this.ak_());
   }

   @Override
   default cmy a(int $$0) {
      return $$0 == 0 ? this.x() : cmy.f;
   }

   @Override
   default cmy a(int $$0, int $$1) {
      return $$0 != 0 ? cmy.f : this.c($$1);
   }

   @Override
   default void a(int $$0, cmy $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   @Override
   default boolean a(cfi $$0) {
      return bju.a(this.y(), $$0);
   }
}
