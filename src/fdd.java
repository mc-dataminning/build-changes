public interface fdd extends bst {
   cxg f();

   default cxg c(int $$0) {
      return this.f().a($$0);
   }

   void b(cxg var1);

   default cxg h() {
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
   default cxg b(int $$0) {
      return this.a($$0, this.ao_());
   }

   @Override
   default cxg a(int $$0) {
      return $$0 == 0 ? this.f() : cxg.j;
   }

   @Override
   default cxg a(int $$0, int $$1) {
      return $$0 != 0 ? cxg.j : this.c($$1);
   }

   @Override
   default void a(int $$0, cxg $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends fdd {
      duq u();

      @Override
      default boolean a(cpo $$0) {
         return bst.a(this.u(), $$0);
      }
   }
}
