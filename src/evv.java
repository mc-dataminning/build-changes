public interface evv extends bpn {
   cto f();

   default cto c(int $$0) {
      return this.f().a($$0);
   }

   void b(cto var1);

   default cto h() {
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
   default cto b(int $$0) {
      return this.a($$0, this.ah_());
   }

   @Override
   default cto a(int $$0) {
      return $$0 == 0 ? this.f() : cto.i;
   }

   @Override
   default cto a(int $$0, int $$1) {
      return $$0 != 0 ? cto.i : this.c($$1);
   }

   @Override
   default void a(int $$0, cto $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends evv {
      dog v();

      @Override
      default boolean a(clw $$0) {
         return bpn.a(this.v(), $$0);
      }
   }
}
