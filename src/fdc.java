public record fdc(fwy a, fwy b, fwy c) {
   public static fdc a(ajc $$0) {
      return new fdc(fwy.u($$0), fwy.y($$0), fwy.w($$0));
   }

   public static fdc b(ajc $$0) {
      return new fdc(fwy.t($$0), fwy.x($$0), fwy.v($$0));
   }

   public fwy a(ezv.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
