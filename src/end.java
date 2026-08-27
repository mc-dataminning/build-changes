public interface end extends bjt {
   cmx x();

   cmx c(int var1);

   void b(cmx var1);

   dgu y();

   default cmx h() {
      return this.c(this.ak_());
   }

   @Override
   default int b() {
      return 1;
   }

   @Override
   default boolean ai_() {
      return this.x().b();
   }

   @Override
   default void a() {
      this.h();
   }

   @Override
   default cmx b(int $$0) {
      return this.a($$0, this.ak_());
   }

   @Override
   default cmx a(int $$0) {
      return $$0 == 0 ? this.x() : cmx.f;
   }

   @Override
   default cmx a(int $$0, int $$1) {
      return $$0 != 0 ? cmx.f : this.c($$1);
   }

   @Override
   default void a(int $$0, cmx $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   @Override
   default boolean a(cfh $$0) {
      return bjt.a(this.y(), $$0);
   }
}
