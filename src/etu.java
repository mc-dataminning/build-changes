public interface etu extends bny {
   crs f();

   default crs c(int $$0) {
      return this.f().a($$0);
   }

   void a(crs var1);

   default crs h() {
      return this.c(this.ah_());
   }

   @Override
   default int b() {
      return 1;
   }

   @Override
   default boolean c() {
      return this.f().d();
   }

   @Override
   default void a() {
      this.h();
   }

   @Override
   default crs b(int $$0) {
      return this.a($$0, this.ah_());
   }

   @Override
   default crs a(int $$0) {
      return $$0 == 0 ? this.f() : crs.i;
   }

   @Override
   default crs a(int $$0, int $$1) {
      return $$0 != 0 ? crs.i : this.c($$1);
   }

   @Override
   default void a(int $$0, crs $$1) {
      if ($$0 == 0) {
         this.a($$1);
      }
   }

   public interface a extends etu {
      dmo u();

      @Override
      default boolean a(cka $$0) {
         return bny.a(this.u(), $$0);
      }
   }
}
