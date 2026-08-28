public interface cpg extends bxb<cpj> {
   cpf gw();

   void a(cpf var1);

   default cpj a() {
      return this.gw().a();
   }

   default void a(cpj $$0) {
      this.a(this.gw().a($$0));
   }
}
