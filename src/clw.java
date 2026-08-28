public interface clw extends bty<clz> {
   clv gy();

   void a(clv var1);

   default clz a() {
      return this.gy().a();
   }

   default void a(clz $$0) {
      this.a(this.gy().a($$0));
   }
}
