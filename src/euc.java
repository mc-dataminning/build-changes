public record euc(aex a, aex b, aex c, aex d) {
   public euc(aex $$0, aex $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public euc(aex $$0, aex $$1, aex $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public aex a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
