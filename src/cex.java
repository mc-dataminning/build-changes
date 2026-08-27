public interface cex extends bnj<cfa> {
   cew gp();

   void a(cew var1);

   default cfa a() {
      return this.gp().a();
   }

   default void a(cfa $$0) {
      this.a(this.gp().a($$0));
   }
}
