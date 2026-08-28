public interface cpk extends bxf<cpn> {
   cpj gy();

   void a(cpj var1);

   default cpn a() {
      return this.gy().a();
   }

   default void a(cpn $$0) {
      this.a(this.gy().a($$0));
   }
}
