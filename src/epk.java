public interface epk extends blp {
   cpd x();

   cpd c(int var1);

   void b(cpd var1);

   dix y();

   default cpd h() {
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
   default cpd b(int $$0) {
      return this.a($$0, this.al_());
   }

   @Override
   default cpd a(int $$0) {
      return $$0 == 0 ? this.x() : cpd.h;
   }

   @Override
   default cpd a(int $$0, int $$1) {
      return $$0 != 0 ? cpd.h : this.c($$1);
   }

   @Override
   default void a(int $$0, cpd $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   @Override
   default boolean a(chl $$0) {
      return blp.a(this.y(), $$0);
   }
}
