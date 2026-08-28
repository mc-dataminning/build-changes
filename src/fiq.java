public record fiq(ale a, ale b, ale c, ale d) {
   public fiq(ale $$0, ale $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fiq(ale $$0, ale $$1, ale $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public ale a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
