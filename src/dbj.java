public interface dbj extends dbm {
   float a(jf var1, boolean var2);

   eny y_();

   int a(ja var1, dbr var2);

   default int a(dcp $$0, ja $$1) {
      return this.y_().a($$0).b($$1);
   }

   default int b(ja $$0, int $$1) {
      return this.y_().a($$0, $$1);
   }

   default boolean h(ja $$0) {
      return this.a(dcp.a, $$0) >= this.Q();
   }
}
