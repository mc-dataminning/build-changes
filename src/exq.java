public interface exq extends bpz {
   cuc f();

   default cuc c(int $$0) {
      return this.f().a($$0);
   }

   void b(cuc var1);

   default cuc h() {
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
   default cuc b(int $$0) {
      return this.a($$0, this.ah_());
   }

   @Override
   default cuc a(int $$0) {
      return $$0 == 0 ? this.f() : cuc.l;
   }

   @Override
   default cuc a(int $$0, int $$1) {
      return $$0 != 0 ? cuc.l : this.c($$1);
   }

   @Override
   default void a(int $$0, cuc $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends exq {
      dpp v();

      @Override
      default boolean a(cmk $$0) {
         return bpz.a(this.v(), $$0);
      }
   }
}
