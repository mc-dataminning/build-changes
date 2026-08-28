public interface fbk extends bsd {
   cwm f();

   default cwm c(int $$0) {
      return this.f().a($$0);
   }

   void b(cwm var1);

   default cwm h() {
      return this.c(this.an_());
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
   default cwm b(int $$0) {
      return this.a($$0, this.an_());
   }

   @Override
   default cwm a(int $$0) {
      return $$0 == 0 ? this.f() : cwm.k;
   }

   @Override
   default cwm a(int $$0, int $$1) {
      return $$0 != 0 ? cwm.k : this.c($$1);
   }

   @Override
   default void a(int $$0, cwm $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends fbk {
      dsy v();

      @Override
      default boolean a(cou $$0) {
         return bsd.a(this.v(), $$0);
      }
   }
}
