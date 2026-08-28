public record fqg(akv a, akv b, akv c, akv d) {
   public fqg(akv $$0, akv $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fqg(akv $$0, akv $$1, akv $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public akv a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
