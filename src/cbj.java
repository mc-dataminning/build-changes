public interface cbj extends bke<cbm> {
   cbi go();

   void a(cbi var1);

   default cbm a() {
      return this.go().a();
   }

   default void a(cbm $$0) {
      this.a(this.go().a($$0));
   }
}
