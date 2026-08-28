public interface fgc extends btw {
   czd f();

   default czd c(int $$0) {
      return this.f().a($$0);
   }

   void b(czd var1);

   default czd h() {
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
   default czd b(int $$0) {
      return this.a($$0, this.ak_());
   }

   @Override
   default czd a(int $$0) {
      return $$0 == 0 ? this.f() : czd.k;
   }

   @Override
   default czd a(int $$0, int $$1) {
      return $$0 != 0 ? czd.k : this.c($$1);
   }

   @Override
   default void a(int $$0, czd $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends fgc {
      dxf t();

      @Override
      default boolean a(crc $$0) {
         return btw.a(this.t(), $$0);
      }
   }
}
