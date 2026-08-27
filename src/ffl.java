public record ffl(ajv a, ajv b, ajv c, ajv d) {
   public ffl(ajv $$0, ajv $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public ffl(ajv $$0, ajv $$1, ajv $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public ajv a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
