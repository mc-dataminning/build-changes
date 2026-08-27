public interface cbp extends bkk<cbs> {
   cbo gp();

   void a(cbo var1);

   default cbs a() {
      return this.gp().a();
   }

   default void a(cbs $$0) {
      this.a(this.gp().a($$0));
   }
}
