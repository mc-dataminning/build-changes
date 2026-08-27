public interface etl extends bnt {
   crj f();

   default crj c(int $$0) {
      return this.f().a($$0);
   }

   void a(crj var1);

   default crj h() {
      return this.c(this.aj_());
   }

   @Override
   default int b() {
      return 1;
   }

   @Override
   default boolean ah_() {
      return this.f().d();
   }

   @Override
   default void a() {
      this.h();
   }

   @Override
   default crj b(int $$0) {
      return this.a($$0, this.aj_());
   }

   @Override
   default crj a(int $$0) {
      return $$0 == 0 ? this.f() : crj.i;
   }

   @Override
   default crj a(int $$0, int $$1) {
      return $$0 != 0 ? crj.i : this.c($$1);
   }

   @Override
   default void a(int $$0, crj $$1) {
      if ($$0 == 0) {
         this.a($$1);
      }
   }

   public interface a extends etl {
      dmf u();

      @Override
      default boolean a(cjt $$0) {
         return bnt.a(this.u(), $$0);
      }
   }
}
