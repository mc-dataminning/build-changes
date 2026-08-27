public interface cbc extends bjx<cbf> {
   cbb gk();

   void a(cbb var1);

   default cbf a() {
      return this.gk().a();
   }

   default void a(cbf $$0) {
      this.a(this.gk().a($$0));
   }
}
