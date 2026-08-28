public record fpm(alp a, alp b, alp c, alp d) {
   public fpm(alp $$0, alp $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fpm(alp $$0, alp $$1, alp $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public alp a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
