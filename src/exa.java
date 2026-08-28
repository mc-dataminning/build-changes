public interface exa extends bql {
   cun f();

   default cun c(int $$0) {
      return this.f().a($$0);
   }

   void b(cun var1);

   default cun h() {
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
   default cun b(int $$0) {
      return this.a($$0, this.ai_());
   }

   @Override
   default cun a(int $$0) {
      return $$0 == 0 ? this.f() : cun.l;
   }

   @Override
   default cun a(int $$0, int $$1) {
      return $$0 != 0 ? cun.l : this.c($$1);
   }

   @Override
   default void a(int $$0, cun $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends exa {
      dpf v();

      @Override
      default boolean a(cmv $$0) {
         return bql.a(this.v(), $$0);
      }
   }
}
