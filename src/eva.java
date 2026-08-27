public interface eva extends bpf {
   csz f();

   default csz c(int $$0) {
      return this.f().a($$0);
   }

   void b(csz var1);

   default csz h() {
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
   default csz b(int $$0) {
      return this.a($$0, this.ah_());
   }

   @Override
   default csz a(int $$0) {
      return $$0 == 0 ? this.f() : csz.i;
   }

   @Override
   default csz a(int $$0, int $$1) {
      return $$0 != 0 ? csz.i : this.c($$1);
   }

   @Override
   default void a(int $$0, csz $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends eva {
      dnm u();

      @Override
      default boolean a(clh $$0) {
         return bpf.a(this.u(), $$0);
      }
   }
}
