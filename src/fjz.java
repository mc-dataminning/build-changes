public record fjz(akr a, akr b, akr c, akr d) {
   public fjz(akr $$0, akr $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fjz(akr $$0, akr $$1, akr $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public akr a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
