public interface fat extends brr {
   cvx f();

   default cvx c(int $$0) {
      return this.f().a($$0);
   }

   void b(cvx var1);

   default cvx h() {
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
   default cvx b(int $$0) {
      return this.a($$0, this.am_());
   }

   @Override
   default cvx a(int $$0) {
      return $$0 == 0 ? this.f() : cvx.k;
   }

   @Override
   default cvx a(int $$0, int $$1) {
      return $$0 != 0 ? cvx.k : this.c($$1);
   }

   @Override
   default void a(int $$0, cvx $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends fat {
      dsg v();

      @Override
      default boolean a(coh $$0) {
         return brr.a(this.v(), $$0);
      }
   }
}
