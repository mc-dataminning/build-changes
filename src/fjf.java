public record fjf(akk a, akk b, akk c, akk d) {
   public fjf(akk $$0, akk $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fjf(akk $$0, akk $$1, akk $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public akk a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
