public interface cbe extends bjz<cbh> {
   cbd gl();

   void a(cbd var1);

   default cbh a() {
      return this.gl().a();
   }

   default void a(cbh $$0) {
      this.a(this.gl().a($$0));
   }
}
