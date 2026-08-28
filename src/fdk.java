public interface fdk extends btc {
   cxp f();

   default cxp c(int $$0) {
      return this.f().a($$0);
   }

   void b(cxp var1);

   default cxp h() {
      return this.c(this.ao_());
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
   default cxp b(int $$0) {
      return this.a($$0, this.ao_());
   }

   @Override
   default cxp a(int $$0) {
      return $$0 == 0 ? this.f() : cxp.j;
   }

   @Override
   default cxp a(int $$0, int $$1) {
      return $$0 != 0 ? cxp.j : this.c($$1);
   }

   @Override
   default void a(int $$0, cxp $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends fdk {
      dux v();

      @Override
      default boolean a(cpx $$0) {
         return btc.a(this.v(), $$0);
      }
   }
}
