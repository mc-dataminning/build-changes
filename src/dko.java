public interface dko {
   <T> fhk<T> a(iw var1, T var2, int var3, fho var4);

   <T> fhk<T> a(iw var1, T var2, int var3);

   fhg<dne> U();

   default void a(iw $$0, dne $$1, int $$2, fho $$3) {
      this.U().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(iw $$0, dne $$1, int $$2) {
      this.U().a(this.a($$0, $$1, $$2));
   }

   fhg<exp> T();

   default void a(iw $$0, exp $$1, int $$2, fho $$3) {
      this.T().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(iw $$0, exp $$1, int $$2) {
      this.T().a(this.a($$0, $$1, $$2));
   }
}
