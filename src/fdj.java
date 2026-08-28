public interface fdj extends bsr {
   cxh f();

   default cxh c(int $$0) {
      return this.f().a($$0);
   }

   void b(cxh var1);

   default cxh h() {
      return this.c(this.an_());
   }

   @Override
   default int b() {
      return 1;
   }

   @Override
   default boolean c() {
      return this.f().f();
   }

   @Override
   default void a() {
      this.h();
   }

   @Override
   default cxh b(int $$0) {
      return this.a($$0, this.an_());
   }

   @Override
   default cxh a(int $$0) {
      return $$0 == 0 ? this.f() : cxh.k;
   }

   @Override
   default cxh a(int $$0, int $$1) {
      return $$0 != 0 ? cxh.k : this.c($$1);
   }

   @Override
   default void a(int $$0, cxh $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends fdj {
      dus t();

      @Override
      default boolean a(cpr $$0) {
         return bsr.a(this.t(), $$0);
      }
   }
}
