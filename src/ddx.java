public interface ddx extends dea {
   float a(jl var1, boolean var2);

   eqt z_();

   int a(jg var1, def var2);

   default int a(dfe $$0, jg $$1) {
      return this.z_().a($$0).b($$1);
   }

   default int b(jg $$0, int $$1) {
      return this.z_().a($$0, $$1);
   }

   default boolean h(jg $$0) {
      return this.a(dfe.a, $$0) >= 15;
   }
}
