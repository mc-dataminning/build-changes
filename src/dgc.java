public interface dgc extends dgf {
   float a(jm var1, boolean var2);

   ete C_();

   int a(jh var1, dgk var2);

   default int a(dhj $$0, jh $$1) {
      return this.C_().a($$0).b($$1);
   }

   default int b(jh $$0, int $$1) {
      return this.C_().a($$0, $$1);
   }

   default boolean h(jh $$0) {
      return this.a(dhj.a, $$0) >= 15;
   }
}
