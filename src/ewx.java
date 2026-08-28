public interface ewx extends bqi {
   cuk f();

   default cuk c(int $$0) {
      return this.f().a($$0);
   }

   void b(cuk var1);

   default cuk h() {
      return this.c(this.ai_());
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
   default cuk b(int $$0) {
      return this.a($$0, this.ai_());
   }

   @Override
   default cuk a(int $$0) {
      return $$0 == 0 ? this.f() : cuk.l;
   }

   @Override
   default cuk a(int $$0, int $$1) {
      return $$0 != 0 ? cuk.l : this.c($$1);
   }

   @Override
   default void a(int $$0, cuk $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends ewx {
      dpc v();

      @Override
      default boolean a(cms $$0) {
         return bqi.a(this.v(), $$0);
      }
   }
}
