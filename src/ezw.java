public record ezw(fto a, fto b, fto c) {
   public static ezw a(ahg $$0) {
      return new ezw(fto.u($$0), fto.y($$0), fto.w($$0));
   }

   public static ezw b(ahg $$0) {
      return new ezw(fto.t($$0), fto.x($$0), fto.v($$0));
   }

   public fto a(ewr.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
