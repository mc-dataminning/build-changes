public interface cne extends bve<cnh> {
   cnd gy();

   void a(cnd var1);

   default cnh a() {
      return this.gy().a();
   }

   default void a(cnh $$0) {
      this.a(this.gy().a($$0));
   }
}
