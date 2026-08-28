public interface dfj extends dfm {
   float a(jn var1, boolean var2);

   esn C_();

   int a(ji var1, dfr var2);

   default int a(dgq $$0, ji $$1) {
      return this.C_().a($$0).b($$1);
   }

   default int b(ji $$0, int $$1) {
      return this.C_().a($$0, $$1);
   }

   default boolean h(ji $$0) {
      return this.a(dgq.a, $$0) >= 15;
   }
}
