public interface fhe extends bum {
   daa f();

   default daa c(int $$0) {
      return this.f().a($$0);
   }

   void b(daa var1);

   default daa h() {
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
   default daa b(int $$0) {
      return this.a($$0, this.ao_());
   }

   @Override
   default daa a(int $$0) {
      return $$0 == 0 ? this.f() : daa.k;
   }

   @Override
   default daa a(int $$0, int $$1) {
      return $$0 != 0 ? daa.k : this.c($$1);
   }

   @Override
   default void a(int $$0, daa $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends fhe {
      dye t();

      @Override
      default boolean a(crz $$0) {
         return bum.a(this.t(), $$0);
      }
   }
}
