public interface djk extends djn {
   float a(jc var1, boolean var2);

   exp B_();

   int a(iw var1, djt var2);

   default int a(dks $$0, iw $$1) {
      return this.B_().a($$0).b($$1);
   }

   default int b(iw $$0, int $$1) {
      return this.B_().a($$0, $$1);
   }

   default boolean h(iw $$0) {
      return this.a(dks.a, $$0) >= 15;
   }
}
