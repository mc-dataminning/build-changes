public interface coe extends bwe<coh> {
   cod gF();

   void a(cod var1);

   default coh a() {
      return this.gF().a();
   }

   default void a(coh $$0) {
      this.a(this.gF().a($$0));
   }
}
