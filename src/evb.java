public record evb(foh a, foh b, foh c) {
   public static evb a(aeu $$0) {
      return new evb(foh.t($$0), foh.x($$0), foh.v($$0));
   }

   public static evb b(aeu $$0) {
      return new evb(foh.s($$0), foh.w($$0), foh.u($$0));
   }

   public foh a(ery.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
