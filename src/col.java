public interface col extends bwi<cop> {
   cok gC();

   void a(cok var1);

   default cop a() {
      return this.gC().a();
   }

   default void a(cop $$0) {
      this.a(this.gC().a($$0));
   }
}
