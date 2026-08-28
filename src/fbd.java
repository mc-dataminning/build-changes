public interface fbd extends bsa {
   cwf f();

   default cwf c(int $$0) {
      return this.f().a($$0);
   }

   void b(cwf var1);

   default cwf h() {
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
   default cwf b(int $$0) {
      return this.a($$0, this.am_());
   }

   @Override
   default cwf a(int $$0) {
      return $$0 == 0 ? this.f() : cwf.k;
   }

   @Override
   default cwf a(int $$0, int $$1) {
      return $$0 != 0 ? cwf.k : this.c($$1);
   }

   @Override
   default void a(int $$0, cwf $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends fbd {
      dsr v();

      @Override
      default boolean a(cor $$0) {
         return bsa.a(this.v(), $$0);
      }
   }
}
