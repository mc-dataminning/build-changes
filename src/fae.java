public interface fae extends bri {
   cvp f();

   default cvp c(int $$0) {
      return this.f().a($$0);
   }

   void b(cvp var1);

   default cvp h() {
      return this.c(this.ak_());
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
   default cvp b(int $$0) {
      return this.a($$0, this.ak_());
   }

   @Override
   default cvp a(int $$0) {
      return $$0 == 0 ? this.f() : cvp.k;
   }

   @Override
   default cvp a(int $$0, int $$1) {
      return $$0 != 0 ? cvp.k : this.c($$1);
   }

   @Override
   default void a(int $$0, cvp $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends fae {
      drs v();

      @Override
      default boolean a(cnu $$0) {
         return bri.a(this.v(), $$0);
      }
   }
}
