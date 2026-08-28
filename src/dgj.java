public interface dgj extends dgm {
   float a(jm var1, boolean var2);

   etl C_();

   int a(jh var1, dgr var2);

   default int a(dhq $$0, jh $$1) {
      return this.C_().a($$0).b($$1);
   }

   default int b(jh $$0, int $$1) {
      return this.C_().a($$0, $$1);
   }

   default boolean h(jh $$0) {
      return this.a(dhq.a, $$0) >= 15;
   }
}
