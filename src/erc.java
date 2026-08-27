public interface erc extends bmv {
   cqk f();

   default cqk c(int $$0) {
      return this.f().a($$0);
   }

   void a(cqk var1);

   default cqk h() {
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
   default cqk b(int $$0) {
      return this.a($$0, this.ak_());
   }

   @Override
   default cqk a(int $$0) {
      return $$0 == 0 ? this.f() : cqk.h;
   }

   @Override
   default cqk a(int $$0, int $$1) {
      return $$0 != 0 ? cqk.h : this.c($$1);
   }

   @Override
   default void a(int $$0, cqk $$1) {
      if ($$0 == 0) {
         this.a($$1);
      }
   }

   public interface a extends erc {
      dkg t();

      @Override
      default boolean a(cis $$0) {
         return bmv.a(this.t(), $$0);
      }
   }
}
