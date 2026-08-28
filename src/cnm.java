public interface cnm extends bvm<cnp> {
   cnl gy();

   void a(cnl var1);

   default cnp a() {
      return this.gy().a();
   }

   default void a(cnp $$0) {
      this.a(this.gy().a($$0));
   }
}
