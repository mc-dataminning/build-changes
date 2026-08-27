public interface cdb extends blw<cde> {
   cda gp();

   void a(cda var1);

   default cde a() {
      return this.gp().a();
   }

   default void a(cde $$0) {
      this.a(this.gp().a($$0));
   }
}
