public record fnq(alj a, alj b, alj c, alj d) {
   public fnq(alj $$0, alj $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fnq(alj $$0, alj $$1, alj $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public alj a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
