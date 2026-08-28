public record fmu(ali a, ali b, ali c, ali d) {
   public fmu(ali $$0, ali $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fmu(ali $$0, ali $$1, ali $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public ali a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
