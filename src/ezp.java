public record ezp(fth a, fth b, fth c) {
   public static ezp a(ahd $$0) {
      return new ezp(fth.u($$0), fth.y($$0), fth.w($$0));
   }

   public static ezp b(ahd $$0) {
      return new ezp(fth.t($$0), fth.x($$0), fth.v($$0));
   }

   public fth a(ewk.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
