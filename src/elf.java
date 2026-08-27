public interface elf extends biu {
   clo x();

   clo c(int var1);

   void b(clo var1);

   dfi y();

   default clo h() {
      return this.c(this.al_());
   }

   @Override
   default int b() {
      return 1;
   }

   @Override
   default boolean aj_() {
      return this.x().b();
   }

   @Override
   default void a() {
      this.h();
   }

   @Override
   default clo b(int $$0) {
      return this.a($$0, this.al_());
   }

   @Override
   default clo a(int $$0) {
      return $$0 == 0 ? this.x() : clo.b;
   }

   @Override
   default clo a(int $$0, int $$1) {
      return $$0 != 0 ? clo.b : this.c($$1);
   }

   @Override
   default void a(int $$0, clo $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   @Override
   default boolean a(cdz $$0) {
      return biu.a(this.y(), $$0);
   }
}
