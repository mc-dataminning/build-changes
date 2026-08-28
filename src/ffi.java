public interface ffi extends btr {
   cys f();

   default cys c(int $$0) {
      return this.f().a($$0);
   }

   void b(cys var1);

   default cys h() {
      return this.c(this.aj_());
   }

   @Override
   default int b() {
      return 1;
   }

   @Override
   default boolean c() {
      return this.f().f();
   }

   @Override
   default void a() {
      this.h();
   }

   @Override
   default cys b(int $$0) {
      return this.a($$0, this.aj_());
   }

   @Override
   default cys a(int $$0) {
      return $$0 == 0 ? this.f() : cys.k;
   }

   @Override
   default cys a(int $$0, int $$1) {
      return $$0 != 0 ? cys.k : this.c($$1);
   }

   @Override
   default void a(int $$0, cys $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends ffi {
      dwn t();

      @Override
      default boolean a(cqs $$0) {
         return btr.a(this.t(), $$0);
      }
   }
}
