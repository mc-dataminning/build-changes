public interface cbb extends bjw<cbe> {
   cba gl();

   void a(cba var1);

   default cbe a() {
      return this.gl().a();
   }

   default void a(cbe $$0) {
      this.a(this.gl().a($$0));
   }
}
