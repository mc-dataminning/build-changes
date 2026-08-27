public record evz(agg a, agg b, agg c, agg d) {
   public evz(agg $$0, agg $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public evz(agg $$0, agg $$1, agg $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public agg a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
