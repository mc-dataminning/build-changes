public interface cpk extends bxf<cpn> {
   cpj gw();

   void a(cpj var1);

   default cpn a() {
      return this.gw().a();
   }

   default void a(cpn $$0) {
      this.a(this.gw().a($$0));
   }
}
