public interface eio extends bgm {
   @Override
   default int b() {
      return 1;
   }

   @Override
   default boolean aa_() {
      return this.aq_().b();
   }

   @Override
   default void a() {
      this.j();
   }

   default cja aq_() {
      return this.a(0);
   }

   default cja j() {
      return this.b(0);
   }

   default void b(cja $$0) {
      this.a(0, $$0);
   }

   @Override
   default cja b(int $$0) {
      return this.a($$0, this.ab_());
   }
}
