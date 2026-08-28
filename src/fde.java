public interface fde extends bsx {
   cxk f();

   default cxk c(int $$0) {
      return this.f().a($$0);
   }

   void b(cxk var1);

   default cxk h() {
      return this.c(this.ao_());
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
   default cxk b(int $$0) {
      return this.a($$0, this.ao_());
   }

   @Override
   default cxk a(int $$0) {
      return $$0 == 0 ? this.f() : cxk.k;
   }

   @Override
   default cxk a(int $$0, int $$1) {
      return $$0 != 0 ? cxk.k : this.c($$1);
   }

   @Override
   default void a(int $$0, cxk $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends fde {
      dup v();

      @Override
      default boolean a(cps $$0) {
         return bsx.a(this.v(), $$0);
      }
   }
}
