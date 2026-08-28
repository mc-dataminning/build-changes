public interface fho extends buv {
   dak f();

   default dak c(int $$0) {
      return this.f().a($$0);
   }

   void b(dak var1);

   default dak h() {
      return this.c(this.ap_());
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
   default dak b(int $$0) {
      return this.a($$0, this.ap_());
   }

   @Override
   default dak a(int $$0) {
      return $$0 == 0 ? this.f() : dak.l;
   }

   @Override
   default dak a(int $$0, int $$1) {
      return $$0 != 0 ? dak.l : this.c($$1);
   }

   @Override
   default void a(int $$0, dak $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends fho {
      dyo t();

      @Override
      default boolean a(csi $$0) {
         return buv.a(this.t(), $$0);
      }
   }
}
