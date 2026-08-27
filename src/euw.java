public record euw(foc a, foc b, foc c) {
   public static euw a(aer $$0) {
      return new euw(foc.t($$0), foc.x($$0), foc.v($$0));
   }

   public static euw b(aer $$0) {
      return new euw(foc.s($$0), foc.w($$0), foc.u($$0));
   }

   public foc a(ert.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
