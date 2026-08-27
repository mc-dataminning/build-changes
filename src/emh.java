public interface emh extends bje {
   cmh x();

   cmh c(int var1);

   void b(cmh var1);

   dgd y();

   default cmh h() {
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
   default cmh b(int $$0) {
      return this.a($$0, this.ak_());
   }

   @Override
   default cmh a(int $$0) {
      return $$0 == 0 ? this.x() : cmh.f;
   }

   @Override
   default cmh a(int $$0, int $$1) {
      return $$0 != 0 ? cmh.f : this.c($$1);
   }

   @Override
   default void a(int $$0, cmh $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   @Override
   default boolean a(cer $$0) {
      return bje.a(this.y(), $$0);
   }
}
