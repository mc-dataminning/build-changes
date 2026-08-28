public interface dgc extends dgf {
   float a(jn var1, boolean var2);

   etl x_();

   int a(ji var1, dgk var2);

   default int a(dhi $$0, ji $$1) {
      return this.x_().a($$0).b($$1);
   }

   default int b(ji $$0, int $$1) {
      return this.x_().a($$0, $$1);
   }

   default boolean h(ji $$0) {
      return this.a(dhi.a, $$0) >= 15;
   }
}
