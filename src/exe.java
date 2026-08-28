public interface exe extends bqp {
   cur f();

   default cur c(int $$0) {
      return this.f().a($$0);
   }

   void b(cur var1);

   default cur h() {
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
   default cur b(int $$0) {
      return this.a($$0, this.ah_());
   }

   @Override
   default cur a(int $$0) {
      return $$0 == 0 ? this.f() : cur.l;
   }

   @Override
   default cur a(int $$0, int $$1) {
      return $$0 != 0 ? cur.l : this.c($$1);
   }

   @Override
   default void a(int $$0, cur $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends exe {
      dpj v();

      @Override
      default boolean a(cmz $$0) {
         return bqp.a(this.v(), $$0);
      }
   }
}
