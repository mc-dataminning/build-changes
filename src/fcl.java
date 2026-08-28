public interface fcl extends bsc {
   cwo f();

   default cwo c(int $$0) {
      return this.f().a($$0);
   }

   void b(cwo var1);

   default cwo h() {
      return this.c(this.an_());
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
   default cwo b(int $$0) {
      return this.a($$0, this.an_());
   }

   @Override
   default cwo a(int $$0) {
      return $$0 == 0 ? this.f() : cwo.j;
   }

   @Override
   default cwo a(int $$0, int $$1) {
      return $$0 != 0 ? cwo.j : this.c($$1);
   }

   @Override
   default void a(int $$0, cwo $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends fcl {
      dty t();

      @Override
      default boolean a(cow $$0) {
         return bsc.a(this.t(), $$0);
      }
   }
}
