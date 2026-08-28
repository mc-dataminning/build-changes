public interface dhs extends dhv {
   float a(ja var1, boolean var2);

   evk x_();

   int a(iu var1, dia var2);

   default int a(diy $$0, iu $$1) {
      return this.x_().a($$0).b($$1);
   }

   default int b(iu $$0, int $$1) {
      return this.x_().a($$0, $$1);
   }

   default boolean h(iu $$0) {
      return this.a(diy.a, $$0) >= 15;
   }
}
