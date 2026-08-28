public interface dbb extends dbe {
   float a(je var1, boolean var2);

   enk y_();

   int a(iz var1, dbj var2);

   default int a(dch $$0, iz $$1) {
      return this.y_().a($$0).b($$1);
   }

   default int b(iz $$0, int $$1) {
      return this.y_().a($$0, $$1);
   }

   default boolean h(iz $$0) {
      return this.a(dch.a, $$0) >= this.Q();
   }
}
