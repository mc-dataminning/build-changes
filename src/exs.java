public interface exs extends bqa {
   cud f();

   default cud c(int $$0) {
      return this.f().a($$0);
   }

   void b(cud var1);

   default cud h() {
      return this.c(this.ah_());
   }

   @Override
   default int b() {
      return 1;
   }

   @Override
   default boolean c() {
      return this.f().e();
   }

   @Override
   default void a() {
      this.h();
   }

   @Override
   default cud b(int $$0) {
      return this.a($$0, this.ah_());
   }

   @Override
   default cud a(int $$0) {
      return $$0 == 0 ? this.f() : cud.l;
   }

   @Override
   default cud a(int $$0, int $$1) {
      return $$0 != 0 ? cud.l : this.c($$1);
   }

   @Override
   default void a(int $$0, cud $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends exs {
      dpq v();

      @Override
      default boolean a(cml $$0) {
         return bqa.a(this.v(), $$0);
      }
   }
}
