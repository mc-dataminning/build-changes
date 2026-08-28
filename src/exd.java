public interface exd extends bqo {
   cuq f();

   default cuq c(int $$0) {
      return this.f().a($$0);
   }

   void b(cuq var1);

   default cuq h() {
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
   default cuq b(int $$0) {
      return this.a($$0, this.ah_());
   }

   @Override
   default cuq a(int $$0) {
      return $$0 == 0 ? this.f() : cuq.l;
   }

   @Override
   default cuq a(int $$0, int $$1) {
      return $$0 != 0 ? cuq.l : this.c($$1);
   }

   @Override
   default void a(int $$0, cuq $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends exd {
      dpi v();

      @Override
      default boolean a(cmy $$0) {
         return bqo.a(this.v(), $$0);
      }
   }
}
