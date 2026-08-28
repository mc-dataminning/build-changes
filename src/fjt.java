public record fjt(akq a, akq b, akq c, akq d) {
   public fjt(akq $$0, akq $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fjt(akq $$0, akq $$1, akq $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public akq a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
