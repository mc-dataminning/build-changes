public interface ffu extends btu {
   cyy f();

   default cyy c(int $$0) {
      return this.f().a($$0);
   }

   void b(cyy var1);

   default cyy h() {
      return this.c(this.aj_());
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
   default cyy b(int $$0) {
      return this.a($$0, this.aj_());
   }

   @Override
   default cyy a(int $$0) {
      return $$0 == 0 ? this.f() : cyy.k;
   }

   @Override
   default cyy a(int $$0, int $$1) {
      return $$0 != 0 ? cyy.k : this.c($$1);
   }

   @Override
   default void a(int $$0, cyy $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends ffu {
      dwx t();

      @Override
      default boolean a(cqy $$0) {
         return btu.a(this.t(), $$0);
      }
   }
}
