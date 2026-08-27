public interface efn extends bdq {
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

   default cfz ar_() {
      return this.a(0);
   }

   default cfz j() {
      return this.b(0);
   }

   default void b(cfz $$0) {
      this.a(0, $$0);
   }

   @Override
   default cfz b(int $$0) {
      return this.a($$0, this.ac_());
   }
}
