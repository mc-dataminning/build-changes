public interface ere extends bmw {
   cqm f();

   default cqm c(int $$0) {
      return this.f().a($$0);
   }

   void a(cqm var1);

   default cqm h() {
      return this.c(this.ak_());
   }

   @Override
   default int b() {
      return 1;
   }

   @Override
   default boolean ai_() {
      return this.f().b();
   }

   @Override
   default void a() {
      this.h();
   }

   @Override
   default cqm b(int $$0) {
      return this.a($$0, this.ak_());
   }

   @Override
   default cqm a(int $$0) {
      return $$0 == 0 ? this.f() : cqm.h;
   }

   @Override
   default cqm a(int $$0, int $$1) {
      return $$0 != 0 ? cqm.h : this.c($$1);
   }

   @Override
   default void a(int $$0, cqm $$1) {
      if ($$0 == 0) {
         this.a($$1);
      }
   }

   public interface a extends ere {
      dki t();

      @Override
      default boolean a(ciu $$0) {
         return bmw.a(this.t(), $$0);
      }
   }
}
