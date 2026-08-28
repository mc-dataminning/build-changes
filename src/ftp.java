public record ftp(alg a, alg b, alg c, alg d) {
   public ftp(alg $$0, alg $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public ftp(alg $$0, alg $$1, alg $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public alg a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
