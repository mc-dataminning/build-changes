public interface eyf extends bpt {
   cuh f();

   default cuh c(int $$0) {
      return this.f().a($$0);
   }

   void b(cuh var1);

   default cuh h() {
      return this.c(this.ai_());
   }

   @Override
   default int b() {
      return 1;
   }

   @Override
   default boolean c() {
      return this.f().d();
   }

   @Override
   default void a() {
      this.h();
   }

   @Override
   default cuh b(int $$0) {
      return this.a($$0, this.ai_());
   }

   @Override
   default cuh a(int $$0) {
      return $$0 == 0 ? this.f() : cuh.i;
   }

   @Override
   default cuh a(int $$0, int $$1) {
      return $$0 != 0 ? cuh.i : this.c($$1);
   }

   @Override
   default void a(int $$0, cuh $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends eyf {
      dqc u();

      @Override
      default boolean a(cly $$0) {
         return bpt.a(this.u(), $$0);
      }
   }
}
