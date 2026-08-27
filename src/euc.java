public record euc(aew a, aew b, aew c, aew d) {
   public euc(aew $$0, aew $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public euc(aew $$0, aew $$1, aew $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public aew a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
