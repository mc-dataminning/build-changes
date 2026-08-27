public interface evx extends bpp {
   ctq f();

   default ctq c(int $$0) {
      return this.f().a($$0);
   }

   void b(ctq var1);

   default ctq h() {
      return this.c(this.ai_());
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
   default ctq b(int $$0) {
      return this.a($$0, this.ai_());
   }

   @Override
   default ctq a(int $$0) {
      return $$0 == 0 ? this.f() : ctq.i;
   }

   @Override
   default ctq a(int $$0, int $$1) {
      return $$0 != 0 ? ctq.i : this.c($$1);
   }

   @Override
   default void a(int $$0, ctq $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends evx {
      doi v();

      @Override
      default boolean a(cly $$0) {
         return bpp.a(this.v(), $$0);
      }
   }
}
