public record fhn(akn a, akn b, akn c, akn d) {
   public fhn(akn $$0, akn $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fhn(akn $$0, akn $$1, akn $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public akn a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
