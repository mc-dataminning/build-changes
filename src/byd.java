public interface byd extends bgy<byg> {
   byc gj();

   void a(byc var1);

   default byg a() {
      return this.gj().a();
   }

   default void a(byg $$0) {
      this.a(this.gj().a($$0));
   }
}
