public interface fcn extends bse {
   cwq f();

   default cwq c(int $$0) {
      return this.f().a($$0);
   }

   void b(cwq var1);

   default cwq h() {
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
   default cwq b(int $$0) {
      return this.a($$0, this.an_());
   }

   @Override
   default cwq a(int $$0) {
      return $$0 == 0 ? this.f() : cwq.j;
   }

   @Override
   default cwq a(int $$0, int $$1) {
      return $$0 != 0 ? cwq.j : this.c($$1);
   }

   @Override
   default void a(int $$0, cwq $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends fcn {
      dua t();

      @Override
      default boolean a(coy $$0) {
         return bse.a(this.t(), $$0);
      }
   }
}
