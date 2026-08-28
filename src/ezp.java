public interface ezp extends brd {
   cvl f();

   default cvl c(int $$0) {
      return this.f().a($$0);
   }

   void b(cvl var1);

   default cvl h() {
      return this.c(this.ak_());
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
   default cvl b(int $$0) {
      return this.a($$0, this.ak_());
   }

   @Override
   default cvl a(int $$0) {
      return $$0 == 0 ? this.f() : cvl.k;
   }

   @Override
   default cvl a(int $$0, int $$1) {
      return $$0 != 0 ? cvl.k : this.c($$1);
   }

   @Override
   default void a(int $$0, cvl $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends ezp {
      dre v();

      @Override
      default boolean a(cnp $$0) {
         return brd.a(this.v(), $$0);
      }
   }
}
