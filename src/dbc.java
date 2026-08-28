public interface dbc extends dbf {
   float a(je var1, boolean var2);

   enl y_();

   int a(iz var1, dbk var2);

   default int a(dci $$0, iz $$1) {
      return this.y_().a($$0).b($$1);
   }

   default int b(iz $$0, int $$1) {
      return this.y_().a($$0, $$1);
   }

   default boolean h(iz $$0) {
      return this.a(dci.a, $$0) >= this.Q();
   }
}
