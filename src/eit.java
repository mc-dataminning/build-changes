public interface eit extends bgr {
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

   default cjf av_() {
      return this.a(0);
   }

   default cjf j() {
      return this.b(0);
   }

   default void b(cjf $$0) {
      this.a(0, $$0);
   }

   @Override
   default cjf b(int $$0) {
      return this.a($$0, this.ag_());
   }
}
