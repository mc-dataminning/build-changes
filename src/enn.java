public interface enn extends bjv {
   cng x();

   cng c(int var1);

   void b(cng var1);

   dhd y();

   default cng h() {
      return this.c(this.al_());
   }

   @Override
   default int b() {
      return 1;
   }

   @Override
   default boolean aj_() {
      return this.x().b();
   }

   @Override
   default void a() {
      this.h();
   }

   @Override
   default cng b(int $$0) {
      return this.a($$0, this.al_());
   }

   @Override
   default cng a(int $$0) {
      return $$0 == 0 ? this.x() : cng.f;
   }

   @Override
   default cng a(int $$0, int $$1) {
      return $$0 != 0 ? cng.f : this.c($$1);
   }

   @Override
   default void a(int $$0, cng $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   @Override
   default boolean a(cfq $$0) {
      return bjv.a(this.y(), $$0);
   }
}
