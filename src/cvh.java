public interface cvh extends cvk {
   float a(ih var1, boolean var2);

   ehg z_();

   int a(ib var1, cvp var2);

   default int a(cwn $$0, ib $$1) {
      return this.z_().a($$0).b($$1);
   }

   default int b(ib $$0, int $$1) {
      return this.z_().a($$0, $$1);
   }

   default boolean h(ib $$0) {
      return this.a(cwn.a, $$0) >= this.O();
   }
}
