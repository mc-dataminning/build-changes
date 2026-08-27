public interface cba extends bjv<cbd> {
   caz gk();

   void a(caz var1);

   default cbd a() {
      return this.gk().a();
   }

   default void a(cbd $$0) {
      this.a(this.gk().a($$0));
   }
}
