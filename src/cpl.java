public interface cpl extends bxg<cpo> {
   cpk gy();

   void a(cpk var1);

   default cpo a() {
      return this.gy().a();
   }

   default void a(cpo $$0) {
      this.a(this.gy().a($$0));
   }
}
