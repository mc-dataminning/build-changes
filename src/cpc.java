public interface cpc extends bwx<cpf> {
   cpb gy();

   void a(cpb var1);

   default cpf a() {
      return this.gy().a();
   }

   default void a(cpf $$0) {
      this.a(this.gy().a($$0));
   }
}
