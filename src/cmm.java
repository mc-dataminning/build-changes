public interface cmm extends bup<cmp> {
   cml gB();

   void a(cml var1);

   default cmp a() {
      return this.gB().a();
   }

   default void a(cmp $$0) {
      this.a(this.gB().a($$0));
   }
}
