public interface eqg extends bme {
   cpq f();

   default cpq c(int $$0) {
      return this.f().a($$0);
   }

   void a(cpq var1);

   default cpq h() {
      return this.c(this.al_());
   }

   @Override
   default int b() {
      return 1;
   }

   @Override
   default boolean aj_() {
      return this.f().b();
   }

   @Override
   default void a() {
      this.h();
   }

   @Override
   default cpq b(int $$0) {
      return this.a($$0, this.al_());
   }

   @Override
   default cpq a(int $$0) {
      return $$0 == 0 ? this.f() : cpq.h;
   }

   @Override
   default cpq a(int $$0, int $$1) {
      return $$0 != 0 ? cpq.h : this.c($$1);
   }

   @Override
   default void a(int $$0, cpq $$1) {
      if ($$0 == 0) {
         this.a($$1);
      }
   }

   public interface a extends eqg {
      djl t();

      @Override
      default boolean a(cia $$0) {
         return bme.a(this.t(), $$0);
      }
   }
}
