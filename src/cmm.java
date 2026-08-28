public interface cmm extends buo<cmp> {
   cml gw();

   void a(cml var1);

   default cmp a() {
      return this.gw().a();
   }

   default void a(cmp $$0) {
      this.a(this.gw().a($$0));
   }
}
