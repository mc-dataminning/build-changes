public record fpt(alz a, alz b, alz c, alz d) {
   public fpt(alz $$0, alz $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fpt(alz $$0, alz $$1, alz $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public alz a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
