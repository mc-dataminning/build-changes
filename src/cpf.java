public interface cpf extends bwy<cpi> {
   cpe gA();

   void a(cpe var1);

   default cpi a() {
      return this.gA().a();
   }

   default void a(cpi $$0) {
      this.a(this.gA().a($$0));
   }
}
