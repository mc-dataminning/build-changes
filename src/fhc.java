public interface fhc extends buk {
   czy f();

   default czy c(int $$0) {
      return this.f().a($$0);
   }

   void b(czy var1);

   default czy h() {
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
   default czy b(int $$0) {
      return this.a($$0, this.ao_());
   }

   @Override
   default czy a(int $$0) {
      return $$0 == 0 ? this.f() : czy.k;
   }

   @Override
   default czy a(int $$0, int $$1) {
      return $$0 != 0 ? czy.k : this.c($$1);
   }

   @Override
   default void a(int $$0, czy $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends fhc {
      dyc t();

      @Override
      default boolean a(crx $$0) {
         return buk.a(this.t(), $$0);
      }
   }
}
