public interface eiv extends bgt {
   @Override
   default int b() {
      return 1;
   }

   @Override
   default boolean af_() {
      return this.av_().b();
   }

   @Override
   default void a() {
      this.j();
   }

   default cjh av_() {
      return this.a(0);
   }

   default cjh j() {
      return this.b(0);
   }

   default void b(cjh $$0) {
      this.a(0, $$0);
   }

   @Override
   default cjh b(int $$0) {
      return this.a($$0, this.ag_());
   }
}
