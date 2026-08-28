public interface feg extends btj {
   cxy f();

   default cxy c(int $$0) {
      return this.f().a($$0);
   }

   void b(cxy var1);

   default cxy h() {
      return this.c(this.aj_());
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
   default cxy b(int $$0) {
      return this.a($$0, this.aj_());
   }

   @Override
   default cxy a(int $$0) {
      return $$0 == 0 ? this.f() : cxy.k;
   }

   @Override
   default cxy a(int $$0, int $$1) {
      return $$0 != 0 ? cxy.k : this.c($$1);
   }

   @Override
   default void a(int $$0, cxy $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends feg {
      dvl t();

      @Override
      default boolean a(cqi $$0) {
         return btj.a(this.t(), $$0);
      }
   }
}
