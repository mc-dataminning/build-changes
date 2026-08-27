public interface cln extends btq<clq> {
   clm gA();

   void a(clm var1);

   default clq a() {
      return this.gA().a();
   }

   default void a(clq $$0) {
      this.a(this.gA().a($$0));
   }
}
