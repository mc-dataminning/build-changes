public interface fai extends brl {
   cvs f();

   default cvs c(int $$0) {
      return this.f().a($$0);
   }

   void b(cvs var1);

   default cvs h() {
      return this.c(this.al_());
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
   default cvs b(int $$0) {
      return this.a($$0, this.al_());
   }

   @Override
   default cvs a(int $$0) {
      return $$0 == 0 ? this.f() : cvs.k;
   }

   @Override
   default cvs a(int $$0, int $$1) {
      return $$0 != 0 ? cvs.k : this.c($$1);
   }

   @Override
   default void a(int $$0, cvs $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends fai {
      drv v();

      @Override
      default boolean a(cnx $$0) {
         return brl.a(this.v(), $$0);
      }
   }
}
