public interface cjp extends brs<cjs> {
   cjo gy();

   void a(cjo var1);

   default cjs a() {
      return this.gy().a();
   }

   default void a(cjs $$0) {
      this.a(this.gy().a($$0));
   }
}
