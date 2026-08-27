public record evb(foi a, foi b, foi c) {
   public static evb a(aez $$0) {
      return new evb(foi.t($$0), foi.x($$0), foi.v($$0));
   }

   public static evb b(aez $$0) {
      return new evb(foi.s($$0), foi.w($$0), foi.u($$0));
   }

   public foi a(erx.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
