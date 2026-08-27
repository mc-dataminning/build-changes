public record fka(akt a, akt b, akt c, akt d) {
   public fka(akt $$0, akt $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fka(akt $$0, akt $$1, akt $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public akt a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
