public record ezv(ftn a, ftn b, ftn c) {
   public static ezv a(ahg $$0) {
      return new ezv(ftn.u($$0), ftn.y($$0), ftn.w($$0));
   }

   public static ezv b(ahg $$0) {
      return new ezv(ftn.t($$0), ftn.x($$0), ftn.v($$0));
   }

   public ftn a(ewq.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
