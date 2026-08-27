public interface cij extends bqo<cim> {
   cii gy();

   void a(cii var1);

   default cim a() {
      return this.gy().a();
   }

   default void a(cim $$0) {
      this.a(this.gy().a($$0));
   }
}
