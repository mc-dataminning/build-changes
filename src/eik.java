public interface eik extends bgj {
   @Override
   default int b() {
      return 1;
   }

   @Override
   default boolean ab_() {
      return this.ar_().b();
   }

   @Override
   default void a() {
      this.j();
   }

   default ciy ar_() {
      return this.a(0);
   }

   default ciy j() {
      return this.b(0);
   }

   default void b(ciy $$0) {
      this.a(0, $$0);
   }

   @Override
   default ciy b(int $$0) {
      return this.a($$0, this.ac_());
   }
}
