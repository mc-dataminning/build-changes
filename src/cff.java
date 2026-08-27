public interface cff extends bnm<cfi> {
   cfe gq();

   void a(cfe var1);

   default cfi a() {
      return this.gq().a();
   }

   default void a(cfi $$0) {
      this.a(this.gq().a($$0));
   }
}
