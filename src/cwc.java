public interface cwc extends cwf {
   float a(ih var1, boolean var2);

   eic y_();

   int a(ib var1, cwk var2);

   default int a(cxi $$0, ib $$1) {
      return this.y_().a($$0).b($$1);
   }

   default int b(ib $$0, int $$1) {
      return this.y_().a($$0, $$1);
   }

   default boolean h(ib $$0) {
      return this.a(cxi.a, $$0) >= this.O();
   }
}
