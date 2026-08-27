public interface cih extends bqn<cik> {
   cig gy();

   void a(cig var1);

   default cik a() {
      return this.gy().a();
   }

   default void a(cik $$0) {
      this.a(this.gy().a($$0));
   }
}
