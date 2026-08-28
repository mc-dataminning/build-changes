public interface fgo extends btz {
   czn f();

   default czn c(int $$0) {
      return this.f().a($$0);
   }

   void b(czn var1);

   default czn h() {
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
   default czn b(int $$0) {
      return this.a($$0, this.ak_());
   }

   @Override
   default czn a(int $$0) {
      return $$0 == 0 ? this.f() : czn.k;
   }

   @Override
   default czn a(int $$0, int $$1) {
      return $$0 != 0 ? czn.k : this.c($$1);
   }

   @Override
   default void a(int $$0, czn $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends fgo {
      dxr t();

      @Override
      default boolean a(crm $$0) {
         return btz.a(this.t(), $$0);
      }
   }
}
