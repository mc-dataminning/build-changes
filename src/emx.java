public interface emx extends bjo {
   cmr x();

   cmr c(int var1);

   void b(cmr var1);

   dgo y();

   default cmr h() {
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
   default cmr b(int $$0) {
      return this.a($$0, this.ak_());
   }

   @Override
   default cmr a(int $$0) {
      return $$0 == 0 ? this.x() : cmr.f;
   }

   @Override
   default cmr a(int $$0, int $$1) {
      return $$0 != 0 ? cmr.f : this.c($$1);
   }

   @Override
   default void a(int $$0, cmr $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   @Override
   default boolean a(cfb $$0) {
      return bjo.a(this.y(), $$0);
   }
}
