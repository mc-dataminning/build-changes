public record fgh(akf a, akf b, akf c, akf d) {
   public fgh(akf $$0, akf $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fgh(akf $$0, akf $$1, akf $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public akf a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
