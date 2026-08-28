public interface exc extends bqn {
   cup f();

   default cup c(int $$0) {
      return this.f().a($$0);
   }

   void b(cup var1);

   default cup h() {
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
   default cup b(int $$0) {
      return this.a($$0, this.ah_());
   }

   @Override
   default cup a(int $$0) {
      return $$0 == 0 ? this.f() : cup.l;
   }

   @Override
   default cup a(int $$0, int $$1) {
      return $$0 != 0 ? cup.l : this.c($$1);
   }

   @Override
   default void a(int $$0, cup $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends exc {
      dph v();

      @Override
      default boolean a(cmx $$0) {
         return bqn.a(this.v(), $$0);
      }
   }
}
