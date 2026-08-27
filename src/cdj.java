public interface cdj extends bme<cdm> {
   cdi gq();

   void a(cdi var1);

   default cdm a() {
      return this.gq().a();
   }

   default void a(cdm $$0) {
      this.a(this.gq().a($$0));
   }
}
