public interface fcm extends bsd {
   cwp f();

   default cwp c(int $$0) {
      return this.f().a($$0);
   }

   void b(cwp var1);

   default cwp h() {
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
   default cwp b(int $$0) {
      return this.a($$0, this.an_());
   }

   @Override
   default cwp a(int $$0) {
      return $$0 == 0 ? this.f() : cwp.j;
   }

   @Override
   default cwp a(int $$0, int $$1) {
      return $$0 != 0 ? cwp.j : this.c($$1);
   }

   @Override
   default void a(int $$0, cwp $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends fcm {
      dtz t();

      @Override
      default boolean a(cox $$0) {
         return bsd.a(this.t(), $$0);
      }
   }
}
