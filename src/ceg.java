public interface ceg extends bmt<cej> {
   cef gp();

   void a(cef var1);

   default cej a() {
      return this.gp().a();
   }

   default void a(cej $$0) {
      this.a(this.gp().a($$0));
   }
}
