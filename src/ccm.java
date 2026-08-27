public interface ccm extends blh<ccp> {
   ccl gp();

   void a(ccl var1);

   default ccp a() {
      return this.gp().a();
   }

   default void a(ccp $$0) {
      this.a(this.gp().a($$0));
   }
}
