public record flx(alc a, alc b, alc c, alc d) {
   public flx(alc $$0, alc $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public flx(alc $$0, alc $$1, alc $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public alc a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
