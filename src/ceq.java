public interface ceq extends bnd<cet> {
   cep gp();

   void a(cep var1);

   default cet a() {
      return this.gp().a();
   }

   default void a(cet $$0) {
      this.a(this.gp().a($$0));
   }
}
