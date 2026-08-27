public interface cln extends btn<clq> {
   clm gL();

   void a(clm var1);

   default clq a() {
      return this.gL().a();
   }

   default void a(clq $$0) {
      this.a(this.gL().a($$0));
   }
}
