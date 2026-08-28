public interface dja extends djd {
   float a(jc var1, boolean var2);

   exf B_();

   int a(iw var1, djj var2);

   default int a(dki $$0, iw $$1) {
      return this.B_().a($$0).b($$1);
   }

   default int b(iw $$0, int $$1) {
      return this.B_().a($$0, $$1);
   }

   default boolean h(iw $$0) {
      return this.a(dki.a, $$0) >= 15;
   }
}
