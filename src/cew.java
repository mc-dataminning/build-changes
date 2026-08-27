public interface cew extends bni<cez> {
   cev gp();

   void a(cev var1);

   default cez a() {
      return this.gp().a();
   }

   default void a(cez $$0) {
      this.a(this.gp().a($$0));
   }
}
