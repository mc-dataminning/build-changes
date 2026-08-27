public interface epd extends bln {
   coz x();

   coz c(int var1);

   void b(coz var1);

   dit y();

   default coz h() {
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
   default coz b(int $$0) {
      return this.a($$0, this.al_());
   }

   @Override
   default coz a(int $$0) {
      return $$0 == 0 ? this.x() : coz.h;
   }

   @Override
   default coz a(int $$0, int $$1) {
      return $$0 != 0 ? coz.h : this.c($$1);
   }

   @Override
   default void a(int $$0, coz $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   @Override
   default boolean a(chh $$0) {
      return bln.a(this.y(), $$0);
   }
}
