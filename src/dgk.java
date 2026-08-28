public interface dgk extends dgn {
   float a(jm var1, boolean var2);

   etm C_();

   int a(jh var1, dgs var2);

   default int a(dhr $$0, jh $$1) {
      return this.C_().a($$0).b($$1);
   }

   default int b(jh $$0, int $$1) {
      return this.C_().a($$0, $$1);
   }

   default boolean h(jh $$0) {
      return this.a(dhr.a, $$0) >= 15;
   }
}
