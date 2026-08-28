public interface fdj extends btb {
   cxo f();

   default cxo c(int $$0) {
      return this.f().a($$0);
   }

   void b(cxo var1);

   default cxo h() {
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
   default cxo b(int $$0) {
      return this.a($$0, this.ao_());
   }

   @Override
   default cxo a(int $$0) {
      return $$0 == 0 ? this.f() : cxo.k;
   }

   @Override
   default cxo a(int $$0, int $$1) {
      return $$0 != 0 ? cxo.k : this.c($$1);
   }

   @Override
   default void a(int $$0, cxo $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends fdj {
      duw v();

      @Override
      default boolean a(cpw $$0) {
         return btb.a(this.v(), $$0);
      }
   }
}
