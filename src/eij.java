public interface eij extends bgj {
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

   default cix aq_() {
      return this.a(0);
   }

   default cix j() {
      return this.b(0);
   }

   default void b(cix $$0) {
      this.a(0, $$0);
   }

   @Override
   default cix b(int $$0) {
      return this.a($$0, this.ab_());
   }
}
