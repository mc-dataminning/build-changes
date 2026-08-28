public interface fgj extends btz {
   czk f();

   default czk c(int $$0) {
      return this.f().a($$0);
   }

   void b(czk var1);

   default czk h() {
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
   default czk b(int $$0) {
      return this.a($$0, this.ak_());
   }

   @Override
   default czk a(int $$0) {
      return $$0 == 0 ? this.f() : czk.k;
   }

   @Override
   default czk a(int $$0, int $$1) {
      return $$0 != 0 ? czk.k : this.c($$1);
   }

   @Override
   default void a(int $$0, czk $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends fgj {
      dxm t();

      @Override
      default boolean a(crj $$0) {
         return btz.a(this.t(), $$0);
      }
   }
}
