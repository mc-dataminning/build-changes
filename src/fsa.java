public record fsa(ald a, ald b, ald c, ald d) {
   public fsa(ald $$0, ald $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fsa(ald $$0, ald $$1, ald $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public ald a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
