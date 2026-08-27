public interface cbl extends bkg<cbo> {
   cbk go();

   void a(cbk var1);

   default cbo a() {
      return this.go().a();
   }

   default void a(cbo $$0) {
      this.a(this.go().a($$0));
   }
}
