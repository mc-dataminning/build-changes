public interface dbd extends dbg {
   float a(je var1, boolean var2);

   enm y_();

   int a(iz var1, dbl var2);

   default int a(dcj $$0, iz $$1) {
      return this.y_().a($$0).b($$1);
   }

   default int b(iz $$0, int $$1) {
      return this.y_().a($$0, $$1);
   }

   default boolean h(iz $$0) {
      return this.a(dcj.a, $$0) >= this.Q();
   }
}
