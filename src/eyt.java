public record eyt(ahg a, ahg b, ahg c, ahg d) {
   public eyt(ahg $$0, ahg $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public eyt(ahg $$0, ahg $$1, ahg $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public ahg a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
