public interface cji extends brn<cjl> {
   cjh gy();

   void a(cjh var1);

   default cjl a() {
      return this.gy().a();
   }

   default void a(cjl $$0) {
      this.a(this.gy().a($$0));
   }
}
