public interface fck extends bsb {
   cwn f();

   default cwn c(int $$0) {
      return this.f().a($$0);
   }

   void b(cwn var1);

   default cwn h() {
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
   default cwn b(int $$0) {
      return this.a($$0, this.an_());
   }

   @Override
   default cwn a(int $$0) {
      return $$0 == 0 ? this.f() : cwn.j;
   }

   @Override
   default cwn a(int $$0, int $$1) {
      return $$0 != 0 ? cwn.j : this.c($$1);
   }

   @Override
   default void a(int $$0, cwn $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends fck {
      dtx t();

      @Override
      default boolean a(cov $$0) {
         return bsb.a(this.t(), $$0);
      }
   }
}
