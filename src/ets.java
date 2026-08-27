public record ets(aer a, aer b, aer c, aer d) {
   public ets(aer $$0, aer $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public ets(aer $$0, aer $$1, aer $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public aer a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
