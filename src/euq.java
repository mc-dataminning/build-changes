public interface euq extends boj {
   csd f();

   default csd c(int $$0) {
      return this.f().a($$0);
   }

   void a(csd var1);

   default csd h() {
      return this.c(this.ah_());
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
   default csd b(int $$0) {
      return this.a($$0, this.ah_());
   }

   @Override
   default csd a(int $$0) {
      return $$0 == 0 ? this.f() : csd.i;
   }

   @Override
   default csd a(int $$0, int $$1) {
      return $$0 != 0 ? csd.i : this.c($$1);
   }

   @Override
   default void a(int $$0, csd $$1) {
      if ($$0 == 0) {
         this.a($$1);
      }
   }

   public interface a extends euq {
      dnd u();

      @Override
      default boolean a(ckl $$0) {
         return boj.a(this.u(), $$0);
      }
   }
}
