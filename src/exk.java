public interface exk extends bpw {
   cua f();

   default cua c(int $$0) {
      return this.f().a($$0);
   }

   void b(cua var1);

   default cua h() {
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
   default cua b(int $$0) {
      return this.a($$0, this.ah_());
   }

   @Override
   default cua a(int $$0) {
      return $$0 == 0 ? this.f() : cua.l;
   }

   @Override
   default cua a(int $$0, int $$1) {
      return $$0 != 0 ? cua.l : this.c($$1);
   }

   @Override
   default void a(int $$0, cua $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends exk {
      dpn v();

      @Override
      default boolean a(cmh $$0) {
         return bpw.a(this.v(), $$0);
      }
   }
}
