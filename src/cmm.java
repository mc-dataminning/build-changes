public interface cmm extends buo<cmp> {
   cml gv();

   void a(cml var1);

   default cmp a() {
      return this.gv().a();
   }

   default void a(cmp $$0) {
      this.a(this.gv().a($$0));
   }
}
