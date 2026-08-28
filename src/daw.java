public interface daw extends daz {
   float a(je var1, boolean var2);

   enf y_();

   int a(iz var1, dbe var2);

   default int a(dcc $$0, iz $$1) {
      return this.y_().a($$0).b($$1);
   }

   default int b(iz $$0, int $$1) {
      return this.y_().a($$0, $$1);
   }

   default boolean h(iz $$0) {
      return this.a(dcc.a, $$0) >= this.Q();
   }
}
