public interface eyh extends bqj {
   cuo f();

   default cuo c(int $$0) {
      return this.f().a($$0);
   }

   void b(cuo var1);

   default cuo h() {
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
   default cuo b(int $$0) {
      return this.a($$0, this.ah_());
   }

   @Override
   default cuo a(int $$0) {
      return $$0 == 0 ? this.f() : cuo.l;
   }

   @Override
   default cuo a(int $$0, int $$1) {
      return $$0 != 0 ? cuo.l : this.c($$1);
   }

   @Override
   default void a(int $$0, cuo $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends eyh {
      dqf v();

      @Override
      default boolean a(cmv $$0) {
         return bqj.a(this.v(), $$0);
      }
   }
}
