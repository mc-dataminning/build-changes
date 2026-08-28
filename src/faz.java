public interface faz extends brw {
   cwb f();

   default cwb c(int $$0) {
      return this.f().a($$0);
   }

   void b(cwb var1);

   default cwb h() {
      return this.c(this.am_());
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
   default cwb b(int $$0) {
      return this.a($$0, this.am_());
   }

   @Override
   default cwb a(int $$0) {
      return $$0 == 0 ? this.f() : cwb.k;
   }

   @Override
   default cwb a(int $$0, int $$1) {
      return $$0 != 0 ? cwb.k : this.c($$1);
   }

   @Override
   default void a(int $$0, cwb $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends faz {
      dsm v();

      @Override
      default boolean a(com $$0) {
         return brw.a(this.v(), $$0);
      }
   }
}
