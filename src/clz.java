public interface clz extends bub<cmc> {
   cly gz();

   void a(cly var1);

   default cmc a() {
      return this.gz().a();
   }

   default void a(cmc $$0) {
      this.a(this.gz().a($$0));
   }
}
